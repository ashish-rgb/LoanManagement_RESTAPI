package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="LoanType")
public class LoanType {

	//Fields
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int loanTypeId;
		
		@Column(nullable=false,unique=true)
		private String loanTypeName;
		
		
		@JsonIgnore
		@OneToMany(mappedBy="loanType",cascade=CascadeType.ALL)
		private List<Apply> apply;


		public LoanType() {
			super();
			// TODO Auto-generated constructor stub
		}


		public LoanType(int loanTypeId, String loanTypeName) {
			super();
			this.loanTypeId = loanTypeId;
			this.loanTypeName = loanTypeName;
		}


		public int getLoanTypeId() {
			return loanTypeId;
		}


		public void setLoanTypeId(int loanTypeId) {
			this.loanTypeId = loanTypeId;
		}


		public String getLoanTypeName() {
			return loanTypeName;
		}


		public void setLoanTypeName(String loanTypeName) {
			this.loanTypeName = loanTypeName;
		}


		public List<Apply> getApply() {
			return apply;
		}


		public void setApply(List<Apply> apply) {
			this.apply = apply;
		}


		@Override
		public String toString() {
			return "LoanType [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", apply=" + apply + "]";
		}
	
		
		
}
