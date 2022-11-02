package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.User;


@Repository
public  interface IUserRepository extends JpaRepositoryImplementation<User, Integer>{

	

	

}
