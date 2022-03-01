package com.fandiaspraja.githubfundamentalandroid.ui.followers

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.githubfundamentalandroid.R
import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.Followers
import com.fandiaspraja.githubfundamentalandroid.core.ui.FollowersAdapter
import com.fandiaspraja.githubfundamentalandroid.core.utils.Constants
import com.fandiaspraja.githubfundamentalandroid.databinding.FragmentFollowersBinding
import com.fandiaspraja.githubfundamentalandroid.ui.detailfavorite.DetailFavoriteActivity
import kotlinx.android.synthetic.main.fragment_followers.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FollowersFragment : Fragment() {

    private var _binding: FragmentFollowersBinding? = null

    private val binding get() = _binding!!

    private val followersViewModel: FollowersViewModel by viewModel()

    val followersAdapter = FollowersAdapter()

    var followersList = ArrayList<Followers>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFollowersBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if ((activity as DetailFavoriteActivity).type.equals("online")){
            (activity as DetailFavoriteActivity).username?.let { getFollowers(it) }

            observeFollowersUser()
        }else{
            (activity as DetailFavoriteActivity).id?.let { getAllFollowers(it) }

            observegetAllFollowers()
        }


        followersAdapter.onItemClick = { selectedData ->

        }


        with(binding.rvFollowers){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = followersAdapter
        }
    }

    fun getFollowers(user: String){
        progress_followers.visibility = View.VISIBLE
        followersViewModel.getFollowers(user, "1", Constants.API_KEY)
    }

    fun observeFollowersUser(){
        followersViewModel.response.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_followers.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            users.data?.let { followersList.addAll(it) }

                            followersAdapter.setData(users.data)

                            progress_followers.visibility = View.GONE

                        }
                        is Resource.Error -> {
                            progress_followers.visibility = View.GONE
                        }
                    }
                }else{
                    progress_followers.visibility = View.GONE
                }
            }
        })
    }

    fun getAllFollowers(id: Int){
        progress_followers.visibility = View.VISIBLE
        followersViewModel.getAllFollowers(id)
    }

    fun observegetAllFollowers(){
        followersViewModel.responseFollowersEntity.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_followers.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            followersAdapter.setData(users.data)

                            progress_followers.visibility = View.GONE

                        }
                        is Resource.Error -> {
                            progress_followers.visibility = View.GONE
                        }
                    }
                }else{
                    progress_followers.visibility = View.GONE
                }
            }
        })
    }

}