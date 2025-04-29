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
import br.senai.sp.jandira.lionschool.screens.components.CoursesComponents


@Composable
fun CourseScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
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
                    containerColor = (Color(0XFFFFC23D))
                )
            ){}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.pes_course)) },
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lion_lista),
                    contentDescription = "",
                    modifier = Modifier
                        .width(36.dp)
                        .height(36.dp)
                )
                Text(
                    text = stringResource(R.string.course2),
                    fontSize = 24.sp,
                    color = Color(0xFF3347B0),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(bottom = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                CoursesComponents(
                    imageLogo = painterResource(id = R.drawable.programa),
                    textIcon = stringResource(R.string.program_text),
                    textTitle = stringResource(R.string.program_title),
                    textDescription = stringResource(R.string.program_description),
                    textSemester = stringResource(R.string.seme),
                    isFilled = true
                )
                CoursesComponents(
                    imageLogo = painterResource(id = R.drawable.redes),
                    textIcon = stringResource(R.string.red_text),
                    textTitle = stringResource(R.string.red_title),
                    textDescription = stringResource(R.string.red_description),
                    textSemester = stringResource(R.string.seme),
                    isFilled = true
                )
                CoursesComponents(
                    imageLogo = painterResource(id = R.drawable.eletro),
                    textIcon = stringResource(R.string.eletro_text),
                    textTitle = stringResource(R.string.eletro_title),
                    textDescription = stringResource(R.string.eletro_description),
                    textSemester = stringResource(R.string.seme),
                    isFilled = true
                )
            }
        }
    }
}

@Preview(showSystemUi =  true)
@Composable
private fun CoursesScreenPreview() {
    CourseScreen()
}