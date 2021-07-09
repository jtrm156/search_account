package com.example.homework2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework2.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        if(intent.getStringExtra("data") != "123456"){
           finish()
        }

        val profileList = arrayListOf(
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
            Profiles(R.drawable.icon_user,"12345678912","입금:50000원","2021-07-10"),
        )
        binding.RCSub.adapter = ProfileAdapter(profileList)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}