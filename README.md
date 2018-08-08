# ObjectSort-with-comparator


This is simple java program to sort a java object with two attributes.
For Eg: You have this kind of items in your store.
      
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
      
      And you want to sort the item with Alphabatic order and if your item names are same then that group should 
      be sorted with prices, 
      like this,
      
      Name: 004  Price of Item: 240.0
      Name: ABC  Price of Item: 130.0
      Name: ABC  Price of Item: 155.0
      Name: ABC  Price of Item: 176.0
      Name: ELECT  Price of Item: 67.0
      Name: ELECT  Price of Item: 99.0
      Name: ELECT  Price of Item: 150.0
      Name: ELECT  Price of Item: 175.0
      Name: IT  Price of Item: 99.0
      Name: IT  Price of Item: 234.0
      Name: MEC  Price of Item: 78.0
      Name: MEC  Price of Item: 230.0
      
      
      Here I used two comparators for this requirement, one is to sort items in alphatical order, 
      and other one is to sort the item with respect to prices


      
      
      
		
