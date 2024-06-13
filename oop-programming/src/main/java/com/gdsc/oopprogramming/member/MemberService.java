package com.gdsc.oopprogramming.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
