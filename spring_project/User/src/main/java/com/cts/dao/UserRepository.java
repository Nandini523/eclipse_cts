package com.cts.dao;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.*;
public interface UserRepository extends CrudRepository<User, String> {

	

	Optional<User> findByEmail(String emailId);

	User findByUsernameAndPasswordAndConfirmed(String username, String password, String string);	

}
