package quinnox.sam.projectrequirementportal.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import quinnox.sam.projectrequirementportal.entity.User;
import quinnox.sam.projectrequirementportal.repository.UserRepository;



public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user =userRepository.getUserByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("user name not found");
		}
		return new MyUserDetailsImpl(user);
	}
	

}
