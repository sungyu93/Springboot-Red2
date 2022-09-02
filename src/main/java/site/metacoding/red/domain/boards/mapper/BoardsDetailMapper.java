package site.metacoding.red.domain.boards.mapper;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardsDetailMapper {
	private Integer id;
	private String title;
	private String content;
	private Timestamp createAt;
	private Integer usersId;
	private String username;
	private String password;
	private String email;
}
