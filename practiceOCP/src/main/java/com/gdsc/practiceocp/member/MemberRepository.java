package com.gdsc.practiceocp.member;

public interface MemberRepository {
    public void save(Long memberId, String memberName, Grade grade);
    public Member findById(Long memberId);
}
