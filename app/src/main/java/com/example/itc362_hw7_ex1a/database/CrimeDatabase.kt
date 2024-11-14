package com.example.itc362_hw7_ex1a.database

import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.itc362_hw7_ex1a.Crime
import androidx.room.Database as Database1


@Database1(entities = [Crime:: class], version=1)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase: RoomDatabase() {
    abstract fun crimeDAO(): CrimeDao


}