package com.example.homework19_1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.homework19_1.databinding.FragmentFirstBinding
import com.google.android.material.tabs.TabLayoutMediator


class FirstFragment : Fragment() {
    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val list = listOf<DateClass>(
            DateClass(R.drawable.img1,"Xush kelibsiz","Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘" +
                    "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"),
            DateClass(R.drawable.img2,"Hikoyalar dunyosi","Gar zamonni nayf qilsam ayb qilma, ey rafiq" +
                    "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "),
            DateClass(R.drawable.img3,"Kitob ortidan..","Dilrabolardin yomonliq keldi mahzun ko‘ngluma" +
                    " Kelmadi jonimg'a hech oromi jondin yaxshilig'."),
            DateClass(R.drawable.img4,"Bizga qo`shiling","Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p" +
                    " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?")
        )

        val customViewPager = CustomViewPager(context as MainActivity, list)
        binding.viewPager2.adapter= customViewPager

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){ _, _ ->
        }.attach()
        binding.StartMessage.setOnClickListener{
            Toast.makeText(context,"Start Message",Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}