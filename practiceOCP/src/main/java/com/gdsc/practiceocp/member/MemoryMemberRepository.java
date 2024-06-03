package com.gdsc.practiceocp.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{


    Map<Long,Member> memory = new HashMap<>();
    @Override
    public void save(Long memberId, String memberName, Grade grade) {
        Member member = new Member(memberId,memberName,grade);
        memory.put(memberId,member);
    }

    public Member findById(Long memberId) {
        return memory.get(memberId);
    }

}
