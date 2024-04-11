package com.example.firebasestorage.ui.theme.screens.dashboad

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CLOTHING
import com.example.firebasestorage.ui.theme.lblue

@Composable
fun DashboadScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Amazon Shop") },
            backgroundColor = lblue
            )
        //End of topApp Bar
        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Column {
                Text(text = "Amazon", fontSize = 30.sp,
                    color = lblue, fontFamily = FontFamily.Serif)
                Text(text = "Shop from A to Z", fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.width(80.dp))

            Image(painter = painterResource(id = R.drawable.amazon),
                contentDescription = "Amazon",
                modifier = Modifier.size(100.dp))
        }
        //End of Row

        Column {
            //Row 1
            Row (modifier = Modifier.padding(start = 20.dp)){
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                    }
                    .size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
            }
            //End  of row 1
            Spacer(modifier = Modifier.height(30.dp))

            //Row 2
            Row (modifier = Modifier.padding(start = 20.dp)){
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
            }
            //End  of row 2
            Spacer(modifier = Modifier.height(30.dp))

            //Row 3
            Row (modifier = Modifier.padding(start = 20.dp)){
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
            }
            //End  of row 3
            Spacer(modifier = Modifier.height(30.dp))

            //Row 4
            Row (modifier = Modifier.padding(start = 20.dp)){
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
            }
            //End  of row 4
            Spacer(modifier = Modifier.height(30.dp))

            //Row 5
            Row (modifier = Modifier.padding(start = 20.dp)){
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.amazon),
                                contentDescription = "amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 20.sp,
                            color = lblue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
            }
            //End  of row5
            Spacer(modifier = Modifier.height(30.dp))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DashboadScreenPreview() {
    DashboadScreen(rememberNavController())
}