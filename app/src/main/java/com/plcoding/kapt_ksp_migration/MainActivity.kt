package com.plcoding.kapt_ksp_migration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.plcoding.kapt_ksp_migration.ui.theme.KaptKSPMigrationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.helloWorld()
        setContent {
            KaptKSPMigrationTheme {

            }
        }
    }
}