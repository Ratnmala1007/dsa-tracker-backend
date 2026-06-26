package com.dsa.tracker.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Problem {
	public Problem() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	long id;
	
    @NotBlank(message = "Title is required")

	private String title;
	private String topic;
	
    @NotBlank(message = "Difficulty is required")

	private String difficulty;
    @NotBlank(message = "Status is required")

    private String status;
    @NotBlank(message = "ProblemLink is required")

    private String problemLink;


	private String platform;
	
	@Column(length = 1000)
	
	private String notes;
	
	@NotNull(message = "Date is required")
	@JsonFormat(pattern = "yyyy-MM-dd")

	private LocalDate dateSolved;
	

	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public LocalDate getDateSolved() {
		return dateSolved;
	}
	public void setDateSolved(LocalDate dateSolved) {
		this.dateSolved = dateSolved;
	}
    
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String name) {
		this.title = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProblemLink() {
		return problemLink;
	}
	public void setProblemLink(String problemLink) {
		this.problemLink = problemLink;
	}
}
