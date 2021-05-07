package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface authService {
	void loginMember(User user);
	User registerMember(User user);
	User get(String email);
	List<User>getAll();

}
