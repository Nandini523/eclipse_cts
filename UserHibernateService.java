package jbr.springmvc.servicehibernate;

import java.util.List;

import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;

public interface UserHibernateService {
	void register(User user);
	  User validateUser(Login login);
List<User>getAlluser();
}
