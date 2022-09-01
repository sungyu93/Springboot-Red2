package site.metacoding.red.domain.users;

import java.util.List;

import site.metacoding.red.web.dto.request.users.JoinDto;

public interface UsersDao {
	public Users findById(Integer id);
	public List<Users> findAll();
	public void insert(JoinDto joinDto);
	public void delete(Integer id);
	public void update(Users users);
}
