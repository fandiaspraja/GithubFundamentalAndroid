package com.fandiaspraja.githubfundamentalandroid.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.ui.FollowPagerAdapter
import com.fandiaspraja.core.utils.Constants
import com.fandiaspraja.core.utils.PreferenceUtils
import com.fandiaspraja.githubfundamentalandroid.R
import com.fandiaspraja.githubfundamentalandroid.databinding.ActivityDetailUserBinding
import com.fandiaspraja.githubfundamentalandroid.ui.followers.FollowersFragment
import com.fandiaspraja.githubfundamentalandroid.ui.following.FollowingFragment
import kotlinx.android.synthetic.main.activity_detail_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailUserActivity : AppCompatActivity() {

    private val TAG = "DetailUserActivity"

    private val USE_BUNDLED_EMOJI = true

    private val detailUserViewModel: DetailUserViewModel  by viewModel()

    private lateinit var binding: ActivityDetailUserBinding

    var username: String? = null
    var type: String? = null
    var id: Int? = null

    lateinit var preferenceUtils: PreferenceUtils

    lateinit var followPagerAdapter: FollowPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferenceUtils = PreferenceUtils(this)

        if (preferenceUtils.getValueBoolean("theme", false)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        progress_detail_fav.visibility = View.GONE

        if (intent.extras != null){
            username = intent.getStringExtra("username")
            type = intent.getStringExtra("type")
            id = intent.getIntExtra("id", 0)

            if (type.equals("online")){
                setStatusFavorite(false)
                username?.let { getDetailFavorite(it) }
                observeDetailUser()
            }else{
                setStatusFavorite(true)
                id?.let { getDetailFavoriteOffline(it) }
                observeDetailUserOffline()
            }

        }

        val pages = listOf(
            FollowersFragment(),
            FollowingFragment()
        )

        followPagerAdapter = FollowPagerAdapter(this.supportFragmentManager, this, pages)
        binding.pagerFollow.adapter = followPagerAdapter

        binding.tabFollow.setupWithViewPager(binding.pagerFollow)
    }


    fun getDetailFavoriteOffline(idFav: Int){
        progress_detail_fav.visibility = View.VISIBLE
        detailUserViewModel.findUsergithub(idFav)
    }

    fun observeDetailUserOffline(){
        detailUserViewModel.responseFavorite.observe(this, {detail ->
            if (detail.data != null){
                when(detail){
                    is Resource.Loading -> {
                        progress_detail_fav.visibility = View.VISIBLE

                    }
                    is Resource.Success -> {

                        Glide
                            .with(applicationContext)
                            .load(detail.data?.avatar_url)
                            .centerCrop()
                            .into(img_user_favorite)

                        tv_name_detail.setText(detail.data?.login)

                        tv_bio_fav.text = detail.data?.bio
                        tv_val_followers_fav.text = detail.data?.followers.toString()
                        tv_val_following_fav.text = detail.data?.following.toString()
                        tv_valname_fav.text = detail.data?.name
                        tv_valcompany_fav.text = detail.data?.company.toString()
                        tv_valblog_fav.text = detail.data?.blog
                        tv_valloc_fav.text = detail.data?.location.toString()
                        tv_valemail_fav.text = detail.data?.email
                        tv_valtwit_fav.text = detail.data?.twitter_username.toString()

                        btnRemoveFavorite.setOnClickListener {
                            detailUserViewModel.deleteUsergithubByid(detail.data?.id!!)
                            detailUserViewModel.deleteFollowers(id!!)
                            detailUserViewModel.deleteFollowings(id!!)
                            finish()
                        }

                        progress_detail_fav.visibility = View.GONE
                    }
                    is Resource.Error -> {

                        progress_detail_fav.visibility = View.GONE

                    }
                }
            }
        })
    }


    fun getDetailFavorite(user: String){
        progress_detail_fav.visibility = View.VISIBLE
        detailUserViewModel.getDetailUser(user, Constants.API_KEY)
    }

    fun observeDetailUser(){
        detailUserViewModel.response.observe(this, {detail ->
            if (detail.data != null){
                when(detail){
                    is Resource.Loading -> {
                        progress_detail_fav.visibility = View.VISIBLE

                    }
                    is Resource.Success -> {

                        Glide
                            .with(applicationContext)
                            .load(detail.data?.avatar_url)
                            .centerCrop()
                            .into(img_user_favorite)

                        tv_name_detail.setText(detail.data?.login)

                        tv_bio_fav.text = detail.data?.bio
                        tv_val_followers_fav.text = detail.data?.followers.toString()
                        tv_val_following_fav.text = detail.data?.following.toString()
                        tv_valname_fav.text = detail.data?.name
                        tv_valcompany_fav.text = detail.data?.company.toString()
                        tv_valblog_fav.text = detail.data?.blog
                        tv_valloc_fav.text = detail.data?.location.toString()
                        tv_valemail_fav.text = detail.data?.email
                        tv_valtwit_fav.text = detail.data?.twitter_username.toString()

                        var userDetail = detail.data

                        btnRemoveFavorite.setOnClickListener {
                            userDetail?.let { it1 -> detailUserViewModel.insertUserFavorite(it1) }

                            detailUserViewModel.insertFollowers(id!!, (followPagerAdapter.getItem(0) as FollowersFragment).followersList)
                            detailUserViewModel.insertFollowing(id!!, (followPagerAdapter.getItem(1) as FollowingFragment).followingList)

                            finish()
                        }


                        progress_detail_fav.visibility = View.GONE
                    }
                    is Resource.Error -> {

                        progress_detail_fav.visibility = View.GONE

                    }
                }
            }
        })
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite == false) {
            btnRemoveFavorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_fav_uncheck))
        } else {
            btnRemoveFavorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_fav_check))
        }
    }
}