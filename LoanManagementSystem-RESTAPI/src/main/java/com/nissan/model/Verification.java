package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Verification")
public class Verification {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int verId;
	private String verUpdate;
	private String verDesc;
	private String verStatus;
	
	@JoinColumn(name="roleId",insertable=false,updatable=false)//user.roleid=role.roleid

	@ManyToOne
	private Role role;
	public Verification(int verId, String verUpdate, String verDesc, String verStatus, Role role) {
		super();
		this.verId = verId;
		this.verUpdate = verUpdate;
		this.verDesc = verDesc;
		this.verStatus = verStatus;
		this.role = role;
	}
	public Verification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getVerId() {
		return verId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setVerId(int verId) {
		this.verId = verId;
	}
	public String getVerUpdate() {
		return verUpdate;
	}
	public void setVerUpdate(String verUpdate) {
		this.verUpdate = verUpdate;
	}
	public String getVerDesc() {
		return verDesc;
	}
	public void setVerDesc(String verDesc) {
		this.verDesc = verDesc;
	}
	public String getVerStatus() {
		return verStatus;
	}
	public void setVerStatus(String verStatus) {
		this.verStatus = verStatus;
	}
	
	@Override
	public String toString() {
		return "Verification [verId=" + verId + ", verUpdate=" + verUpdate + ", verDesc=" + verDesc + ", verStatus="
				+ verStatus + ", role=" + role + "]";
	}
	
}
