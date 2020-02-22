package com.ikkun2501.bookmanagement.interfaces

import com.ikkun2501.bookmanagement.domain.Book
import com.ikkun2501.bookmanagement.interfaces.book.BookOperations
import com.ikkun2501.bookmanagement.usecase.command.book.BookCreateParams
import com.ikkun2501.bookmanagement.usecase.command.book.BookUpdateParams
import com.ikkun2501.bookmanagement.usecase.query.book.BookDetail
import com.ikkun2501.bookmanagement.usecase.query.book.BookSearchParams
import com.ikkun2501.bookmanagement.usecase.query.book.BookSearchResultRow
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

/**
 * BookAPIのClientインターフェイス
 * MEMO このインターフェイスからコンパイル時に実装が生成される
 */
@Client("/book")
interface BookClient : BookOperations {

    override fun show(@PathVariable bookId: Long): BookDetail

    override fun search(bookSearchParams: BookSearchParams): List<BookSearchResultRow>

    override fun create(@Body bookCreateParams: BookCreateParams): Book

    override fun update(@Body book: BookUpdateParams): Book

    override fun delete(@PathVariable bookId: Long)
}
