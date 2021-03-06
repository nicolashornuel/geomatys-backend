/**
 * 
 */
package com.geomatys.model;

/**
 * @author macbookpro
 *
 */
public class Message {

	private String event;
	private String content;
	
	/** Constructeur
	 * 
	 */
	public Message(String event, String content) {
		this.event = event;
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [event=");
		builder.append(event);
		builder.append(", content=");
		builder.append(content);
		builder.append("]");
		return builder.toString();
	}

	/** Getter
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/** Setter
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/** Getter
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/** Setter
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}



}