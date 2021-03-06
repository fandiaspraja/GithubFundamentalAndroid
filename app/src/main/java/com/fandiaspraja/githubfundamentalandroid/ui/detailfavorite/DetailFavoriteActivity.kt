package com.fandiaspraja.githubfundamentalandroid.ui.detailfavorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.fandiaspraja.githubfundamentalandroid.R
import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.ui.FollowPagerAdapter
import com.fandiaspraja.githubfundamentalandroid.core.utils.Constants
import com.fandiaspraja.githubfundamentalandroid.core.utils.PreferenceUtils
import com.fandiaspraja.githubfundamentalandroid.databinding.ActivityDetailFavoriteBinding
import com.fandiaspraja.githubfundamentalandroid.ui.followers.FollowersFragment
import com.fandiaspraja.githubfundamentalandroid.ui.following.FollowingFragment
import kotlinx.android.synthetic.main.activity_detail_favorite.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFavoriteActivity : AppCompatActivity() {


    private val TAG = "DetailFavoriteActivity"

    private val USE_BUNDLED_EMOJI = true

    private val detailFavoriteViewModel: DetailFavoriteViewModel by viewModel()

    private lateinit var binding: ActivityDetailFavoriteBinding

    var username: String? = null
    var type: String? = null
    var id: Int? = null

    lateinit var preferenceUtils: PreferenceUtils

    lateinit var followPagerAdapter: FollowPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFavoriteBinding.inflate(layoutInflater)
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

        followPagerAdapter = FollowPagerAdapter(this.supportFragmentManager, this)
        binding.pagerFollow.adapter = followPagerAdapter

        binding.tabFollow.setupWithViewPager(binding.pagerFollow)


    }


    fun getDetailFavoriteOffline(idFav: Int){
        progress_detail_fav.visibility = View.VISIBLE
        detailFavoriteViewModel.findUsergithub(idFav)
    }

    fun observeDetailUserOffline(){
        detailFavoriteViewModel.responseFavorite.observe(this, {detail ->
            if (detail.data != null){
                when(detail){
                    is Resource.Loading -> {
                        progress_detail_fav.visibility = View.VISIBLE

                    }
                    is Resource.Success -> {

                        Glide
                            .with(applicationContext)
                            .load(detail.data.avatar_url)
                            .centerCrop()
                            .into(img_user_favorite)

                        tv_name_detail.setText(detail.data.login)

                        tv_bio_fav.text = detail.data.bio
                        tv_val_followers_fav.text = detail.data.followers.toString()
                        tv_val_following_fav.text = detail.data.following.toString()
                        tv_valname_fav.text = detail.data.name
                        tv_valcompany_fav.text = detail.data.company.toString()
                        tv_valblog_fav.text = detail.data.blog
                        tv_valloc_fav.text = detail.data.location.toString()
                        tv_valemail_fav.text = detail.data.email
                        tv_valtwit_fav.text = detail.data.twitter_username.toString()

                        btnRemoveFavorite.setOnClickListener {
                            detailFavoriteViewModel.deleteUsergithubByid(detail.data.id!!)
                            detailFavoriteViewModel.deleteFollowers(id!!)
                            detailFavoriteViewModel.deleteFollowings(id!!)
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
        detailFavoriteViewModel.getDetailUser(user, Constants.API_KEY)
    }

    fun observeDetailUser(){
        detailFavoriteViewModel.response.observe(this, {detail ->
            if (detail.data != null){
                when(detail){
                    is Resource.Loading -> {
                        progress_detail_fav.visibility = View.VISIBLE

                    }
                    is Resource.Success -> {

                        Glide
                            .with(applicationContext)
                            .load(detail.data.avatar_url)
                            .centerCrop()
                            .into(img_user_favorite)

                        tv_name_detail.setText(detail.data.login)

                        tv_bio_fav.text = detail.data.bio
                        tv_val_followers_fav.text = detail.data.followers.toString()
                        tv_val_following_fav.text = detail.data.following.toString()
                        tv_valname_fav.text = detail.data.name
                        tv_valcompany_fav.text = detail.data.company.toString()
                        tv_valblog_fav.text = detail.data.blog
                        tv_valloc_fav.text = detail.data.location.toString()
                        tv_valemail_fav.text = detail.data.email
                        tv_valtwit_fav.text = detail.data.twitter_username.toString()

                        var userDetail = detail.data

                        btnRemoveFavorite.setOnClickListener {
                            detailFavoriteViewModel.insertUserFavorite(userDetail)

                            detailFavoriteViewModel.insertFollowers(id!!, (followPagerAdapter.getItem(0) as FollowersFragment).followersList)
                            detailFavoriteViewModel.insertFollowing(id!!, (followPagerAdapter.getItem(1) as FollowingFragment).followingList)

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