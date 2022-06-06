package com.bignerdranch.android.drawerlayoutandnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.bignerdranch.android.drawerlayoutandnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.open.setOnClickListener {
            binding.drawer.openDrawer(GravityCompat.START)
        }

        binding.navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> {
                    Toast.makeText(
                        this@MainActivity,
                        "You tap on the first option",
                        Toast.LENGTH_SHORT
                    ).show()
                    binding.drawer.closeDrawer(GravityCompat.START)
                }
                R.id.item2 -> Toast.makeText(this@MainActivity,"You tap on the second option",Toast.LENGTH_SHORT).show()
                R.id.item3 -> Toast.makeText(this@MainActivity,"You tap on the third option",Toast.LENGTH_SHORT).show()
                R.id.item4 -> Toast.makeText(this@MainActivity,"You tap on the fourth option",Toast.LENGTH_SHORT).show()
                R.id.item5 -> Toast.makeText(this@MainActivity,"You tap on the fifth option",Toast.LENGTH_SHORT).show()
                R.id.item6 -> Toast.makeText(this@MainActivity,"You tap on the sixth option",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}