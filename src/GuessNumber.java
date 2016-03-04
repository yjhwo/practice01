import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		while (true) {

			Random r = new Random();
			int ans = r.nextInt(100) + 1; // 1~100

			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("1-100");

			Scanner sc = new Scanner(System.in);
			boolean chk = true;
			int cnt = 1;
			int start = 1, end = 100;

			while (chk) {
				System.out.print((cnt++) + ">>");
				int user = sc.nextInt();

				if (ans > user) {
					start = user;
					System.out.println("더 높게");
					System.out.println(start + "-" + end);
				} else if (ans < user) {
					end = user;
					System.out.println("더 낮게");
					System.out.println(start + "-" + end);
				} else {
					System.out.println("맞았습니다.");
					chk = false;
				}

			}

			System.out.print("다시 하시겠습니까?(y/n)>>");
			String ch = sc.next();
			if (ch.equals("n"))
				break;
		}

	}
}
