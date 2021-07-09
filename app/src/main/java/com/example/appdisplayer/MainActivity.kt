package com.example.appdisplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontactdisplay:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appDisplay()
    }
    fun appDisplay(){
        var contactList= listOf<Contact>(
            Contact("Ayugi","ayugisophiaangela@gmail.com","0758183543"),
            Contact("Sophia","sophiaange@gmail.com","0721844345"),
            Contact("Angela","ayugiangela@gmail.com","0721565530")
        )
        rvcontactdisplay=findViewById(R.id.rvcontactdisplay)
        var contactAdapter=ContactRvAdopter(contactList)
        rvcontactdisplay.layoutManager=LinearLayoutManager(baseContext)
        rvcontactdisplay.adapter=contactAdapter
    }
}