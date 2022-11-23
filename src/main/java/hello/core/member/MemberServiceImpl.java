package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;//추상화에만 의존

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } //생성자를 통해서 구현체 선택


    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
