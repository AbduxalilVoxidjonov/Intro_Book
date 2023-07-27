package com.example.homework19_1

import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomViewPager(activity: MainActivity,val list: List<DateClass>): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): SecondFragment {

        return SecondFragment().apply {
            arguments= Bundle().apply {
                val item=list[position]
                putInt("img",item.img)
                putString("title",item.title)
                putString("description",item.description)
            }
        }
    }

}