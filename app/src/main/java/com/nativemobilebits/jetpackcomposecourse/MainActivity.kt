package com.nativemobilebits.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            List()
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun List() {
    val superheros = SuperheroRepo.getSuperheros()

    val teamIronManList = superheros?.filter { it.team == SuperheroRepo.TEAM_IRONMAN }
    val teamCaptainAmericaList = superheros?.filter { it.team == SuperheroRepo.TEAM_IRONMAN }


    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        stickyHeader(SuperheroRepo.TEAM_IRONMAN){
            TeamStickyHeader(teamName = SuperheroRepo.TEAM_IRONMAN)
        }

        items(teamIronManList){ superhero ->
            ListViewItem(superhero = superhero)
        }

        stickyHeader(SuperheroRepo.TEAM_CAPTAIN_AMERICA){
            TeamStickyHeader(teamName = SuperheroRepo.TEAM_CAPTAIN_AMERICA)
        }

        items(teamCaptainAmericaList){ superhero ->
            ListViewItem(superhero = superhero)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    List()
}
