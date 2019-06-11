package com.biz.exec;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("국가명(영문으로) >>");
			String strNation = scan.nextLine();
			if (strNation.equalsIgnoreCase("KOREA")) {
				System.out.println("대한민국 사람이군요");
			}
			if (strNation.equalsIgnoreCase("USA")) {
				System.out.println("미국 사람이군요");
			}
			if (strNation.equalsIgnoreCase("CHINA")) {
				System.out.println("중국 사람이군요");
			} else if(strNation.equals("--END")) {
				System.out.println("안녕!");
				break;
			} else {
				System.out.println("모르겠는데요!");
			
		}

	}
}
}	