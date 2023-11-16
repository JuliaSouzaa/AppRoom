package com.example.approomaula.controller

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contato::class],
    version = 1
)

abstract class ContatoDataBase:RoomDatabase() {
    abstract val dao: ContatoDao
}