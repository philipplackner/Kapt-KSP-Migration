package com.plcoding.kapt_ksp_migration

import javax.inject.Inject

class MyRepository @Inject constructor(
    private val dao: NoteDao
) {
}