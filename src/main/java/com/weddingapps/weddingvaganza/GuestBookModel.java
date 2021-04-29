package com.weddingapps.weddingvaganza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_book") 

public class GuestBookModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_guestbook") 
	private int guestBookId;
	@Column(name = "id_guest") 
	private int guestId;
	@Column(name = "comment") 
	private String comment;
	@Column(name = "foto_comment") 
	private int fotoComment;
	
	public int getGuestBookId() {
		return guestBookId;
	}
	public void setGuestBookId(int guestBookId) {
		this.guestBookId = guestBookId;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getFotoComment() {
		return fotoComment;
	}
	public void setFotoComment(int fotoComment) {
		this.fotoComment = fotoComment;
	}
	
	
	
	
}
