package com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.ui.UserAdapter
import com.fandiaspraja.core.utils.Constants
import com.fandiaspraja.githubfundamentalandroid.databinding.FragmentSearchBinding
import com.fandiaspraja.githubfundamentalandroid.ui.detail.DetailUserActivity
import kotlinx.android.synthetic.main.fragment_search.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null

    private val binding get() = _binding!!

    private val searchViewModel: SearchViewModel by viewModel()

    val userAdapter = UserAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progress_search_fav.visibility = View.GONE

        userAdapter.onItemClick = { selectedData ->
//            val uri = Uri.parse("github://favorite")
//            startActivity(Intent(Intent.ACTION_VIEW, uri))

            val intent = Intent(requireActivity(), DetailUserActivity::class.java)
            intent.putExtra("username", selectedData.login)
            intent.putExtra("type", "online")
            intent.putExtra("id", selectedData.id)
            startActivity(intent)
        }


        with(binding.rvSearch){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = userAdapter
        }

        observeSearchUser()


        searchUserView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchUser(query!!)
                return true
            }

            override fun onQueryTextChange(query: String?): Boolean {
//                searchUser(query!!)
                return true
            }

        })

    }

    fun searchUser(user: String){
        progress_search_fav.visibility = View.VISIBLE
        searchViewModel.searchUsers(user, "1", Constants.API_KEY)
    }

    fun observeSearchUser(){
        searchViewModel.response.observe(viewLifecycleOwner, {users ->
            if (users != null){
                if (users.data?.size != 0){
                    when(users){
                        is Resource.Loading -> {
                            progress_search_fav.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {

                            userAdapter.setData(users.data)

                            progress_search_fav.visibility = View.GONE

                        }
                        is Resource.Error -> {
                            progress_search_fav.visibility = View.GONE
                        }
                    }
                }
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}