package com.liam.tripleclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.GONE
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TAB_LABEL_VISIBILITY_LABELED
import com.google.android.material.tabs.TabLayout.TAB_LABEL_VISIBILITY_UNLABELED
import com.google.android.material.tabs.TabLayoutMediator
import com.liam.tripleclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        init()

    }

    private fun init() {
        // 1) FragmentStateAdapter 생성 : Fragment 여러개를 ViewPager2에 연결해주는 역할
        val viewpagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        // 2) ViewPager2의 adapter에 설정
        binding.viewpager.adapter = viewpagerFragmentAdapter
        // 3) 시작 Fragment를 TripStartFragment로 설정
        binding.viewpager.setCurrentItem(1, false)
        // 4) TabLayout 연동
        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            when(position) {
                0 -> {
                    tab.text = "국내여행"
                    tab.icon = AppCompatResources.getDrawable(baseContext, R.drawable.tab_icon_1)
                }
                1 -> {
                    tab.text = "여행시작"
                    tab.icon = AppCompatResources.getDrawable(baseContext, R.drawable.tab_icon_2)
                    tab.tabLabelVisibility = TAB_LABEL_VISIBILITY_UNLABELED
                }
                2 -> {
                    tab.text = "해외여행"
                    tab.icon = AppCompatResources.getDrawable(baseContext, R.drawable.tab_icon_3)
                }
            }
        }.attach()

        val onTabLayoutMediator: OnTabSelectedListener = object : OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab == null) return
                tab.tabLabelVisibility = TAB_LABEL_VISIBILITY_UNLABELED
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                if (tab == null) return
                tab.tabLabelVisibility = TAB_LABEL_VISIBILITY_LABELED

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        }
        binding.tabLayout.addOnTabSelectedListener(onTabLayoutMediator)
    }
}