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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Pet
import com.example.androiddevchallenge.data.getDemoPetList
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetListingRowItem(pet: Pet, onClicked: () -> Unit) {
    Card(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable {
                onClicked()
            }
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                fadeIn = true,
                data = pet.image,
                modifier = Modifier
                    .height(110.dp)
                    .width(110.dp)
                    .clip(RoundedCornerShape(12)),
                contentScale = ContentScale.FillBounds,
                contentDescription = "Icon"
            )

            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(style = typography.subtitle2, text = pet.title)
                Text(
                    style = typography.caption,
                    text = pet.center
                )

                Row(
                    modifier = Modifier.padding(top = 8.dp),
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
                    Text(style = typography.subtitle1, text = pet.location)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(fontSize = 14.sp, text = "View Map", color = Color.Blue)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetListingRowPreview() {
    PetListingRowItem(getDemoPetList()[0]) {
    }
}
