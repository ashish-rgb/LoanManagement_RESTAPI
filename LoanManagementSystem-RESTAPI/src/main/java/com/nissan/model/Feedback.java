package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int feedbackId;
	private String question;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Feedback(int feedbackId, String question) {
		super();
		this.feedbackId = feedbackId;
		this.question = question;
	}
	
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", question=" + question + "]";
	}
}
