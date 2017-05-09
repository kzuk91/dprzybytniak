package wat.edu.pl.pz.gui.back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1143001609450963721L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String name;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}
