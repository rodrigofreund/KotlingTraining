package com.rodrigofreund.training

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {

    /* Using java HttpClient to retrieve api rest data
     * There is other resources to accomplish this task as Retrofit (https://square.github.io/retrofit/)
     */
    val client: HttpClient = HttpClient.newHttpClient()

    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()

    //Using Gson to parse json to data classes
    val gson = Gson()

    val gameInfo = gson.fromJson(json, GameInfo::class.java)

    val game = Game(gameInfo.info.title, gameInfo.info.thumb)

    println(game)
}