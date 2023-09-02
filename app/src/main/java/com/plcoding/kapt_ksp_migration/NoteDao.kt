package com.plcoding.kapt_ksp_migration

import androidx.room.Dao
import androidx.room.Query
import com.plcoding.kapt_ksp_migration.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getAllNotes(): Flow<List<Note>>
}