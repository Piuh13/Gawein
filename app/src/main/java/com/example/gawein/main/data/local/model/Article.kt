package com.example.gawein.main.data.local.model

data class Article(
    val title: String,
    val content: String,
    val pictureUrl: String
)

object sampleArticleList {
    val asd =
        "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et "
    val sampleArticle = listOf(
        Article(
            "Article 1",
            asd,
            "waskita_karya.png"
        ),
        Article(
            "Article 2",
            asd,
            "null"
        ),
        Article(
            "Article 3",
            asd,
            "null"
        ),
        Article(
            "Article 4",
            asd,
            "null"
        ),
        Article(
            "Article 5",
            asd,
            "null"
        ),
        Article(
            "Article 6",
            asd,
            "null"
        ),
        Article(
            "SDADDAD",
            asd,
            "null"
        ),
    )
}

