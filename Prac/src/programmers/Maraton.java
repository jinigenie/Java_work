package programmers;

import java.util.Arrays;

public class Maraton {

	public static void main(String[] args) {
		String[] arr = {"aa", "bb", "cc", "ee", "dd"};
		String[] arr2 = {"aa", "bb", "cc", "dd"};

		System.out.println(solution(arr, arr2));
	}

//	public static String test(String[] participant, String[] completion) {
//		
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		for(int i = 0; i < participant.length; i++) {
//			
//			if(Arrays.binarySearch(completion, participant[i]) < 0) {
//				return participant[i];
//			}
//		}
//		
//		return null;
//	}
	
	public static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[participant.length - 1];
	}

}
