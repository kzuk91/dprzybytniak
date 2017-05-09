package wat.edu.pl.pz.gui.back.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostalCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2087454928172958208L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String code;
	private String city;
	private String voivoid;

	public long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getCity() {
		return city;
	}

	public String getVoivoid() {
		return voivoid;
	}
	public String toString(){
		return code+" "+city+" "+voivoid;
	}
}
