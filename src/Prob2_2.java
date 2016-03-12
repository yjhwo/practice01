
public class Prob2_2 {

	public static void main(String[] args) {

		int start = 1;
		int end = 10;

		for (int j = 0; j < 8; j++) {
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			start++;
			end++;
			System.out.println();
		}
		
	}
}
