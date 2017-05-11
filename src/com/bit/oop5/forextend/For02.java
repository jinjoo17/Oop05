package com.bit.oop5.forextend;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//키보드 사용준비
		System.out.println("단 입력>>");//prompt
		String input=scanner.nextLine();//키보드에서 입력
		int intDan=0;
		try {
			int intDan1 = Integer.valueOf(input);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 와야 합니다.");
		}
		
		if(intDan >0 && intDan <10){
			
			
		}
		if(intDan>0&&intDan<10){
		;//문자열을 숫자로
		for(int i=1; i<10;i++){
			System.out.printf("%d x %d = %d\n",4,i,4*i);
		}

	}

	}
}
