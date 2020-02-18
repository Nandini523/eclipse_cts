package jbr.springmvc.daohibernate;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;
@Repository
public class UserHibernateDaoImpl implements UserHibernateDao {
@Autowired

 private SessionFactory hibernate4AnnotatedSessionFactory;

 @Override

 public void register(User user) {

 // TODO Auto-generated method stub

 if(hibernate4AnnotatedSessionFactory!=null)

 {

  hibernate4AnnotatedSessionFactory.getCurrentSession().save(user);
 }
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

