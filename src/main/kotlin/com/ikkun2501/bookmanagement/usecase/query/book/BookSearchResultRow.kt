package com.ikkun2501.bookmanagement.usecase.query.book

data class BookSearchResultRow(
    val bookId: Long,
    val title: String,
    val bookDescription: String,
    val authorId: Long,
    val authorName: String
)
