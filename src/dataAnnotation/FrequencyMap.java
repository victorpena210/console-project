package dataAnnotation;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
	
	public static <T> Map <T,Integer> createFrequencyMap(T[] array) {
		Map<T, Integer> frequencyMap = new HashMap<>();
		for (T element: array) {
			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> wordFrequencies = createFrequencyMap(words);
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
        	
        }

	}

}
