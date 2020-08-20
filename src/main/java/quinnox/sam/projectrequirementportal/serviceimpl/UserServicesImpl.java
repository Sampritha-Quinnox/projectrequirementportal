package quinnox.sam.projectrequirementportal.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import quinnox.sam.projectrequirementportal.entity.User;
import quinnox.sam.projectrequirementportal.repository.UserRepository;
import quinnox.sam.projectrequirementportal.service.UserServices;
@Service
public class UserServicesImpl implements UserServices {
	@Autowired
    private UserRepository userRepository;
  @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		 user.setEnabled(1);
		userRepository.save(user);

	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsername(username);
	}

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return (User) userRepository.findById(id).get();
	}

}
