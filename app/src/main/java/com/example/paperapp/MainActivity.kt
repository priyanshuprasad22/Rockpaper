package com.example.paperapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paperapp.ui.theme.PaperAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaperAppTheme {
                MainComposable()
            }
        }
    }
}
@Composable
fun MainComposable()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        Image(
            painter = painterResource(id = R.drawable.neww_image),
            contentDescription = "Image"
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(text = "Score", fontSize = 30.sp, textAlign = TextAlign.Center)
        Text(text = "0 / 4", fontSize = 50.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(90.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(30.dp)
            ) {
                Text(text = "You Chose", fontSize = 16.sp)
                Text(text = "Rock", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }

            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(30.dp)
            ) {
                Text(text = "Android Chose", fontSize = 16.sp)
                Text(text = " Paper", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly)
        {
            shape("Rock")
            shape("Paper")
            shape("Scissors")

        }
        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "#JetpackCompose", fontSize = 30.sp, fontFamily = FontFamily.SansSerif)

    }
}
@Composable
fun shape(txt:String) {
    Row(
        Modifier
            .size(130.dp, 130.dp)
            .padding(5.dp)
            .background(color = MaterialTheme.colors.primary, RoundedCornerShape(20.dp))
            ){
        Text(text = txt, textAlign = TextAlign.Center, fontFamily = FontFamily.SansSerif, modifier = Modifier.padding(start = 30.dp, bottom = 30.dp,top=45.dp), color = Color.White)
    }
}

@Preview(showBackground = true,
widthDp =400,
heightDp = 800)

@Composable
fun DefaultPreview() {
    PaperAppTheme {
       MainComposable()
        }
}
