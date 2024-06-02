package com.gdsc.core1;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberService;
import com.gdsc.core1.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Core1ApplicationTests {

	@Test
	void contextLoads() {
	}

	MemberService memberService = new MemberServiceImpl();
	@Test
	void join(){
		// given
		Member member = new Member(1L,"memberA", Grade.VIP);
		//when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		//then
		Assertions.assertThat(member).isEqualTo(findMember);
	}

}
