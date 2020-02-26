package com.ikkun2501.bookmanagement.usecase.query.book

/**
 * 書籍参照系ユースケースのインターフェイス
 */
interface BookQuery {
    fun detail(bookId: Int): BookDetail
    fun search(bookSearchParams: BookSearchParams): List<BookSearchResultRow>
}