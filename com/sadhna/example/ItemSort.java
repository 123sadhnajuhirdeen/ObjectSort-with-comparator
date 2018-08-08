package com.sadhna.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sadhna.example.comparator.AlphabaticComparator;

public class ItemSort {

	private List<Item> itemList = new ArrayList<>(10);
	
	
	
	public List<Item> createItems()
	{
		Item item1 = new Item();
		item1.setName("ABC");
		item1.setPrice(176);
		
		Item item2 = new Item();
		item2.setName("ABC");
		item2.setPrice(155);
		
		Item item3 = new Item();
		item3.setName("ELECT");
		item3.setPrice(150);
		
		Item item4 = new Item();
		item4.setName("ELECT");
		item4.setPrice(175);
		
		Item item5 = new Item();
		item5.setName("004");
		item5.setPrice(240);
		
		Item item6 = new Item();
		item6.setName("ABC");
		item6.setPrice(130);
		
		Item item7 = new Item();
		item7.setName("MEC");
		item7.setPrice(230);
		
		Item item8 = new Item();
		item8.setName("ELECT");
		item8.setPrice(67);
		
		Item item9 = new Item();
		item9.setName("MEC");
		item9.setPrice(78);
		
		Item item10 = new Item();
		item10.setName("ELECT");
		item10.setPrice(99);
		
		Item item11 = new Item();
		item11.setName("IT");
		item11.setPrice(234);
		
		Item item12 = new Item();
		item12.setName("IT");
		item12.setPrice(99);
		
		
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		itemList.add(item6);
		itemList.add(item7);
		itemList.add(item8);
		itemList.add(item9);
		itemList.add(item10);
		itemList.add(item11);
		itemList.add(item12);
		
		return itemList;
	}
	
	
	public static void main(String[] args) {
		
		ItemSort itemSort = new ItemSort();
		
		List<Item> myItem = itemSort.createItems();
		
		 Collections.sort(myItem,new AlphabaticComparator());
		 
		 
		 System.out.println("List after the use of" +
                 " Collection.sort()  :\n" +
                 myItem);
		 
		 for(Item i1:myItem)
		 {
			 System.out.println("Name: " + i1.getName() + "  Price of Item: " + i1.getPrice());
		 }
		
	}

}
