package org.kotlin_board.entity

import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.Comment
import java.util.Date
import javax.persistence.*

@Entity
@Table(name="articles")
data class Article(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val 번호: Int?,

    @Comment("제목")
    var 제목: String,

    @Comment("본문")
    var 본문: String,

    @Comment("글쓴이")
    var 글쓴이: String,

    @Comment("작성일")
    @Column(nullable = false, columnDefinition = "datetime default current_timestamp")
    var 작성일: Date,

    @Comment("조회")
    @ColumnDefault("0")
    var 조회: Int,

    @Comment("추천")
    @ColumnDefault("0")
    var 추천: Int
)