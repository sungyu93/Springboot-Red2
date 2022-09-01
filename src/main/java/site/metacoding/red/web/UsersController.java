package site.metacoding.red.web;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import oracle.jdbc.proxy.annotation.Post;
import site.metacoding.red.domain.users.Users;
import site.metacoding.red.domain.users.UsersDao;
import site.metacoding.red.web.dto.request.users.JoinDto;
import site.metacoding.red.web.dto.request.users.UpdateDto;
import site.metacoding.red.web.dto.response.RespDto;

@RequiredArgsConstructor
@RestController
public class UsersController {

	private final UsersDao usersDao;
	
	@GetMapping("/users/{id}")
	public RespDto<?> getUsers(@PathVariable Integer id) {
		return new RespDto<>(1, "성공", usersDao.findById(id));
	}
	
	@GetMapping("/users")
	public RespDto<?> getUserList(){
		return new RespDto<>(1, "성공", usersDao.findAll());
	}
	
	@PostMapping("/users")
	public RespDto<?> insert(JoinDto joinDto){
		// 유효성 검사
		usersDao.insert(joinDto);
		return new RespDto<>(1, "회원가입성공", null);
	}
	
	@DeleteMapping("/users/{id}")
	public RespDto<?> delete(@PathVariable Integer id){
		usersDao.delete(id);
		return new RespDto<>(1, " 탈퇴성공", null);
	}
	
	@PutMapping("/users/{id}")
	public RespDto<?> update(@PathVariable Integer id, UpdateDto updateDto){
		// 1번 영속화
		Users  usersPs = usersDao.findById(id);
		// 2번 변경
		usersPs.전체수정(updateDto);
		// 3번 전체
		usersDao.update(usersPs);
		return new RespDto<>(1, "전체수정성공", null);
	}
	
	@PutMapping("/users/{id}/password")
	public RespDto<?> updatepassword(@PathVariable Integer id, String password){
		Users usersPs = usersDao.findById(id);
		usersPs.패스워드수정(password);
		usersDao.update(usersPs);
		return new RespDto<>(1, "비밀번호변경성공", null);
	}
	
	@PutMapping("/users/{id}/email")
	public RespDto<?> updateemail(@PathVariable Integer id, String email){
		Users usersPs = usersDao.findById(id);
		usersPs.이메일수정(email);
		usersDao.update(usersPs);
		return new RespDto<>(1, "이메일변경성공", null);
	}

}
