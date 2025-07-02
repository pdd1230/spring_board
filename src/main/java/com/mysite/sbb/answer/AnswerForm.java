<<<<<<< HEAD
=======

>>>>>>> df1c2f7 (게시물에 번호 지정하기, 답변 갯수 표시, 스프링 시큐리티 설정)
package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {

	@NotEmpty(message = "내용은 필수항목입니다")
	private String content;
}
