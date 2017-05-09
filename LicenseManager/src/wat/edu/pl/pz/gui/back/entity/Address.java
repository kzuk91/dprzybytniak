package wat.edu.pl.pz.gui.back.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2789617592500527665L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String street;
	private int houseNumber;
	private int localNumber;
	private String city;
	@OneToOne
	private PostalCode postCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PostalCode getPostCode() {
		return postCode;
	}

	public void setPostCode(PostalCode postCode) {
		this.postCode = postCode;
	}

	public String toString(){
		return city+" "+street+" "+houseNumber+"/"+localNumber+" ";
	}
}
