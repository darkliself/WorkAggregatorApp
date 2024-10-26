package com.darkliself.workagregatorapp.rss

import com.prof18.rssparser.RssParser

object RSSParser {
    private val rssParser = RssParser()

    suspend fun parse(xmlString: String) {
        rssParser.parse(xmlString)
    }
}