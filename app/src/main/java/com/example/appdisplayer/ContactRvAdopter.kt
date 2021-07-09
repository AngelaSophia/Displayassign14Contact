package com.example.appdisplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactRvAdopter (var contactlist:List<Contact>) :RecyclerView.Adapter<ContactViewHolder>(){
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
    }

    override fun getItemCount(): Int {
        return contactlist.size

    }

}

class ContactViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}