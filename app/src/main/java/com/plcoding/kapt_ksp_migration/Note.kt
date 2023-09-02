package com.plcoding.kapt_ksp_migration

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    @PrimaryKey val id: Int = 0
)
