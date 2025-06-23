package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 도대체 무엇인가요? 알려주세요");
//		q1.setContent("sbb를 통해서 스프링부트 프로젝트를 공부하는거로 알고 있습니다. 좀더 알고 싶어요?");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1); // 첫번째 질문 저장
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2); // 두번째 질문 저장

		// findAll()
		List<Question> all = this.questionRepository.findAll();
		assertEquals(4, all.size());

		Question q = all.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());

	}

}
