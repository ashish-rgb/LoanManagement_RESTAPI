package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Verification;



@Repository
public interface IVerificationRepository extends JpaRepositoryImplementation<Verification, Integer>{

}
