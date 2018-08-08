package com.sadhna.example.comparator;

import java.util.Comparator;

import com.sadhna.example.Item;

public class AlphabaticComparator implements Comparator<Item>{

	

	@Override
	public int compare(Item item1, Item item2) {
		if(item1.getName().compareTo(item2.getName()) == 0)
		{
			NumericComparator comp1 = new NumericComparator();
			
			return comp1.compare(item1, item2);
		}
		else{
			return item1.getName().compareTo(item2.getName());
		}
		
	}
	
	
	class NumericComparator implements Comparator<Item>{

		@Override
		public int compare(Item i1, Item i2) {
			
			if(i1.getPrice() > i2.getPrice())
			{
				return 1;
			}
			
			else if(i1.getPrice() < i2.getPrice())
			{
				return -1;
			}
			
			else{
				return 0;
			}
			
		}
		
	}

}
