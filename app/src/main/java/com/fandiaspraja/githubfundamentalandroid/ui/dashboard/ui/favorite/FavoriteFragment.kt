package com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.favorite

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.ui.UserAdapter
import com.fandiaspraja.githubfundamentalandroid.databinding.FragmentFavoriteBinding
import com.fandiaspraja.githubfundamentalandroid.ui.detailfavorite.DetailFavoriteActivity
import kotlinx.android.synthetic.main.fragment_favorite.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteFragment : Fragment() {

    private val favoriteViewModel: FavoriteViewModel by viewModel()

    private var _binding: FragmentFavoriteBinding? = null

    private val binding get() = _binding!!

    val userAdapter = UserAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progress_fav.visibility = View.GONE

        getFavorites()

        observeSearchUser()

        userAdapter.onItemClick = { selectedData ->
            val intent = Intent(requireActivity(), DetailFavoriteActivity::class.java)
            intent.putExtra("username", selectedData.login)
            intent.putExtra("type", "offline")
            intent.putExtra("id", selectedData.id)
            startActivity(intent)
        }


        with(binding.rvFav){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = userAdapter
        }

    }

    override fun onResume() {
        super.onResume()

        getFavorites()

    }

    fun getFavorites(){
        progress_fav.visibility = View.VISIBLE
        favoriteViewModel.findAllUsergithub()
    }
    fun observeSearchUser(){
        favoriteViewModel.response.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_fav.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            userAdapter.setData(users.data)

                            progress_fav.visibility = View.GONE
                        }
                        is Resource.Error -> {
                            progress_fav.visibility = View.GONE
                        }
                    }
                }
            }

            progress_fav.visibility = View.GONE
        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}