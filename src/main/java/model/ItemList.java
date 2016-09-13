package model;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
	private List<Item> items;
	
	public ItemList(){
		items = new ArrayList<Item>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
