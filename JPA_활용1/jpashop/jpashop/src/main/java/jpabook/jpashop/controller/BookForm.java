package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    // 공통속성

    private String author;
    private String isbn;
    // 특별한 속성
}
