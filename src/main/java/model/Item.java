package model;

import java.util.Date;

public class Item {
	private String task;
	private String date;
	private boolean complete;
	
	public Item(String task){
		this.task = task;
		complete = false;
		Date tempDate = new Date();
		StringBuffer sb = new StringBuffer(tempDate.getMonth()+1 + "/");
		sb.append(tempDate.getDate() + "/");
		sb.append(tempDate.getYear()+1900);
		date = sb.toString();
	}
	@Override
	public boolean equals(Object o){
		if (this == o)
			return true;
		if (!(o instanceof Item))
			return false;
		Item item = (Item) o;
		
		return (getDate().equals(item.getDate()) && getTask().equals(item.getTask()));
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}
