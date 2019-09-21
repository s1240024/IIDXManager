package com.example.iidxmanager.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class SongAdapter(val context: Context) : BaseAdapter() {
    private val inflater = LayoutInflater.from(context)
    private val songs = mutableListOf<String>()

    override fun getCount(): Int {
        return songs.count()
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        return convertView
    }

    override fun getItem(position: Int): Any {
        return songs[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}