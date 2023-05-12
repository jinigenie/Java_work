package quiz15;

public class IBagClass implements IBag {

	String[] arr = new String[100];
	int i = 0;
	
	public void insert(String item) {
		//저장 - 매개변수를 배열에 순서대로 저장
		arr[i] = item;
		i++;
	}
	public void print() {
		//출력 - 배열안에 개수만큼 출력
		for(int j = 0; j < i; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	public int search(String item) {
		//검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
		int j = 0;
		while(j < i) {
			if(arr[j].equals(item)) return j;
			j++;
		}
		return -1;
	}
	
	public boolean delete(String item) {
		//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)

		for(int j = 0; j < i; j++) {
			if(arr[j].equals(item)) {
				for(int k = j; k < i; k++) {
					arr[k] = arr[k];
				}
				arr[i] = null;
				i--;
				return true;
			}
		}
		return false;
	}

	
}
