package jbr.springmvc.Dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.List;



import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;



import jbr.springmvc.pojos.Login;

import jbr.springmvc.pojos.User;



public class UserServiceImpl implements UserService {



 @Autowired

  DataSource datasource;

  @Autowired

  JdbcTemplate jdbcTemplate;

  public void register(User user) {

   String sql = "insert into users values(?,?,?,?,?,?,?,?)";

   jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),

   user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone(),user.getAge() });

   }

   public User validateUser(Login login) {

   String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()

   + "'";

   List<User> users = jdbcTemplate.query(sql, new UserMapper());

   return users.size() > 0 ? users.get(0) : null;

   }

 @Override

 public List<User> getAlluser() {

  // TODO Auto-generated method stub

  String sql = "select * from users ";

    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users;



 }

  }

  class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {

   User user = new User();

   user.setUsername(rs.getString("username"));

   user.setPassword(rs.getString("password"));

   user.setFirstname(rs.getString("firstname"));

   user.setLastname(rs.getString("lastname"));

   user.setEmail(rs.getString("email"));

   user.setAddress(rs.getString("address"));

   user.setPhone(rs.getInt("phone"));

   user.setAge(rs.getInt("age"));

   return user;

  }

 }

