package mine;

import java.util.Scanner;
/*
 * do while 문으로
 * 사용자가 q를 입력할 때까지 정수의 합 구하기
 */
public class DoWhile {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("정수를 입력하세요: ");
			String w = scanner.next();
			if (w.equals("q")); {
				System.out.println("입력된 정수의 합은 "+sum+"입니다.");
				break;
			}
			sum += Integer.parseInt(w);
		} while (true);  
		scanner.close();
		
		
	}
}
