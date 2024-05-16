package com.susankaranja.loginregform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.susankaranja.loginregform.ui.theme.LoginregformTheme
import java.time.format.TextStyle

class SimpleListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginregformTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    SimpleListView()
                }
                
            }
        }
    }
}
private val namelist = mutableListOf("Erick","Victor","Kelly","Johnson","Jeydwel","Abrielle","Alice","Faith","Susan","Imani","Tyvon","Shanice","Collins","John","Annah","Rose","Thomas","Esther","Leon","Joan","Joseph","Leah","May","Peter")
private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Cyan)
    .padding(20.dp)
private val textstyle = androidx.compose.ui.text.TextStyle(fontSize = 25.sp , color= Color.Red)
private val textStyle=androidx.compose.ui.text.TextStyle(fontSize = 20.sp , color = Color.Magenta)
@Composable
fun SimpleListView() {
    LazyColumn(modifier = listModifier) {
        items(namelist){

                jina ->
            Text(text = jina, style = textstyle)
         }
        }
//    LazyRow(modifier = listModifier) {
//        items(namelist){
//
//                jina ->
//            Text(text = jina, style = textstyle)
    }

@Preview(showBackground = true)
@Composable
 fun MyList() {
    SimpleListView()

}
    

