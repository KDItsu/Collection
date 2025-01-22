
package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	  
	private LocalDate date;
	private String content;
	
	Task(LocalDate date, String content) {
		this.setDate(date);
		this.setContent(content);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return date + ":" + content;
	}
	
	@Override
	public int compareTo(Task other) {
		return this.date.compareTo(other.date);
	}
}