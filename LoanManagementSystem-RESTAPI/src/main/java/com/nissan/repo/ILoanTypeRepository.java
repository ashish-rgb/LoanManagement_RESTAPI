package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.LoanType;


@Repository
public interface ILoanTypeRepository extends JpaRepositoryImplementation<LoanType,Integer> {

}
