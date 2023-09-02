package com.plcoding.kapt_ksp_migration

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.kapt_ksp_migration.Note
import com.plcoding.kapt_ksp_migration.NoteDao

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao
}