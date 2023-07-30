/*
package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository_Ex {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member_Ex member) { // 저장
        em.persist(member);
        return member.getId();
    }

    public Member_Ex find(Long id) { // 조회
        return em.find(Member_Ex.class, id);
    }

}
*/
