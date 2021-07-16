package com.example.appdisplayer

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class ContactRvAdopter (var contactlist:List<Contact> , var context:Context) :RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_nam,parent,false)
        return  ContactViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactlist.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvEmail.text=currentContact.Email
        holder.tvPhoneNumber.text=currentContact.PhoneNumber
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivContact)

        holder.cvContact.setOnClickListener {
            var intent= Intent(context, ContactDetailsActivity::class.java)
            intent.putExtra("NAME" ,currentContact.Name)
            context.startActivity(intent)
        }
        holder.ivContact.setOnClickListener {
            Toast.makeText(context,"you have clicked",Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return contactlist.size

    }

}

class ContactViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var ivContact=itemView.findViewById<ImageView>(R.id.image)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)
}


