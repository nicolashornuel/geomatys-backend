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
@Table
public class Rectangle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String fileName;
	@Column
	private String fileType;
	@Column
	@Lob
	private byte[] data;
	
	
    /** Constructeur
	 * 
	 */
	public Rectangle() {
	}

	/** 
     * Constructeur
     */
    public Rectangle(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }
    
	/**
	 * toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle[id=");
		builder.append(id);
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append(", fileType=");
		builder.append(fileType);
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
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/** Setter
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/** Getter
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/** Setter
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
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
