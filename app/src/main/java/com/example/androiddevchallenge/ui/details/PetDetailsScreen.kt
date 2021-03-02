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
package com.example.androiddevchallenge.ui.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.data.getDemoPetList
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetDetailsScreen(navController: NavController, petId: Int) {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            val pet = getDemoPetList()[petId]
            Card {
                CoilImage(
                    fadeIn = true,
                    data = pet.image,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = "Icon"
                )
                Icon(
                    modifier = Modifier
                        .padding(24.dp)
                        .clickable {
                            navController.popBackStack()
                        },
                    painter = painterResource(id = R.drawable.ic_arrow_back_ios_24),
                    contentDescription = "Icon Back",
                    tint = Color.White
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Text(text = pet.title, style = typography.h6)

                Text(text = pet.center, style = typography.caption)
                Text(text = pet.location, style = typography.caption)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                    }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier
                                .height(18.dp)
                                .width(18.dp),
                            painter = painterResource(id = R.drawable.ic_location_24),
                            contentDescription = "Map Direction",
                            tint = Color.White
                        )
                        Text(
                            modifier = Modifier.padding(start = 8.dp),
                            text = "Map Direction",
                            fontSize = 14.sp
                        )
                    }
                }

                Button(
                    modifier = Modifier.padding(
                        start = 12.dp
                    ),
                    onClick = {
                    }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier
                                .height(18.dp)
                                .width(18.dp),
                            painter = painterResource(id = R.drawable.ic_call_24),
                            contentDescription = "Map Direction",
                            tint = Color.White
                        )
                        Text(
                            modifier = Modifier.padding(start = 8.dp),
                            text = "Adopt Now",
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PetDetailsScreen(rememberNavController(), 0)
}
