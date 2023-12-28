package com.pwc.Virtualized.Assets.virtualizedAsset.model;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstname")
	@NotBlank
	@Size(min = 4, max = 50)
	private String firstname;

	@Column(name = "lastname")
	@NotBlank
	@Size(min = 4, max = 50)
	private String lastname;

	@Column(name = "age")
	@NotBlank
	@Email
	@Size(min = 4, max = 50)
	private int age;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstname, id, lastname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(firstname, other.firstname) && id == other.id
				&& Objects.equals(lastname, other.lastname);
	}

}
