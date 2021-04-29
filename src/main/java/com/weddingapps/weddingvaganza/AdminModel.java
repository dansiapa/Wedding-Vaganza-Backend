package com.weddingapps.weddingvaganza;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_tbl") 

public class AdminModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_admin") 
	private int adminId;
	@Column(name = "nama_admin") 
	private String adminNama;
	@Column(name = "email_admin")
	private String adminEmail;
	@Column(name = "password_admin")
	private String adminPassword;
	@Column(name = "nomorhp_admin")
	private int nomorHPAdmin;
	@Column(name = "alamat_admin")
	private String adminAlamat;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminNama() {
		return adminNama;
	}
	public void setAdminNama(String adminNama) {
		this.adminNama = adminNama;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getNomorHPAdmin() {
		return nomorHPAdmin;
	}
	public void setNomorHPAdmin(int nomorHPAdmin) {
		this.nomorHPAdmin = nomorHPAdmin;
	}
	public String getAdminAlamat() {
		return adminAlamat;
	}
	public void setAdminAddress(String adminAlamat) {
		this.adminAlamat = adminAlamat;
	}
	
	

}
