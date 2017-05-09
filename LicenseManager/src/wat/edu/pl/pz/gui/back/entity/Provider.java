package wat.edu.pl.pz.gui.back.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Provider implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3295616305097879667L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@Column(unique = true)
	private long providerIdentificationNumber;

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

	public long getCompnayIdentificationNumber() {
		return providerIdentificationNumber;
	}

	public void setCompnayIdentificationNumber(long compnayIdentificationNumber) {
		this.providerIdentificationNumber = compnayIdentificationNumber;
	}
}
