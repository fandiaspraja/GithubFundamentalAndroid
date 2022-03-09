package com.fandiaspraja.githubfundamentalandroid.ui.followers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.ui.FollowersAdapter
import com.fandiaspraja.core.utils.Constants
import com.fandiaspraja.githubfundamentalandroid.databinding.FragmentFollowersUserBinding
import com.fandiaspraja.githubfundamentalandroid.ui.detail.DetailUserActivity
import kotlinx.android.synthetic.main.fragment_followers_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FollowersFragment : Fragment() {

    private var _binding: FragmentFollowersUserBinding? = null

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
        _binding = FragmentFollowersUserBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if ((activity as   DetailUserActivity).type.equals("online")){
            (activity as DetailUserActivity).username?.let { getFollowers(it) }

            observeFollowersUser()
        }else{
            (activity as DetailUserActivity).id?.let { getAllFollowers(it) }

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