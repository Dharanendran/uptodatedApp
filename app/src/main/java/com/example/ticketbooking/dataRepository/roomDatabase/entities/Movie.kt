package com.example.ticketbooking.dataRepository.roomDatabase.entities

import androidx.room.*


@Entity(
    tableName = "movie_table",
)
class Movie(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var movieName: String,
    var language: String,
    var sensorCertificate: String,
    var synopsis: String,
    var genre: String,
    var releaseDate: String,
    var hero: String?,
    var heroine: String?,
    var villain: String?,
    var isFavouriteMovie: Boolean
)