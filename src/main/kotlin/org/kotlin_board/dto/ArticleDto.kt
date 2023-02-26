package org.kotlin_board.dto

import java.util.Date

data class ArticleDto(
    val 번호: Int?,
    var 제목: String,
    var 본문: String,
    var 글쓴이: String,
    var 작성일:Date,
    var 조회:Int,
    var 추천:Int
)