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
            Contact("Ayugi","ayugisophiaangela@gmail.com","0758183543","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRPrznFhLNyIHC95c1Pv9OgJvDSNDx-c-mSziBUljVlfLNqsPnPTneyjAnmy4L9s9_u7fVOeg19So&usqp=CAU"),
            Contact("Irine","irine@gmail.com","0721844345","https://live.staticflickr.com/65535/49171337678_55c55a45b8_b.jpg"),
            Contact("Abeid","abeid@gmail.com","0735678954","https://images.unsplash.com/photo-1544005313-94ddf0286df2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8cGVyc29ufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80"),
            Contact("Laura","laura@gmail.com","0721565530","https://i.redd.it/qmg3yid0im271.jpg"),
            Contact("Brawlian","brawlian@gmail.com","0721569876","https://static.wixstatic.com/media/8fe441_8638d24c21a247f6967ba4657ccab21f~mv2.jpg/v1/fill/w_570,h_428,al_c,q_90/8fe441_8638d24c21a247f6967ba4657ccab21f~mv2.jpg"),
            Contact("Grace","grace@gmail.com","07214356789","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Prime_Minister_of_Finland_Sanna_Marin_2019_%28cropped%29.jpg/1200px-Prime_Minister_of_Finland_Sanna_Marin_2019_%28cropped%29.jpg")
        )
        rvcontactdisplay=findViewById(R.id.rvcontactdisplay)
        var contactAdapter=ContactRvAdopter(contactList,baseContext)
        rvcontactdisplay.layoutManager=LinearLayoutManager(baseContext)
        rvcontactdisplay.adapter=contactAdapter
    }
}