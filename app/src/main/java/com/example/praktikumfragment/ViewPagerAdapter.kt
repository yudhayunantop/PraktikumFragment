package com.example.praktikumfragment
import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //get fragment
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> FirstFragment.newInstance()
            1 -> SecondFragment.newInstance()
            else -> ThirdFragment.newInstance()
        }
    }

    // get judul page
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }

    //get jumlah fragment
    override fun getCount(): Int {
        return 3
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1,
            R.string.tab_text_2, R.string.tab_text_3)
    }
}
