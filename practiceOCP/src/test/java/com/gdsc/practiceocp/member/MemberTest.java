package com.gdsc.practiceocp.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void member(){
        Member member = new Member(1L,"memberA",Grade.VIP);
        memberService.join(member);
        Member memberSearch = memberService.search(1L);
        Assertions.assertThat(member.getMemberName()).isEqualTo(memberSearch.getMemberName());
    }

}
