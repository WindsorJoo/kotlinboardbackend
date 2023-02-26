package org.kotlin_board.repository

import org.kotlin_board.entity.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository :CrudRepository<Article, Int> {
}