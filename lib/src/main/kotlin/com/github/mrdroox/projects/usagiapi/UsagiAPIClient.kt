package com.github.mrdroox.projects.usagiapi

import okhttp3.OkHttpClient
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

class UsagiAPIClient {
    private val client = OkHttpClient().newBuilder()
    private var request = okhttp3.Request.Builder()
    private val parser = JSONParser()
    fun dance(): String {
        return get("dance")
    }

    fun feed(): String {
        return get("feed")
    }

    fun hug(): String {
        return get("hug")
    }

    fun kiss(): String {
        return get("kiss")
    }

    fun pat(): String {
        return get("pat")
    }

    fun poke(): String {
        return get("poke")
    }

    fun slap(): String {
        return get("slap")
    }

    fun tickle(): String {
        return get("tickle")
    }

    private fun get(endpoint: String): String {
        request.url("https://usagiapi.danielagc.repl.co/api/$endpoint")
        request.get()
        val returned = parser.parse(client.build().newCall(this.request.build()).execute().body?.string()) as Any as JSONObject
        return returned["url"] as String
    }
}
