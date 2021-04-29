package com.weddingapps.weddingvaganza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "superadmin") 

public class SuperadminModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_superadmin") 
	private int superadminId;
	@Column(name = "username_superadmin") 
	private String superadminUsername;
	@Column(name = "email_superadmin")
	private String superadminEmail;
	@Column(name = "password_superadmin")
	private String superadminPassword;
	
}
