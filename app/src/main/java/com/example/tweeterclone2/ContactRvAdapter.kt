package com.example.tweeterclone2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.tweeterclone2.databinding.ContactListItemBinding

class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.tvDisplayName.text=currentContact.toString()
        binding.tvPhoneNumber.text=currentContact.toString()
        binding.tvEmailAddress.text =currentContact.toString()
    }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)