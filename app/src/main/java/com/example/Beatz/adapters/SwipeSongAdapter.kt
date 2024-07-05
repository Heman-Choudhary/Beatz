package com.example.Beatz.adapters

import androidx.recyclerview.widget.AsyncListDiffer
import com.example.Beatz.R
import com.example.Beatz.databinding.SwipeItemBinding

class SwipeSongAdapter : BaseSongAdapter(R.layout.swipe_item) {
    override val differ = AsyncListDiffer(this, diffCallback)

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        (holder.binding as SwipeItemBinding).apply {
            val text = "${song.title} - ${song.subtitle}"
            tvPrimary.text = text
        }
    }
}