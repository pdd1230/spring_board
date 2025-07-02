<<<<<<< HEAD
=======

>>>>>>> df1c2f7 (게시물에 번호 지정하기, 답변 갯수 표시, 스프링 시큐리티 설정)
package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
<<<<<<< HEAD
	
	@NotEmpty(message = "제목은 필수항목입니다.")
	@Size(max = 200)
	private String subject;
	
	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content;
	
=======

	@NotEmpty(message = "제목은 필수항목입니다.")
	@Size(max = 200)
	private String subject;

	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content;
>>>>>>> df1c2f7 (게시물에 번호 지정하기, 답변 갯수 표시, 스프링 시큐리티 설정)

}
