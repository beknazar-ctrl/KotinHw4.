package com.example.kotinhw4.ui.activitys

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotinhw4.ui.fragments.FirstFragment
import com.example.kotinhw4.ui.fragments.SecondFragment
import com.example.kotinhw4.ui.fragments.ThirstFragment

class ViewPagerAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }
    override fun createFragment(position: Int): Fragment {
       return when (position){
          0 -> FirstFragment()
          1 -> SecondFragment()
          2 -> ThirstFragment()
           else->FirstFragment()
       }
    }
}