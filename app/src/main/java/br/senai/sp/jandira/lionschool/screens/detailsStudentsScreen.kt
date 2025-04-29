package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun detailsStudentsScreen() {
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
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
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
                    modifier = Modifier
                        .width(50.dp)
                        .padding(bottom = 10.dp)
                )
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFC23D),
                )
            ) {}
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 45.dp)
            ) {
                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                    shape = RoundedCornerShape(100.dp),
                    border = BorderStroke(5.dp, Color(0xFFFFC23D))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.user2),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = stringResource(R.string.name2),
                    fontSize = 24.sp,
                    color = Color(0xFF3347B0),
                    modifier = Modifier
                        .padding(5.dp),
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = stringResource(R.string.COURSES),
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(425.dp)
                    .padding(top = 20.dp)
            ) { }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun detailsStudentsScreenPreview() {
    detailsStudentsScreen()
}
