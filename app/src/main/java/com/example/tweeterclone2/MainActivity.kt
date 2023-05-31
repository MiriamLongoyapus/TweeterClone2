package com.example.tweeterclone2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tweeterclone2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactData("ivAvator","Miriam","0789564352","angela@gmail.com")
        val contact2=ContactData("ivAvator","Miriam","0789564352","angela@gmail.com")
        val contact3=ContactData("ivAvator","Miriam","0789564352","angela@gmail.com")
        val contact4=ContactData("ivAvator","Miriam","0789564352","angela@gmail.com")
        val contact5=ContactData("ivAvator","Miriam","0789564352","angela@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=contactAdapter
    }
}

