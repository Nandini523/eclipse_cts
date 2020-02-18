package jbr.springmvc.servicehibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jbr.springmvc.daohibernate.UserHibernateDao;
import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;
@Service
public class UserHibernateServiceImpl implements UserHibernateService {
@Autowired
UserHibernateDao userHibernateDao;
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userHibernateDao.register(user);
		
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return null;
	}

}
