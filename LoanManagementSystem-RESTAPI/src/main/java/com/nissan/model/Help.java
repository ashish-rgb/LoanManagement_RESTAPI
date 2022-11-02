package com.nissan.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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

		


		@Override
		public String toString() {
			return "Help [helpId=" + helpId + ", issue=" + issue + ", description=" + description 
					+ "]";
		}
		
		
	
}
