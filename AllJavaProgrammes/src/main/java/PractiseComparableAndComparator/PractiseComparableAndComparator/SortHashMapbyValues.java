package PractiseComparableAndComparator.PractiseComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapbyValues {

	public static void main(String[] args) {

		HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
		frequencyMap.put("vijaykumar", 4);
		frequencyMap.put("satheeskumar", 2);
		List<Map.Entry<String, Integer>> allEnteries = new ArrayList<Map.Entry<String, Integer>>();
		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet())
			allEnteries.add(entry);
		Collections.sort(allEnteries, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getValue() > o2.getValue()) {
					return 1;
				} else if (o1.getValue() < o2.getValue()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		System.out.println(allEnteries);

	}

}
