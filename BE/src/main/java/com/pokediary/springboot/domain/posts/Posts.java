package com.pokediary.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter             // 클래스 내 모든 필드의 Getter 메서드 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 추가
@Entity             // 테이블과 링크되는 클래스
public class Posts {

    @Id                                                 // 해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙
    private Long id;
    @Column(length = 500, nullable=false)               // 테이블의 컬럼을 나타내며, 굳이 선언하지 않아도 해당 클래스의 필드는 모두 컬림이 됨
    private String title;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;
    private String author;

    @Builder
    public Posts(String title, String content, String author) { // 매개변수가 있는 생성자
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
