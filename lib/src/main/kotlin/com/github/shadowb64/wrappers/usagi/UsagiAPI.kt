package com.github.shadowb64.wrappers.usagi

object UsagiAPI {
    /**
    * Return a random link of dance category
    * @return String
    */
    fun dance(): String = get("dance")
    /**
    * Return a random link of feed category
    * @return String
    */
    fun feed(): String = get("feed")
    /**
    * Return a random link of hug category
    * @return String
    */
    fun hug(): String = get("hug")
    /**
    * Returns a link to the kiss category
    * @return String
    */
    fun kiss(): String = get("kiss")
    /**
    * Return a random link of pat category
    * @return String
    */
    fun pat(): String = get("pat")
    /**
    * Return a random link of poke category
    * @return String
    */
    fun poke(): String = get("poke")
    /**
    * Return a random link of slap category
    * @return String
    */
    fun slap(): String = get("slap")
    /**
    * Return a random link of tickle category
    * @return String
    */
    fun tickle(): String = get("tickle")
    private fun get(endpoint: String) = khttp.get("https://usagiapi.danielagc.repl.co/api/$endpoint").jsonObject.getString("url")
}
