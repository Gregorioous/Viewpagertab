package com.example.viewpagertab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagertab.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding?.root)


        binding?.slider?.adapter = MoviesAdapter(this)

        val tabLayoutMediator = binding?.tabSlider?.let {
            binding?.slider?.let { it1 ->
                TabLayoutMediator(it,
                    it1,
                    TabLayoutMediator.TabConfigurationStrategy { tab, position ->

                        when(position){
                            0 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.Shreck_forevermore)
                            }
                            1 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.dumb1)
                            }
                            2 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.borat1)
                            }
                            3 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.Transcendance)
                            }

                            }





                    })
            }
        }
        tabLayoutMediator?.attach()

    }
}
