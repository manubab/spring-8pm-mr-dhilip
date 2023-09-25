package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.entity.UserEntity;
@Repository
public interface UsersRepo extends JpaRepository<UserEntity, String> {

	
	UserEntity findByEmailIdAndPassword(String emailId,String password);
}
