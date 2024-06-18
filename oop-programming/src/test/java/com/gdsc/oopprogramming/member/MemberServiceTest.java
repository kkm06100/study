package com.gdsc.oopprogramming.member;

import com.gdsc.oopprogramming.AppConfig;
import com.gdsc.oopprogramming.member.Grade;
import com.gdsc.oopprogramming.member.Member;
import com.gdsc.oopprogramming.member.MemberService;
import com.gdsc.oopprogramming.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class MemberServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    @Test
    void join(){
        //given
        Member member  = new Member(1L,"memberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1l);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }


}
