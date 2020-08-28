package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "User")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	@NotEmpty
	private int userId;
	@Column(name = "UserFirstName")
	@NotEmpty
	@Length(min=5)
	private String userFirstName;
	@Column(name = "UserLastName")
	@NotEmpty
	private String userLastName;
	@Column(name = "UserName")
	@NotEmpty
	private String userName;
	@Column(name = "UserEmail")
	@NotEmpty
	@Email
	private String userEmail;
	@Column(name = "UserPassword")
	@Length(min=10)
	private String userPassword;
	@Column(name = "ProfilePicture")
	private String profilePicture;
	@Column(name = "Active")
	private boolean active = true;
	
}