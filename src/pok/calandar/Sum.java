package pok.calandar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//두수를 키보드로 입력한다.
		//두수의 합읠 출력한다.
		
		Scanner sc = new Scanner(System.in);
		String param = sc.nextLine();
		
		String[] val = param.split(",");
		
		int val1 = Integer.parseInt(val[0]);
		int val2 = Integer.parseInt(val[1]);
		
		System.out.println(val1+val2);

	}

}
