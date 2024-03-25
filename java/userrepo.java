package g.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import g.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

}
