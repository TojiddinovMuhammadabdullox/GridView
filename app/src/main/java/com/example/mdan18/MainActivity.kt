package com.example.mdan18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mdan18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imagelist = arrayListOf<Int>(
        R.drawable.apple,
        R.drawable.apple,
        R.drawable.apricot,
        R.drawable.apricot,
        R.drawable.banan,
        R.drawable.banan,
        R.drawable.peach,
        R.drawable.peach,
        R.drawable.uzum,
        R.drawable.uzum,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GalleryAdapter(context = this,imagelist )

        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "$position tanlandi", Toast.LENGTH_SHORT).show()
        }
    }
}