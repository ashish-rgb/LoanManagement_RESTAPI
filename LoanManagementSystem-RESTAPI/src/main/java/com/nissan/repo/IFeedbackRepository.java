package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Feedback;


@Repository
public interface IFeedbackRepository extends JpaRepositoryImplementation<Feedback, Integer> {

}
