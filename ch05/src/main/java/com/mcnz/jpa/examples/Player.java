package com.mcnz.jpa.examples;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="player", schema="hibernate_examples")
public class Player {
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Id @GeneratedValue
	private Long id;
	
	@Basic private String password;
	
	@Column(name="handle", unique=true)
	private String loginName;
	
	@Transient
	private String encyrptedPassword;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date lastAccessTime;
	
	@Basic private boolean verified;
	
	@Basic private String emailAddress;
	
	@Temporal(TemporalType.DATE)
	@Column(updatable=false)
	private java.time.LocalDate registrationDate;
	
	
	public String getEncyrptedPassword() {
		return encyrptedPassword;
	}
	public void setEncyrptedPassword(String encyrptedPassword) {
		this.encyrptedPassword = encyrptedPassword;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public java.util.Date getLastAccessTime() {
		return lastAccessTime;
	}
	public void setLastAccessTime(java.util.Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}
	public java.time.LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(java.time.LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
