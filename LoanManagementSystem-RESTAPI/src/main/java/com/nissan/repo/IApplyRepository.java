package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Apply;

@Repository
public interface IApplyRepository extends JpaRepositoryImplementation<Apply, Integer> {

}
