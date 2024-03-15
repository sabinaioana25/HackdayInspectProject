package com.example.hackdayinspectproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@ExperimentalMaterial3Api
@Composable
fun SettingsScreen() {
    Column {
        HeaderText()
        GeneralOptions()
    }
}

@Composable
fun HeaderText() {
    Text(
        text = "Settings",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 10.dp),
        fontWeight = FontWeight(2),
        fontSize = 16.sp
    )
}

@Composable
fun GeneralOptions() {
    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Icon(
                painter = painterResource(id = R.drawable.ic_location),
                contentDescription = ""
            )
            Text(text = "Update Working Location")
            Icon(
                painter = painterResource(id = R.drawable.ic_trailing),
                contentDescription = ""
            )
        }
    }

    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Icon(
                painter = painterResource(id = R.drawable.ic_colorcheck),
                contentDescription = ""
            )
            Text(text = "Use Color Checker")
            Icon(
                painter = painterResource(id = R.drawable.ic_trailing),
                contentDescription = ""
            )
        }
    }

    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Icon(painter = painterResource(id = R.drawable.ic_pref), contentDescription = "")
            Text(text = "App Preferences")
            Icon(
                painter = painterResource(id = R.drawable.ic_trailing),
                contentDescription = ""
            )
        }
    }

    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Icon(painter = painterResource(id = R.drawable.ic_system), contentDescription = "")
            Text(text = "System Information")
            Icon(
                painter = painterResource(id = R.drawable.ic_trailing),
                contentDescription = ""
            )
        }
    }

    Row(
        modifier = Modifier.padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Icon(painter = painterResource(id = R.drawable.ic_sync), contentDescription = "")
            Text(text = "Sync All Data")
            Icon(
                painter = painterResource(id = R.drawable.ic_trailing),
                contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun SimpleComposablePreview() {
    SettingsScreen()
}



