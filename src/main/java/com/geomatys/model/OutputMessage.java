/**
 * 
 */
package com.geomatys.model;

/**
 * @author macbookpro
 *
 */
public class OutputMessage {

	private String event;
	private String content;
	private String time;

	/** Constructeur
	 * 
	 */
	public OutputMessage(String event, String content, String time) {
		this.event = event;
		this.content = content;
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OutputMessage [event=");
		builder.append(event);
		builder.append(", content=");
		builder.append(content);
		builder.append(", time=");
		builder.append(time);
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

	/**
	 * Getter
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Getter
	 * 
	 * @return the time
	 */
	public String getTime() {
		return time;
	}


}
