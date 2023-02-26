package org.kotlin_board.service

import org.kotlin_board.dto.ArticleDto
import org.kotlin_board.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(val articleRepository: ArticleRepository) {

    fun retrieveArticles (): List<ArticleDto> {
        return articleRepository.findAll().map {
            ArticleDto(it.번호,
                it.제목,
                it.본문,
                it.글쓴이,
                it.작성일,
                it.조회,
                it.추천
            )
        }
    }
}