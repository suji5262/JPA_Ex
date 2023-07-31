/*
package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest_Ex {

    @Autowired
    MemberRepository_Ex memberRepository;
    
    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member_Ex member = new Member_Ex();
        member.setUsername("memberA");

        //when
        Long savedId = memberRepository.save(member);
        Member_Ex findMember = memberRepository.find(savedId);

        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());

        // 특별한 테스트
        Assertions.assertThat(findMember).isEqualTo(member);
        System.out.println("findMember == member : " +(findMember == member));
    }
}*/
