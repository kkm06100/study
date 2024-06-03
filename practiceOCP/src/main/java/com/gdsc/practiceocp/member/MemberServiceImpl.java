package com.gdsc.practiceocp.member;

public class MemberServiceImpl implements MemberService{
    MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member.getMemberId(),
                member.getMemberName(),
                member.getGrade()
        );
    }

    @Override
    public Member search(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
