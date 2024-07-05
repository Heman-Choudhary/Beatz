package com.example.Beatz.data.remote

import com.example.Beatz.data.entities.Song
import com.example.Beatz.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDatabase {
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> = try {
        songCollection.get().await().toObjects(Song::class.java)
    } catch (e: Exception) {
        emptyList()
    }
}