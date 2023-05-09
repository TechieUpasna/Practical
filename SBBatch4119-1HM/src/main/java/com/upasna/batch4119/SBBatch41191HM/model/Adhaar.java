package com.upasna.batch4119.SBBatch41191HM.model;

import jakarta.persistence.*;

@Entity
@Table
public class Adhaar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adhaar_id")
	private long id;
	@Column(name="adhaar")
	private long adhaar;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}
	public Adhaar(long adhaar) {
		super();
		this.adhaar = adhaar;
	}
	public Adhaar() {
		
	}
	
	
	

}
