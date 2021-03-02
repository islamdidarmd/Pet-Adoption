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
package com.example.androiddevchallenge.ui.listing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.data.getDemoPetList
import com.example.androiddevchallenge.ui.navigation.Screen
import com.example.androiddevchallenge.ui.theme.lightGray
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetListingScreen(navController: NavHostController) {
    Surface {
        Column(modifier = Modifier.background(lightGray)) {
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp, top = 24.dp, bottom = 24.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu_24),
                    tint = Color.Black,
                    contentDescription = "Menu"
                )

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        style = typography.caption,
                        text = "Location"
                    )

                    Row(
                        modifier = Modifier.padding(top = 2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier
                                .height(16.dp)
                                .width(16.dp),
                            painter = painterResource(id = R.drawable.ic_location_24),
                            tint = androidx.compose.ui.graphics.Color.Blue,
                            contentDescription = "Location"
                        )
                        Text(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            text = "Melbourn, Australia"
                        )
                    }
                }

                CoilImage(
                    modifier = Modifier
                        .clip(CircleShape)
                        .height(32.dp)
                        .width(32.dp),
                    data = "https://api.multiavatar.com/Aphex.png",
                    contentDescription = "Profile Picture",
                )
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(color = MaterialTheme.colors.background)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .padding(top = 12.dp)
                ) {
                    val list = getDemoPetList()
                    items(list.count()) { index ->
                        PetListingRowItem(list[index]) {
                            navController.navigate("${Screen.Details.route}/$index")
                        }
                    }
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetListingScreenPreview() {
    PetListingScreen(rememberNavController())
}
