package com.rodrigofreund.training

//Business Game class
class Game(
    private val title: String,
    private val cover: String) {

    override fun toString(): String {
        return "Game(title='$title', cover='$cover')"
    }


}