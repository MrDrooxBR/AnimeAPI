/**
 * @author MrDrooxBR
 * @since 19/02/2021
 */

package com.github.mrdroox.projects.usagiapi

import com.github.mrdroox.projects.Request
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

class UsagiAPIClient {
    private val parser = JSONParser()
    private val BASE_URL = "https://usagiapi.danielagc.repl.co/api/"

    /**
     * @return String
     */
    fun dance(): String {
        val dance = parser.parse(Request().build("get", BASE_URL + "dance")) as Any as JSONObject
        return dance["url"] as String
    }

    /**
     * @return String
     */
    fun feed(): String {
        val feed = parser.parse(Request().build("get", BASE_URL + "feed")) as Any as JSONObject
        return feed["url"] as String
    }

    /**
     * @return String
     */
    fun hug(): String {
        val hug = parser.parse(Request().build("get", BASE_URL + "hug")) as Any as JSONObject
        return hug["url"] as String
    }

    /**
     * @return String
     */
    fun kiss(): String {
        val kiss = parser.parse(Request().build("get", BASE_URL + "kiss")) as Any as JSONObject
        return kiss["url"] as String
    }

    /**
     * @return String
     */
    fun pat(): String {
        val pat = parser.parse(Request().build("get", BASE_URL + "pat")) as Any as JSONObject
        return pat["url"] as String
    }

    /**
     * @return String
     */
    fun poke(): String {
        val poke = parser.parse(Request().build("get", BASE_URL + "poke")) as Any as JSONObject
        return poke["url"] as String
    }

    /**
     * @return String
     */
    fun slap(): String {
        val slap = parser.parse(Request().build("get", BASE_URL + "slap")) as Any as JSONObject
        return slap["url"] as String
    }

    /**
     * @return String
     */
    fun tickle(): String {
        val tickle = parser.parse(Request().build("get", BASE_URL + "tickle")) as Any as JSONObject
        return tickle["url"] as String
    }
}
