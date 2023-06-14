package com.example.tweeterclone2

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.tweeterclone2.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator

class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ContactList.size
    }
//    override fun onResume() {
//        super.onResume()
//        displayContacts()
//        binding.btnFloating.setOnClickListener {
//            val intent = Intent(this,AddContacts::class.java)
//            startActivity(intent)
//        }
//    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var currentContact = ContactList.get(position)
        var binding = holder.binding
        binding.ivAvator.tag=currentContact.avatar
        binding.tvDisplayName.text = currentContact.displayName
        binding.tvPhoneNumber.text = currentContact.phoneNumber
        binding.tvEmailAddress.text = currentContact.emailAddress

        binding.btnAdd.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            holder.itemView.context.startActivity(intent)
        }
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(280, 280)
            .centerCrop()
            .into(binding.ivAvator)
//        binding.btnAdd.setOnClickListener {
//            val intent = Intent(this,MainActivity2::class.java)
//          b(intent)
//        }
    }







    class ContactViewHolder(var binding: ContactListItemBinding) : ViewHolder(binding.root)
}

