package com.ismet.usbaccessory.model

import kotlin.random.Random

class ResponseDiversity(val delayFrom: Long, val delayTo: Long, val responses: List<ByteArray>) {

    fun randomHistoryRecord(request: String): HistoryRecord {
        val delay = Random.nextLong(from = delayFrom, until = delayTo)
        val response = responses.random()
        return HistoryRecord(delay, request, response.decodeToString(), true)
    }
}