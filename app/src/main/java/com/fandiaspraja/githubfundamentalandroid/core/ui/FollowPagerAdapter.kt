package com.fandiaspraja.githubfundamentalandroid.core.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.fandiaspraja.githubfundamentalandroid.ui.followers.FollowersFragment
import com.fandiaspraja.githubfundamentalandroid.ui.following.FollowingFragment

class FollowPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentStatePagerAdapter(fm){

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FollowersFragment(),
        FollowingFragment()
        )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        println("size pager ${pages.size}")
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Followers"
            else -> "Following"
        }
    }

}