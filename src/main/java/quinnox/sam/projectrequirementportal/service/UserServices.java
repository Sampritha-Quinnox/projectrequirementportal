package quinnox.sam.projectrequirementportal.service;

import quinnox.sam.projectrequirementportal.entity.User;

public interface UserServices {
	
	void save(User user);

	User getUserByUsername(String username);
	public User get(Long id);

}
