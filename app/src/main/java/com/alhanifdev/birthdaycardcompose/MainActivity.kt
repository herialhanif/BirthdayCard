package com.alhanifdev.birthdaycardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alhanifdev.birthdaycardcompose.ui.theme.BirthdayCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color(0xFF0F3D3E)
                ) {
//                    LogoName("Android")
                    LogoName("Heri Setiawan", "Newbie Android Developer")
                }
            }
        }
    }
}

@Composable
fun LogoName(fullname: String, title: String) {
    val logo_android = painterResource(R.drawable.android_logo)
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .wrapContentHeight(Alignment.CenterVertically)) {
            Column {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)) {
                        Image(painter = logo_android, contentDescription = null, modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .wrapContentHeight(Alignment.CenterVertically)
                            .wrapContentWidth(Alignment.CenterHorizontally)
                        )
                    }
                    Column {
                        Row {
                            Text(text = fullname, fontSize = 36.sp, color = Color(0xFFFFFFFF), modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentWidth(Alignment.CenterHorizontally)
                            )
                        }
                        Row {
                            Text(text = title, fontSize = 16.sp, color = Color(0xFF3ddc84), modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentWidth(Alignment.CenterHorizontally))
                        }
                    }
                }
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .wrapContentHeight(Alignment.Bottom)
            .padding(bottom = 50.dp)){
            ContactInformation("+62(852) 4921 9086", "@herihanif" , "alhanifdev@gmail.com" )
        }
    }

}

@Composable
fun ContactInformation(telp: String, sosialmedia: String, email: String) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(Alignment.Bottom)){
        Column{
            Divider(color = Color.White, thickness = 1.dp)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 5.dp)) {
                Icon(Icons.Rounded.Call, contentDescription = "Email Icon", tint = Color(0xFF3ddc84))
                Text(text = telp, color = Color(0xFFFFFFFF), modifier = Modifier
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(start = 20.dp)
                )
            }
            Divider( color = Color.White, thickness = 1.dp)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 5.dp)) {
                Icon(Icons.Rounded.Share, contentDescription = "Email Icon", tint = Color(0xFF3ddc84))
                Text(text = sosialmedia, color = Color(0xFFFFFFFF), modifier = Modifier
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(start = 20.dp)
                )
            }
            Divider(color = Color.White, thickness = 1.dp)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 5.dp)) {
                Icon(Icons.Rounded.Email, contentDescription = "Email Icon", tint = Color(0xFF3ddc84))
                Text(text = email, color = Color(0xFFFFFFFF), modifier = Modifier
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(start = 20.dp)

                )
            }

        }
    }



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardComposeTheme {
        LogoName("Jenifer Doe", "Android Developer Extraordinaire")
//        ContactInformation("000(00) 000 000", "@sosialmedia" , "email@domain.com" )
    }
}