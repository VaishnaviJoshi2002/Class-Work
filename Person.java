/* Create One to One relation between entityPerson and PassportDetails.*/

package com.example.HibernateOneToOneRel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="persondetails")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private String pEmail;
	
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private PassportDetails passport;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pId, String pName, String pEmail) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pEmail = pEmail;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	
	public void setPassport(PassportDetails passport) {
		// TODO Auto-generated method stub
		this.passport =passport;
	}
	public PassportDetails getPassport() {
		// TODO Auto-generated method stub
		return passport;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pEmail=" + pEmail + ", passport=" + passport + "]";
	}
	
	
	
}
