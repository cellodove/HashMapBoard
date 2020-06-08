package kim.hashmap.board.service;

import java.util.Scanner;

import kim.hashmap.board.control.BoardAction;

public class BoardList implements BoardAction {

	@Override
	public void execute(Scanner scanner) {
		
		if(arrayList.size()>0) {
			for(int i = 0; i<arrayList.size(); i++) {
				System.out.println("============================");
				System.out.print("작성자:");
				System.out.println(arrayList.get(i).get("writer"));
				
				System.out.print("이메일:");
				System.out.println(arrayList.get(i).get("email"));
				
				System.out.println("제목");
				System.out.println(arrayList.get(i).get("title"));
				
				System.out.println("내용");
				System.out.println(arrayList.get(i).get("content"));
				System.out.println("============================");
			}
			
		}else {
			System.out.println("============================");
			System.out.println("작성된 글이 없습니다.");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
