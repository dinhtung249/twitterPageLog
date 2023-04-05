package jamebes.tung.twitter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jamebes.tung.twitter.ui.theme.TwitterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TwitterLoginPage()
                }
            }
        }
    }
}

@Composable
fun TwitterLoginPage() {
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.doge),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(top = 20.dp)
            )


            Text(text = "See what's",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.ExtraBold
                ),
                modifier = Modifier
                    .padding(start = 35.dp, top = screenHeight * 1 / 6)
                    .fillMaxWidth()
            )

            Text(text = "happening in the",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.ExtraBold
                ),
                modifier = Modifier
                    .padding(start = 35.dp, top = 6.dp)
                    .fillMaxWidth()
            )

            Text(text = "world right now.",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.ExtraBold
                ),
                modifier = Modifier
                    .padding(start = 35.dp, top = 6.dp)
                    .fillMaxWidth()
            )



            Button(
                onClick = {

                },
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.DarkGray),
                modifier = Modifier
                    .width(screenWidth * 4 / 5)
                    .padding(top = screenHeight * 1 / 6)
            ) {
                Image(painter = painterResource(id = R.drawable.google) , contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .padding(end = 8.dp)
                )
                Text(text = "Continue with Google")

            }

        Button(
            onClick = {

            },
            border = BorderStroke(1.dp, Color.Gray),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.DarkGray),
            modifier = Modifier
                .width(screenWidth * 4 / 5)
                .padding(top = 8.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.apple) , contentDescription = null,
                modifier = Modifier
                    .size(26.dp)
                    .padding(end = 8.dp)
            )
            Text(text = "Continue with Apple")

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(screenWidth * 4 / 5)
                .padding(top = 10.dp)
        ) {
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = " Or ",
                color = Color.DarkGray
            )
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )
        }
        Button(
            onClick = { /* your onClick code */ },
            colors = ButtonDefaults.buttonColors( Color(0xFF00CCFF)),
            modifier = Modifier
                .padding(top = 20.dp)
                .width(screenWidth * 4 / 5)
        ) {
            Text("Create account")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "By signing up, you agree to the",
                fontSize = 12.sp,
                color = Color.Gray
            )
            TextButton(
                onClick = { /* your onClick code */ },
            ) {
                Text("Terms of Service",
                    fontSize = 12.sp,
                color =  Color(0xFF00CCFF))
            }
            Text(text = "and",
                fontSize = 12.sp,
                color = Color.Gray,
            )

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            TextButton(
                onClick = { /* your onClick code */ },
            ) {
                Text("Privacy Policy",
                    fontSize = 12.sp,
                    color =  Color(0xFF00CCFF),
                    modifier = Modifier.padding(bottom = 60.dp)
                )

            }
            Text(text = ", including",
                fontSize = 12.sp,
                color = Color.Gray)
            TextButton(
                onClick = { /* your onClick code */ },
            ) {
                Text("Cookie Use.",
                    fontSize = 12.sp,
                    color =  Color(0xFF00CCFF))
            }
        }





    }


}

@Composable
fun Test(){
    Row(modifier = Modifier.padding(top = 30.dp)) {
        Text(text = "By signing up, you agree to the ", modifier = Modifier.wrapContentWidth())
        TextButton(onClick = { /* your onClick code */ }) {
            Text("Terms of Service", modifier = Modifier.wrapContentWidth())
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwitterTheme {
    }
}