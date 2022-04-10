package com.example.financialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.financialapp.home.HomeFragment
import com.example.financialapp.profile.ProfileFragment
import com.example.financialapp.settings.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome : Button
    private lateinit var btnProfile : Button
    private lateinit var btnSettings : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profil)
        btnSettings = findViewById(R.id.btn_settings)
    btnHome.setOnClickListener {
        loadFragment(HomeFragment())
    }
    btnProfile.setOnClickListener{
    loadFragment(ProfileFragment())
    }
    btnSettings.setOnClickListener{
        loadFragment(SettingsFragment())
    }
    }
    private fun loadFragment (fragment : Fragment){
    supportFragmentManager.beginTransaction()
        .replace(R.id.container, fragment)
        .commitNow()
    }
}