import java.util.Random;
import java.util.Scanner;

public class GussNumber_2 {

	public static void main(String[] args) {
		
		int chk = 1;
		String line = null;
		boolean b = true;

		Scanner sc = new Scanner(System.in);
		
		do {
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞춰 보세요.");
			b = true;
			chk = 1;
			
			int start = 1, end = 100;
			
			while (b) {
				
				System.out.println(start + "-" + end);
				System.out.print(chk + ">>");

				int ans = sc.nextInt();

				if (k > ans) {
					System.out.println("더 높게");
					start = ans;
				} else if (k < ans) {
					System.out.println("더 낮게");
					end = ans;
				} else {
					System.out.println("맞았습니다.");
					b = false;
				}
				chk++;
			}
			
			System.out.print("다시 하시겠습니까?(y/n)>>");
			line = sc.next();

		} while (!line.equals("n"));
	}

}
