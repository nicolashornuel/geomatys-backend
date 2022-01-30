/**
 * 
 */
package com.geomatys.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * @author macbookpro
 *
 */
@Entity
@Table(name="Rectangle")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="fileName")
	private String name;
	@Column(name="fileType")
	private String type;
	@Column
	@Lob
	private byte[] data;
	
	
    /** Constructeur
	 * 
	 */
	public Image() {
	}


	/** Constructeur
	 * 
	 */
	public Image(String name, String type, byte[] data) {
		this.name = name;
		this.type = type;
		this.data = data;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Image [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", data=");
		builder.append(Arrays.toString(data));
		builder.append("]");
		return builder.toString();
	}


	/** Getter
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/** Setter
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/** Getter
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/** Setter
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/** Getter
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/** Getter
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}


	/** Setter
	 * @param data the data to set
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

}
