package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Apply")
public class Apply {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int applId;
	
	@Column(nullable=false)
	private String applName;
	private String applPhone;
	private String applEmail;
	private int amount;
	private int period;
	private String address;
	
	@JoinColumn(name ="loanTypeId" ,insertable=false,updatable=false)	 //role_role.role_id	
	@ManyToOne
	private LoanType loanType;
	
	@JsonIgnore
	@OneToMany(mappedBy="apply",cascade=CascadeType.ALL)
	private List<User> users;

	public Apply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apply(int applId, String applName, String applPhone, String applEmail, int amount, int period,
			String address) {
		super();
		this.applId = applId;
		this.applName = applName;
		this.applPhone = applPhone;
		this.applEmail = applEmail;
		this.amount = amount;
		this.period = period;
		this.address = address;
	}

	public int getApplId() {
		return applId;
	}

	public void setApplId(int applId) {
		this.applId = applId;
	}

	public String getApplName() {
		return applName;
	}

	public void setApplName(String applName) {
		this.applName = applName;
	}

	public String getApplPhone() {
		return applPhone;
	}

	public void setApplPhone(String applPhone) {
		this.applPhone = applPhone;
	}

	public String getApplEmail() {
		return applEmail;
	}

	public void setApplEmail(String applEmail) {
		this.applEmail = applEmail;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Apply [applId=" + applId + ", applName=" + applName + ", applPhone=" + applPhone + ", applEmail="
				+ applEmail + ", amount=" + amount + ", period=" + period + ", address=" + address + ", loanType="
				+ loanType + ", users=" + users + "]";
	}
	
	
	
}
