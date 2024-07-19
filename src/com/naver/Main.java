package com.naver;

import java.util.Random;
import java.util.Scanner;

import com.naver.member.management.Member;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("", "");
		
		com.naver.bbs.management.Member otherMember = new com.naver.bbs.management.Member("", "");
		// 패키지는 다른데 class 이름이 같으면 한 쪽은 다 적어줘야 한다
		
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		String abc = "";
	}
}
