package com.weddingapps.weddingvaganza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest") 


public class GuestModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_guest") 
	private int guestId;
	@Column(name = "id_class") 
	private int classId;
	@Column(name = "nama_guest") 
	private String guestNama;
	@Column(name = "nomor_hp_guest") 
	private int nomorHPGuest;
	@Column(name = "email_guest") 
	private String guestEmail;
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getGuestNama() {
		return guestNama;
	}
	public void setGuestNama(String guestNama) {
		this.guestNama = guestNama;
	}
	public int getNomorHPGuest() {
		return nomorHPGuest;
	}
	public void setNomorHPGuest(int nomorHPGuest) {
		this.nomorHPGuest = nomorHPGuest;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	

}
