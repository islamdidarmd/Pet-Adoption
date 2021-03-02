package com.example.androiddevchallenge.ui.listing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.typography


@Composable
fun PetListingScreen() {
    Surface {
        Column(modifier = Modifier.background(Color(0xFFD6E4F1))) {
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

                Icon(
                    painter = painterResource(id = R.drawable.ic_account_circle_24),
                    contentDescription = "Profile Picture",
                    tint = Color.Black
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
                    items(20) { item ->
                        PetListingRowItem()
                    }
                }
            }
        }
    }
}


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetListingScreenPreview() {
    PetListingScreen()
}