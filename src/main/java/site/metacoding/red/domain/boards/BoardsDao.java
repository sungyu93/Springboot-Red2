package site.metacoding.red.domain.boards;

import java.util.List;

import site.metacoding.red.domain.boards.mapper.BoardsDetailMapper;
import site.metacoding.red.web.dto.request.boards.WriteDto;

public interface BoardsDao {
	public Boards findById(Integer id);
	public List<Boards> findAll();
	public void insert(WriteDto writeDto);
	public void delete(Integer id);
	public void update(Boards boards);
	public BoardsDetailMapper findByIdtoDetail(Integer id);
	// Boards는 다른 dto를 만들게 되면 다른 걸 넣어주는 거 생각하기
	
	// 글쓰기 할 때 title, content, userId 받으면 된다.
	// 날짜는 sysdate로 현재 시간 적으면 된다.
	
}
