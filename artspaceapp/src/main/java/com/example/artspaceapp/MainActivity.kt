package com.example.artspaceapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.TipTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TipTimeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceMain()
                }
            }
        }
    }
}

@SuppressLint("AutoboxingStateCreation")
@Composable
fun ArtSpaceMain() {
    val result by remember {
        mutableStateOf(0)
    }
    when (result) {
        1-> ArtWithTitle(
            artPicture = R.drawable.edvardmunch,
            artTitle = stringResource(R.string.TEdvardMunch),
            artistName = stringResource(id = R.string.EdvardMunch)
        )
        2-> ArtWithTitle(
            artPicture = R.drawable.johannes,
            artTitle = stringResource(R.string.TJohannes),
            artistName = stringResource(id = R.string.JohannesVermeer)
        )
        3-> ArtWithTitle(
            artPicture = R.drawable.georges,
            artTitle = stringResource(R.string.TGeorgesSeurat),
            artistName = stringResource(id = R.string.George)
        )
        4-> ArtWithTitle(
            artPicture = R.drawable.selfportrait,
            artTitle = stringResource(R.string.TSelfPortrait),
            artistName = stringResource(id = R.string.SelfPortrait)
        )
        5-> ArtWithTitle(
            artPicture = R.drawable.eugenedelacroix,
            artTitle = stringResource(R.string.TEugeneDelacroix),
            artistName = stringResource(id = R.string.EugeneDelacroix)
        )
        else -> ArtWithTitle(
            artPicture = R.drawable.jean_antoine,
            artTitle = stringResource(R.string.TJeanAntoine),
            artistName = stringResource(id = R.string.JeanAntoine)
        )
    }
}

@Composable
fun ArtWithTitle(artPicture: Int, artTitle: String, artistName: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = artPicture),
            contentDescription = null,
            modifier = Modifier
                .padding(20.dp)
                .height(300.dp)
                .width(300.dp)
                .border(border = BorderStroke(2.dp, Color.Gray), shape = RectangleShape)
                .shadow(elevation = 4.dp)
                .padding(10.dp)
        )
        Card(
            modifier = Modifier
                .padding(horizontal = 45.dp, vertical = 90.dp)

        ){
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = artTitle,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    lineHeight = 30.sp
                )
                Text(
                    text = artistName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipTimeTheme {
        ArtSpaceMain()
    }
}