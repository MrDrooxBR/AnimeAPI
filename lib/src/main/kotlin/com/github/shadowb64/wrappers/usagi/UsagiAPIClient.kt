package com.github.shadowb64.wrappers.usagi

class UsagiAPIClient {
    fun dance(): String = get("dance")
    fun feed(): String = get("feed")
    fun hug(): String = get("hug")
    fun kiss(): String = get("kiss")
    fun pat(): String = get("pat")
    fun poke(): String = get("poke")
    fun slap(): String = get("slap")
    fun tickle(): String = get("tickle")
    private fun get(endpoint: String) = khttp.get("https://usagiapi.danielagc.repl.co/api/$endpoint").jsonObject.getString("url")
}