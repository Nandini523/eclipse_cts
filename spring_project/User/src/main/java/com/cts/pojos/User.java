package com.cts.pojos;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "Users")

public class User {
	@Id
	private String username;

	@Column(name = "password", nullable = false, length = 100)

	private String password;

	private Integer id;

	private String usertype;

	private String email;

	private long mobileno;

	private String confirmed;
	private String profileImage;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", id=" + id + ", usertype=" + usertype
				+ ", email=" + email + ", mobileno=" + mobileno + ", confirmed=" + confirmed + ", profileImage="
				+ profileImage + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
		
}
	