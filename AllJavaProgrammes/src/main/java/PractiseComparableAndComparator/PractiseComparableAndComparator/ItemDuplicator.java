package PractiseComparableAndComparator.PractiseComparableAndComparator;

import java.util.HashSet;

public class ItemDuplicator {

	public static void main(String[] args) {

		HashSet<Item> itemsList = new HashSet<Item>();

		Item itemOne = new Item(101, "arial");
		Item itemTwo = new Item(101, "arial");
		Item itemThree = new Item(101, "arial");
		Item itemFour = new Item(101, "arial");

		itemsList.add(itemOne);
		itemsList.add(itemTwo);
		itemsList.add(itemThree);
		itemsList.add(itemFour);

		for (Item item : itemsList) {
			System.out.println(item);
		}

	}

}
