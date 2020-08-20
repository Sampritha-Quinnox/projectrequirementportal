package quinnox.sam.projectrequirementportal.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import quinnox.sam.projectrequirementportal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	//@Query("SELECT u FROM User u WHERE u.username = :username")
		public quinnox.sam.projectrequirementportal.entity.User getUserByUsername(@Param("username") String username);



}
