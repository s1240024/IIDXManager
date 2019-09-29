package com.example.iidxmanager.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.iidxmanager.databinding.ActivitySongListBinding
import com.example.iidxmanager.entity.Song

class SongAdapter(private val context: Context, private var songs: List<Song>) : BaseAdapter() {
    private val inflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return songs.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val binding: ActivitySongListBinding?

        if (convertView == null) {
            binding = ActivitySongListBinding.inflate(inflater, parent, false)
            binding.root.tag = binding
        } else {
            binding = convertView.tag as ActivitySongListBinding
        }

        binding?.song = getItem(position) as Song
        return binding?.root
    }

    override fun getItem(position: Int): Any {
        return songs[position]
    }

    override fun getItemId(position: Int): Long {
        return songs[position].id.toLong()
    }
}