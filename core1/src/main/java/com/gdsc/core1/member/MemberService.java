package com.gdsc.core1.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long MemberId);
}
