package pok.calandar;

import java.util.Scanner;

public class Calandar {
	private static final int[] MAX_OF_DAY =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
	public int getMaxOfDay(int i) {
		return MAX_OF_DAY[i-1];
	}

	public void sampleCalandar() {
		System.out.println("월   화   수   목   금   토  일");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31            ");
	}
	public static void main(String[] args) {
		
		Calandar calandar = new Calandar();
		calandar.sampleCalandar();
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if(month>=1 && month<12) {
			System.out.println(calandar.getMaxOfDay(month));
		}else {
			System.out.println("월은 1월부터 12월까지만 가능합니다");
		}
		sc.close();
	}

}
