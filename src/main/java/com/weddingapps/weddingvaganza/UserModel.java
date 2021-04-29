package com.weddingapps.weddingvaganza;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl") 
public class UserModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user") 
	private int userId;
	@Column(name = "nama_user") 
	private String userNama;
	@Column(name = "nama_pasangan_user") 
	private String pasanganUser;
	@Column(name = "email_user")
	private String userEmail;
	@Column(name = "password_user")
	private String userPassword;
	@Column(name = "tgl_pernikahan")
	private String tglPernikahan;
	@Column(name = "nomorhp_user")
	private int nomorHPUser;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNama() {
		return userNama;
	}
	public void setUserNama(String userNama) {
		this.userNama = userNama;
	}
	public String getPasanganUser() {
		return pasanganUser;
	}
	public void setPasanganUser(String pasanganUser) {
		this.pasanganUser = pasanganUser;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getTglPernikahan() {
		return tglPernikahan;
	}
	public void setTglPernikahan(String tglPernikahan) {
		this.tglPernikahan = tglPernikahan;
	}
	public int getNomorHPUser() {
		return nomorHPUser;
	}
	public void setNomorHPUser(int nomorHPUser) {
		this.nomorHPUser = nomorHPUser;
	}
	
	
	
}
