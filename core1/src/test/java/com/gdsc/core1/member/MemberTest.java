package com.gdsc.core1.member;

import com.gdsc.core1.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberTest {

	@Test
	void contextLoads() {
	}
	AppConfig appConfig = new AppConfig();
	MemberService memberService = appConfig.memberService();
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
