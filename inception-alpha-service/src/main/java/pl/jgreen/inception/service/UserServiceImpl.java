package pl.jgreen.inception.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jgreen.inception.entity.User;
import pl.jgreen.inception.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public String getUserName(long id) {
		User user = userRepository.findOne(id);
		return "User name is: " + user.getName();
	}
	
}
