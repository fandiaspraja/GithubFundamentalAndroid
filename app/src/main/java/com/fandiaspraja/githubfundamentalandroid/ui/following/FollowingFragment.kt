package com.fandiaspraja.githubfundamentalandroid.ui.following

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.ui.FollowingAdapter
import com.fandiaspraja.core.utils.Constants
import com.fandiaspraja.githubfundamentalandroid.databinding.FragmentFollowingUserBinding
import com.fandiaspraja.githubfundamentalandroid.ui.detail.DetailUserActivity
import kotlinx.android.synthetic.main.fragment_following_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class FollowingFragment : Fragment() {

    private var _binding: FragmentFollowingUserBinding? = null

    private val binding get() = _binding!!

    private val followingViewModel: FollowingViewModel by viewModel()

    private val followingAdapter = FollowingAdapter()

    var followingList = ArrayList<Following>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFollowingUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if ((activity as DetailUserActivity).type.equals("online")){

            (activity as DetailUserActivity).username?.let { getFollowings(it) }
            observeFollowingUser()
        }else{
            (activity as DetailUserActivity).id?.let { getAllFollowing(it) }

            observeAllFollowing()
        }

        followingAdapter.onItemClick = { selectedData ->

        }


        with(binding.rvFollowing){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = followingAdapter
        }
    }

    fun getFollowings(user: String){
        progress_following.visibility = View.VISIBLE
        followingViewModel.getFollowings(user, "1", Constants.API_KEY)
    }

    fun observeFollowingUser(){
        followingViewModel.response.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_following.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            users.data?.let { followingList.addAll(it) }

                            followingAdapter.setData(users.data)

                            progress_following.visibility = View.GONE

                        }
                        is Resource.Error -> {
                            progress_following.visibility = View.GONE
                        }
                    }
                }else{
                    progress_following.visibility = View.GONE
                }
            }
        })
    }

    fun getAllFollowing(id: Int){
        progress_following.visibility = View.VISIBLE
        followingViewModel.getAllFollowing(id)
    }

    fun observeAllFollowing(){
        followingViewModel.responseFollowingEntity.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_following.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            followingAdapter.setData(users.data)

                            progress_following.visibility = View.GONE

                        }
                        is Resource.Error -> {
                            progress_following.visibility = View.GONE
                        }
                    }
                }else{
                    progress_following.visibility = View.GONE
                }
            }
        })
    }

}