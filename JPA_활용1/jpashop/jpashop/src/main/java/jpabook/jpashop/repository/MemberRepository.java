package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

/*    @PersistenceContext
    private EntityManager em;*/

    public void save(Member member) { // 저장
        em.persist(member);
    }

    public Member findOne(Long id) { // 조회(단건)
        return em.find(Member.class, id);
    }

    public List<Member> findAll() { // 조회(전체)
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findByName(String name) { // 조회(name 조건)
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
