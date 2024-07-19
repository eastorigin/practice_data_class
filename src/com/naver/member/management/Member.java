package com.naver.member.management;

/**
 * 회원제 게시판을 이용하는 회원의 정보
 */
public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		// 메모리 분리 코드
		// String 불변 타입 ==> 메모리 분리 필요 X
		return id;
	} // getId 입력하고 Ctrl + Space => Enter
	
	public String getName() {
		return name;
	}
}
