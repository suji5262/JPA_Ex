package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 내장타입 -> 어딘가 내장이 될 수도 있음
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    } // 기본 생성자를 생성해야 함

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
