

public class Prob2 {

	public static void main(String[] args) {
		
		int start = 1;
		int end = 10;
		
		for(int i=1; i<9; i++){
			for(int j=start; j<=end; j++){
				System.out.print(j+" ");
			}
			System.out.println();
			start++;
			end++;
		}
		
	}

}
