package com.github.mrdroox.projects

import okhttp3.FormBody
import okhttp3.OkHttpClient

class Request {
    private val client = OkHttpClient().newBuilder()
    private var request = okhttp3.Request.Builder()
    private val headers: MutableList<String> = mutableListOf()
    private val bodies: MutableList<String> = mutableListOf()
    private val formBody = FormBody.Builder()

    fun setHeaders(vararg headers: String): Request {
        for (item in headers) {
            this.headers.add(item)
        }
        return this
    }

    fun setBodies(vararg bodyParam: String): Request {
        for (item in bodyParam) {
            this.bodies.add(item)
        }
        return this
    }

    fun build(method: String, url: String): String? {
        for (item in headers) {
            val i = item.split(":")
            this.request.addHeader(i[0], i[1].trim())
        }

        for (item in bodies) {
            val i = item.split(":")
            formBody.add(i[0], i[1].trim())
        }
        request.url(url)
        request.get()
        return client.build().newCall(this.request.build()).execute().body?.string()
    }
}