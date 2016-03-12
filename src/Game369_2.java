
public class Game369_2 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) { // 1~99
			int chk = 0;
			int m = i / 10; // 10의 자리
			int n = i % 10; // 1의 자리

			if (m == 0) {
			} else if (m % 3 == 0 || m % 6 == 0 || m % 9 == 0) {
				chk++;
			}

			if (n == 0) {

			} else if (n % 3 == 0 || n % 6 == 0 || n % 9 == 0) {
				chk++;
			}

			// ---출력
			if (chk > 0) {
				System.out.print(i + " ");
				for (int j = 0; j < chk; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}

		}
	}

}
