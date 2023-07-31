package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

/*    @Autowired // 생성자 injection
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }*/


/*    @Autowired // setter injection
    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }*/


    /*@Autowired // 필드 Injection
    private MemberRepository memberRepository;*/


    /**
     * 회원 가입
     */
    @Transactional
    public Long join(Member member) {
        validateDuplicateMember(member); // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) { // exception
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }


    /**
     * 회원 전체 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll(); // 전체 조회
    }

    public Member findOne(Long memberId) { // 단건 조회
        return memberRepository.findOne(memberId);
    }
}
