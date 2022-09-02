package site.metacoding.red.web.dto.request.boards;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WriteDto {
	private String title;
	private String content;
	private Integer usersId;
	// private Integer usersId; dto는 사용자와 통신하기 위한
	// 데이터 통신이기 때문에 사용자가 usersId를 아는 게 아니다. 
	// 그래서 안 받아도 됨. 
	// 로그인하면 알 수 있다. 아무튼 안 받음
}
