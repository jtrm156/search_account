package com.example.homework2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val profileList : ArrayList<Profiles>) :
    RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder
    {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_sub,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.profile.setImageResource(profileList.get(position).profile)
        holder.account.text = profileList.get(position).account
        holder.account_list.text = profileList.get(position).account_list
        holder.date.text = profileList.get(position).date
    }

    override fun getItemCount() : Int {
        return profileList.size
    }


    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<ImageView>(R.id.item_image)
        val account = itemView.findViewById<TextView>(R.id.item_txt1)
        val account_list = itemView.findViewById<TextView>(R.id.item_txt2)
        val date = itemView.findViewById<TextView>(R.id.item_txt3)
    }

}