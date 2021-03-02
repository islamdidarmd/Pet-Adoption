package com.example.androiddevchallenge.ui.listing

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetListingRowItem() {
    Card(modifier = Modifier
        .wrapContentHeight()
        .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
        .clip(RoundedCornerShape(8.dp))
        .clickable {
            //todo on pet click
        }) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                fadeIn = true,
                data = "https://placekitten.com/120/120",
                modifier = Modifier
                    .height(110.dp)
                    .width(110.dp)
                    .clip(RoundedCornerShape(12)),
                contentScale = ContentScale.FillBounds,
                contentDescription = "Icon"
            )

            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(style = typography.subtitle2, text = "Fatima Elma")
                Text(
                    style = typography.caption,
                    text = "Bogurian Cat"
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
                    Text(style = typography.subtitle1, text = "Dhaka")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(fontSize = 14.sp, text = "Visit Home", color = Color.Blue)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetListingRowPreview() {
    PetListingRowItem()
}