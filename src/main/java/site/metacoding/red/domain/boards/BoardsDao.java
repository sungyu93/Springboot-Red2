package site.metacoding.red.domain.boards;

import java.util.List;

import site.metacoding.red.web.dto.request.boards.WriteDto;

public interface BoardsDao {
	public void insert(WriteDto writeDto);
	public Boards findById(Integer id);
	public List<Boards> findAll();
	public void delete(Integer id);
	public void update(Boards boards);
	
	// 글쓰기 할 때 title, content, userId 받으면 된다.
	// 날짜는 sysdate로 현재 시간 적으면 된다.
	
}
