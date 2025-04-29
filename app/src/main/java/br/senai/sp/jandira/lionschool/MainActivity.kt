package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.lionschool.screens.CourseScreen
import br.senai.sp.jandira.lionschool.screens.HomeScreen
import br.senai.sp.jandira.lionschool.screens.Students_ListScreen
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
//                var navegacao = rememberNavController()
//                NavHost(
//                    navController = navegacao,
//                    startDestination = "home"
//                ) {
//                    composable(route = "home") { HomeScreen(navegacao) }
//                    composable(route = "dados") { CourseScreen(navegacao) }
//                    composable(route = "result") { Students_ListScreen(navegacao) }
//                }
            }
        }
    }
}
