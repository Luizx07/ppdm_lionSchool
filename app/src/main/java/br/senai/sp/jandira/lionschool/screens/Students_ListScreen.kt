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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.StudentsComponents


@Composable
fun Students_ListScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp, start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = stringResource(R.string.LOGO),
                        modifier = Modifier
                            .width(45.dp)
                            .height(56.dp)
                            .padding(vertical = 2.dp)
                    )
                    Text(
                        text = stringResource(R.string.NOME),
                        fontSize = 15.sp,
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .width(50.dp)
                            .padding(bottom = 10.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .width(52.dp)
                        .height(52.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0XFFFFC23D)
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.program_text),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF3347B0),
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = (Color(0XFFFFC23D))
                )
            ) {}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.pes_student)) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFFFC23D),
                    unfocusedContainerColor = Color(0xFFF5F5F5)
                )
            )
//CARD status - inicio
            Row(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth()
                    .height(30.dp),
                horizontalArrangement = Arrangement.Start

            ) {
                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(80.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFF3347B0)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 21.dp),
                        text = stringResource(R.string.all),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(100.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 22.dp),
                        text = stringResource(R.string.cours),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF3347B0)
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(105.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 23.dp),
                        text = stringResource(R.string.finish),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF3347B0)
                    )
                }

            }
//CARD status - fim
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_graduation),
                    contentDescription = "",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
                Text(
                    text = stringResource(R.string.studentsList),
                    modifier = Modifier
                        .padding(start = 4.dp),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 30.dp, bottom = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            StudentsComponents(
                imageUser = painterResource(id = R.drawable.user),
                nameUser = stringResource(R.string.name1),
                register = stringResource(R.string.register1),
                year = stringResource(R.string.year1),
                isFilled = true
            )
            }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun Students_ListScreenPreview() {
    Students_ListScreen()
}
