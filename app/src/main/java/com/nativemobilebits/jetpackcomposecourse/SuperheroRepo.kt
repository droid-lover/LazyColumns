package com.nativemobilebits.jetpackcomposecourse

object SuperheroRepo {

    val TEAM_IRONMAN = "Team Ironman"
    val TEAM_CAPTAIN_AMERICA = "Team Captain America"

    fun getSuperheros(): List<Superhero> {
        return listOf<Superhero>(
            Superhero(
                name = "Ironman",
                powerScore = 100,
                team = "Team Ironman"
            ),
            Superhero(
                name = "Hulk",
                powerScore = 96,
                team = "Team Ironman"
            ),
            Superhero(
                name = "Black Widow",
                powerScore = 86,
                team = "Team Ironman"
            ),
            Superhero(
                name = "Black Panther",
                powerScore = 98,
                team = "Team Ironman"
            ),
            Superhero(
                name = "James War Machine",
                powerScore = 67,
                team = "Team Ironman"
            ),
            Superhero(
                name = "Spider Man",
                powerScore = 91,
                team = "Team Ironman"
            ), Superhero(
                name = "Nick Fury",
                powerScore = 101,
                team = "Team Ironman"
            ),
            Superhero(
                name = "Captain America",
                powerScore = 100,
                team = "Team Captain America"
            ),
            Superhero(
                name = "Bucky Barnes",
                powerScore = 88,
                team = "Team Captain America"
            ),
            Superhero(
                name = "Falcon",
                powerScore = 86,
                team = "Team Captain America"
            ),
            Superhero(
                name = "Scarlet Witch",
                powerScore = 90,
                team = "Team Captain America"
            ),
            Superhero(
                name = "Hawkeye",
                powerScore = 90,
                team = "Team Captain America"
            ),
            Superhero(
                name = "Ant Man",
                powerScore = 90,
                team = "Team Captain America"
            )
        )
    }

}
