package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Row(
                    modifier = Modifier
                        .width(400.dp)
                        .height(350.dp)
                        .padding(top = 45.dp),
                    horizontalArrangement = Arrangement.Center,

                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = stringResource(
                            R.string.LOGO
                        ),
                        modifier = Modifier
                            .height(250.dp)
                            .width(230.dp)
                            .padding(top = 20.dp)
                    )
                    Text(
                        text = stringResource(
                            R.string.NOME
                        ),
                        modifier = Modifier
                            .padding(top = 60.dp),
                        color = Color(0xFF3347B0),
                        fontSize = 45.sp,
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(top = 50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(
                            R.string.course
                        ),
                        color = Color(0xFF3347B0),
                        fontSize = 22.sp,
                    )
                    Card(
                        shape = CircleShape,
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .width(70.dp)
                            .height(5.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0XFFFFC23D)
                            )
                    ) {}
                    Text(
                        text = stringResource(
                            R.string.destination
                        ),
                        modifier = Modifier
                            .padding(top = 40.dp, start = 10.dp, end = 10.dp),
                        color = Color(0xFF9E9FA4),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                    Column(
                        modifier = Modifier
                            .padding(top = 100.dp)
                    ) {
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .height(80.dp)
                                .padding(top = 20.dp, start = 40.dp, end = 40.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(color = 0XFFFFC23D)
                            ),
                            shape = RoundedCornerShape(16.dp),

                            ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                text = stringResource(R.string.bottom),
                                color = Color.Black,
                                fontSize = 20.sp
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(40.dp)
                                .height(60.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(
                                    R.drawable.youtube
                                ),
                                contentDescription = stringResource(
                                    R.string.youtube
                                ),
                                modifier = Modifier
                                    .size(50.dp)
                                    .padding(10.dp)

                            )
                            Image(
                                painter = painterResource(
                                    R.drawable.twitter
                                ),
                                contentDescription = stringResource(
                                    R.string.twitter
                                ),
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(50.dp)
                            )
                            Image(
                                painter = painterResource(
                                    R.drawable.instagram
                                ),
                                contentDescription = stringResource(
                                    R.string.instagram
                                ),
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(50.dp)
                            )
                            Image(
                                painter = painterResource(
                                    R.drawable.facebook
                                ),
                                contentDescription = stringResource(
                                    R.string.facebook
                                ),
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(50.dp)
                            )
                        }
                    }
                }

            }
    }
}
@Preview(showSystemUi =  true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}