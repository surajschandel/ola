/**
 * 
 */
package com.ssc.ola.dto;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * @author SURAJ CHANDEL
 *
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String about;
	private int submitted;
    @SerializedName("updated_at")
	private Date updatedAt;
    @SerializedName("submission_count")
	private int submissionCount;
    @SerializedName("comment_count")
	private int commentCount;
    @SerializedName("created_at")
	private Long createdAt;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the submitted
	 */
	public int getSubmitted() {
		return submitted;
	}
	/**
	 * @param submitted the submitted to set
	 */
	public void setSubmitted(int submitted) {
		this.submitted = submitted;
	}
	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	/**
	 * @return the submissionCount
	 */
	public int getSubmissionCount() {
		return submissionCount;
	}
	/**
	 * @param submissionCount the submissionCount to set
	 */
	public void setSubmissionCount(int submissionCount) {
		this.submissionCount = submissionCount;
	}
	/**
	 * @return the commentCount
	 */
	public int getCommentCount() {
		return commentCount;
	}
	/**
	 * @param commentCount the commentCount to set
	 */
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	/**
	 * @return the createdAt
	 */
	public Long getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", about=" + about + ", submitted=" + submitted
				+ ", updatedAt=" + updatedAt + ", submissionCount=" + submissionCount + ", commentCount=" + commentCount
				+ ", createdAt=" + createdAt + "]";
	}
    
    
}
