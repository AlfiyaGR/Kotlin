package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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

@Composable
fun ArtSpaceMain() {
    var result by remember {
        mutableStateOf(0)
    }
    when (result) {
        1-> ArtWithTitle(
            ArtPicture = R.drawable.edvardmunch,
            ArtTitle = stringResource(R.string.TEdvardMunch),
            ArtistName = stringResource(id = R.string.EdvardMunch)
        )
        2-> ArtWithTitle(
            ArtPicture = R.drawable.johannes,
            ArtTitle = stringResource(R.string.TJohannes),
            ArtistName = stringResource(id = R.string.JohannesVermeer)
        )
        3-> ArtWithTitle(
            ArtPicture = R.drawable.georges,
            ArtTitle = stringResource(R.string.TGeorgesSeurat),
            ArtistName = stringResource(id = R.string.George)
        )
        4-> ArtWithTitle(
            ArtPicture = R.drawable.selfportrait,
            ArtTitle = stringResource(R.string.TSelfPortrait),
            ArtistName = stringResource(id = R.string.SelfPortrait)
        )
        5-> ArtWithTitle(
            ArtPicture = R.drawable.eugenedelacroix,
            ArtTitle = stringResource(R.string.TEugeneDelacroix),
            ArtistName = stringResource(id = R.string.EugeneDelacroix)
        )
        else -> ArtWithTitle(
            ArtPicture = R.drawable.jean_antoine,
            ArtTitle = stringResource(R.string.TJeanAntoine),
            ArtistName = stringResource(id = R.string.JeanAntoine)
        )
    }
}

@Composable
fun ArtWithTitle(ArtPicture: Any, ArtTitle: Any, ArtistName: Any) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipTimeTheme {
        ArtSpaceMain()
    }
}