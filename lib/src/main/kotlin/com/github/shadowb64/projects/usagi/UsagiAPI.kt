package com.github.shadowb64.projects.usagi

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request

object UsagiAPI {
    fun bite(): String = get("bite")
    fun bowdown(): String = get("bowdown")
    fun dance(): String = get("dance")
    fun feed(): String = get("feed")
    fun hug(): String = get("hug")
    fun kiss(): String = get("kiss")
    fun pat(): String = get("pat")
    fun poke(): String = get("poke")
    fun slap(): String = get("slap")
    fun tickle(): String = get("tickle")
    fun wasted(): String = get("wasted")
    private fun get(endpoint: String): String =
        Json.decodeFromString<UsagiAPIResponse>(
            OkHttpClient().newCall(Request.Builder().url("https://usagiapi.danielagc.repl.co/api/$endpoint").build())
                .execute().body?.string()!!
        ).url
}