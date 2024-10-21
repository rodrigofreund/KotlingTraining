package com.rodrigofreund.training

//Business Game class
class Game(
    private val title: String,
    private val cover: String) {

    val description = ""

    override fun toString(): String {
        return "Game(title='$title', cover='$cover', description='$description')"
    }


}