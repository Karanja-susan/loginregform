package com.susankaranja.loginregform

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.susankaranja.loginregform.ui.theme.LoginregformTheme

class MainActivity : ComponentActivity() {
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
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Red)
    ) {
        Text(
            text = "eMobilis Login",
            color = Color.White,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
        )
        OutlinedTextField(
            value = email, onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            label = {
                Text(
                    text = "Enter username",
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),

            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),

            )

        OutlinedTextField(
            value = password, onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Pass") },
            label = {
                Text(
                    text = "Enter password",
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),

            )
        Button(
            onClick = {
                val intent = Intent(context, RegisterActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Register",
                color = Color.Yellow,
                fontSize = 18.sp
            )

        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, IntentActivity2::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Intent",
                color = Color.Yellow,
                fontSize = 18.sp
            )

        }

        Spacer(
            modifier = Modifier
                .height(20.dp)
        )

        Button(
            onClick = {
                val intent = Intent(context, RegisterActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, calculatorActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Calculator",
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, SimpleListActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "simplelist",
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, RecycleviewActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "recycle view",
                color = Color.White,
                fontSize = 18.sp
            )

        }
        Spacer(modifier = Modifier
            .height(20.dp))
        Button(onClick = {
            val intent= Intent(context,CustomListActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "custom list",
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier
            .height(20.dp))
        Button(onClick = {
            val intent= Intent(context,CardBoxActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .height(40.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "card box",
                color = Color.White,
                fontSize = 18.sp
            )
        }

    }
}



@Preview
@Composable
fun Loginprev() {
    Login()

}
