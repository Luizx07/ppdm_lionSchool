package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.CourseScreen


@Composable
fun StudentsComponents(
    imageUser: Painter = painterResource(id = R.drawable.user),
    nameUser: String = "",
    register: String = "",
    year: String = "",
    isFilled: Boolean = false
) {

    Card(
        modifier = Modifier
            .width(320.dp)
            .height(78.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF9FA9E1)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .width(12.dp)
                    .fillMaxHeight(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFC23D)
                ),
                shape = RoundedCornerShape(0.dp)
            ) {}
            Row(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = if (isFilled) imageUser else painterResource(id = R.drawable.error),
                    contentDescription = "",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                )
                Column  {
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        text = nameUser,
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Row {
                        Image(
                            imageVector = Icons.Default.List,
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                color = Color(0xFF9E9FA4)
                            ),
                            modifier = Modifier
                                .padding(start = 5.dp)
                                .height(12.dp)
                                .width(12.dp)
                        )

                        Text(
                            modifier = Modifier
                                .padding(start = 5.dp),
                            text = register,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(8.dp),
                verticalAlignment = Alignment.Bottom,
            ) {
                Image(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = ""
                )
                Text(
                    text = year,
                    color = Color(0xFFFFC23D)
                )
            }


        }

    }
}

@Preview(showSystemUi =  true)
@Composable
private fun StudentsComponentsPreview() {
    StudentsComponents()
}