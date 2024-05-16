package com.susankaranja.loginregform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.susankaranja.loginregform.ui.theme.LoginregformTheme

class CustomListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginregformTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    MyCustomList()

                }
            }
        }
    }
}

data class CakesModel(val name:String, val image : Int)

@Composable
fun ListRow(model: CakesModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Cyan)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }
}
 val CakeList  = mutableListOf<CakesModel>().apply {
    add(CakesModel("BlackForest",R.drawable.blackforest))
    add(CakesModel("WhiteForest",R.drawable.whiteforest))
    add(CakesModel("FruitCake",R.drawable.fruitcake))
    add(CakesModel("LemonCake",R.drawable.lemoncake))
    add(CakesModel("RedVelvet",R.drawable.redvelvet))
     add(CakesModel("Special Occasion",R.drawable.amaze))
     add(CakesModel("Birthday cake",R.drawable.brd3))
     add(CakesModel("Occasional cake",R.drawable.cakee))
     add(CakesModel("Lemon cake",R.drawable.cakee2))
     add(CakesModel("Candy cake",R.drawable.cakee4))
     add(CakesModel("Cup cakes",R.drawable.cup6))
     add(CakesModel("strawberry cup cakes",R.drawable.strawbeerycupcakes))
     add(CakesModel("Classic cake",R.drawable.classiccake))
     add(CakesModel("Chocolate tuffle",R.drawable.chocolatetuffle))
     add(CakesModel("Wedding",R.drawable.fun1))


}

@Composable
fun MyCustomList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        items(CakeList){ model ->
            ListRow(model = model)
        }
    }
}

@Preview
@Composable
 fun CustomPrev() {
    MyCustomList()
}