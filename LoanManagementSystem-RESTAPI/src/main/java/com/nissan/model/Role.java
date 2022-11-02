package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleId;
	private String roleName;
	
	//for one role many users
	@JsonIgnore
	@OneToMany(mappedBy="role", cascade=CascadeType.ALL)
	private List<User> users;
	
	@JsonIgnore
	@OneToMany(mappedBy="role", cascade=CascadeType.ALL)
	private List<Verification> verifications;
	
	

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Role(int roleId, String roleName, List<User> users, List<Verification> verifications) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.users = users;
		this.verifications = verifications;
	}


	public List<Verification> getVerifications() {
		return verifications;
	}

	public void setVerifications(List<Verification> verifications) {
		this.verifications = verifications;
	}

	
	

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", users=" + users + ", verifications="
				+ verifications + "]";
	}
	
}
