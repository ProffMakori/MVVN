package com.example.firebasestorage.ui.theme.screens.clothing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.lblue

@Composable
fun ClothingScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "FASHION STORE") },
            backgroundColor = lblue,
        )
        //Box
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.fashon),
                contentDescription = "budapest",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Latest trends in the fashion world",
                fontSize = 35.sp,
                color = Color.Green,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 90.dp)
            )

        }
        //End Box
        Spacer(modifier = Modifier.height(30.dp))

        Column {
            //Row 1
            Row {
                Column {

                }

            }
        }

        }


    }



    @Preview(showBackground = true)
    @Composable
    fun ClothingScreenPreview() {
        ClothingScreen(rememberNavController())
    }
