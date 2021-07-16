package com.example.appdisplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ContactDetailsActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_list_nam)
        var  name= intent.getStringExtra("Name")
        Toast.makeText(baseContext,name, Toast.LENGTH_LONG).show()
    }
}