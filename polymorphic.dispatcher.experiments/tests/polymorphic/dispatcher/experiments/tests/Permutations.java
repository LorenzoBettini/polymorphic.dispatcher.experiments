package polymorphic.dispatcher.experiments.tests;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String... arg) {
		List<String> a = new ArrayList<>();
		a.add("test1");
		a.add("test2");
		a.add("test3");
		a.add("test4");
		a.add("test5");
		a.add("test6");
		a.add("test7");
		a.add("test8");
		List<List<String>> result = generatePerm(a);
		for (List<String> list : result) {
			System.out.print("[");
			for (String string : list) {
				System.out.print(string + ";");
			}
			System.out.println("]");
		}
		System.out.println("total permutations: " + result.size());
	}

	public static List<List<String>> generatePerm(List<String> original) {
		if (original.size() == 0) {
			List<List<String>> result = new ArrayList<List<String>>();
			result.add(new ArrayList<String>());
			return result;
		}
		String firstElement = original.remove(0);
		List<List<String>> returnValue = new ArrayList<List<String>>();
		List<List<String>> permutations = generatePerm(original);
		for (List<String> smallerPermutated : permutations) {
			for (int index = 0; index <= smallerPermutated.size(); index++) {
				List<String> temp = new ArrayList<String>(smallerPermutated);
				temp.add(index, firstElement);
				returnValue.add(temp);
			}
		}
		return returnValue;
	}
}
