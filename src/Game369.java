
public class Game369 {
	public static void main(String[] args) {

		for(int i=1; i<100; i++){	// 1~99
			
			String num = i+"";
			int cnt = 0;
			
			if(num.length()==1){
				if(num.equals("3")||num.equals("6")||num.equals("9"))
					System.out.println(num+" 짝");
				
			}else {	// 2자리
				int m = num.charAt(num.length() - 1)-'0';
				int n = num.charAt(0)-'0';
				
				if(m==3 || m==6 || m==9)
					cnt++;
				if(n==3 || n==6 || n==9)
					cnt++;
				
				if(cnt>1)
					System.out.println(num+" 짝짝");
				else
					System.out.println(num+" 짝");
			}
			
			
			
		}

	}
}
