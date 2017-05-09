package wat.edu.pl.pz.gui.back.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Password implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2477246889230549025L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String hashedPassword;
	private Date expireDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}
