package net.pramita.cms.repository;

import java.util.List;



//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import net.pramita.cms.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	
	User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);
		List<User> findByRole(String role);
}
