package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Help;



@Repository
public interface IHelpRepository extends JpaRepositoryImplementation<Help, Integer> {

}
