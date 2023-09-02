package com.plcoding.kapt_ksp_migration

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

    fun helloWorld() {
        println("Hello world!")
    }
}