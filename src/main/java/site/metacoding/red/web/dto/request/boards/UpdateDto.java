package site.metacoding.red.web.dto.request.boards;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
	private String title;
	private String content;
	// private Integer usersId; 필요없는데 왜 넣음;

}
