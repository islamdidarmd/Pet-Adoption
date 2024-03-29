/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.details.PetDetailsScreen
import com.example.androiddevchallenge.ui.listing.PetListingScreen
import com.example.androiddevchallenge.ui.navigation.Screen
import com.example.androiddevchallenge.ui.theme.PetAdoptionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetAdoptionTheme {
                PetAdoptionApp()
            }
        }
    }
}

@Composable
fun PetAdoptionApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            PetListingScreen(navController)
        }
        composable(
            route = "${Screen.Details.route}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) {
            PetDetailsScreen(navController, it.arguments?.getInt("id") ?: 0)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PetAdoptionTheme {
        PetAdoptionApp()
    }
}

/*@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PetAdoptionTheme(darkTheme = true) {
        PetAdoptionApp()
    }
}*/
