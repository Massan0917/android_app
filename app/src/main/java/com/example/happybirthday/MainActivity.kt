package com.example.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingText("Android\nkun")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message : String, modifier: Modifier = Modifier) {
    Column( verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(16.dp)
    ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "hogehoge",
            fontSize = 30.sp,
            lineHeight = 30.sp
        )
    }
}

@Composable
fun GreetingImage(message : String, from : String, modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box{
        GreetingText(   message = "Android\nkun",
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        )
        Image(
            painter = image,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(message = "Android\nkun", from ="hogehoge")
        //GreetingText("Android\nkun")
    }
}