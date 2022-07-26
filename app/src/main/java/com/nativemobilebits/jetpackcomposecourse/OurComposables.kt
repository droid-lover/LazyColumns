package com.nativemobilebits.jetpackcomposecourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListViewItem(superhero: Superhero) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(all = 12.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "${superhero.name}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

        Text(
            text = "${superhero.powerScore}",
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
    }

}


@Composable
fun TeamStickyHeader(teamName: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(12.dp)
    ) {
        Text(
            modifier = Modifier
                .background(Color.DarkGray),
            text = teamName,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}