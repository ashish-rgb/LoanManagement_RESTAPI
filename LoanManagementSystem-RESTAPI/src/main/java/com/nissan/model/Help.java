package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Help")
public class Help {

	//Fields
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int helpId;
		
		@Column(nullable=false,unique=true)
		private String issue;
		private String description;
		
		@JsonIgnore
		@OneToMany(mappedBy="help",cascade=CascadeType.ALL)
		private List<User> users;

		public Help() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Help(int helpId, String issue, String description) {
			super();
			this.helpId = helpId;
			this.issue = issue;
			this.description = description;
		}

		public int getHelpId() {
			return helpId;
		}

		public void setHelpId(int helpId) {
			this.helpId = helpId;
		}

		public String getIssue() {
			return issue;
		}

		public void setIssue(String issue) {
			this.issue = issue;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		

		public List<User> getUsers() {
			return users;
		}

		public void setUsers(List<User> users) {
			this.users = users;
		}

		@Override
		public String toString() {
			return "Help [helpId=" + helpId + ", issue=" + issue + ", description=" + description + ", user=" + users
					+ "]";
		}
		
		
	
}
