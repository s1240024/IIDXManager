package com.example.iidxmanager.activity

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.iidxmanager.R
import com.example.iidxmanager.adapter.SongAdapter
import com.example.iidxmanager.entity.Song

class SongListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_list)

        val listView = findViewById<ListView>(R.id.dataBinding)

        // 適当にデータを作成
        val songList = mutableListOf<Song>(
            Song(1, "B4U", "SPEED RAVE", "NAOKI"),
            Song(2, "Feedback", "BREAK BEATS", "Audio Highs"),
            Song(3, "Flash Back 90's", "MEGA MIX", "kors k as disconations")
        )

        listView.adapter = SongAdapter(this, songList)
    }
}
