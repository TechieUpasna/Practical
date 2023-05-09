package com.upasna.batch4119.SBBatch41191HM.model;

import jakarta.persistence.*;

@Entity
@Table(name="Person_info")
public class Person {
	@Id  //this will make all of them as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="Pname")
	private String name;
	@Column(name="address")
	private String address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adhaar")
	private Adhaar adha;
	public Adhaar getAdha() {
	return adha;
	}
	public void setAdha(Adhaar adha) {
	this.adha = adha;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person() {
		
	}

}
