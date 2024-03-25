package g.service;

import g.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}
