package kim.hashmap.board.service;

import java.util.Scanner;

import kim.hashmap.board.control.BoardAction;

public class BoardDelete implements BoardAction {
	String title;
	String passWord;

	@Override
	public void execute(Scanner scanner) {

		if (arrayList.size() > 0) {
			System.out.print("삭제할 글의 제목을 입력하세요");
			title = scanner.next();

			System.out.print("비밀번호를 입력하세요:");
			passWord = scanner.next();

			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).get("title").equals(title)) {
					if (arrayList.get(i).get("passWord").equals(passWord)) {
						arrayList.remove(i);
						System.out.println("글을 삭제했습니다.");

					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}

				} else {
					System.out.println("일치하는 제목이 없습니다.");
					break;

				}

			}

		} else {
			System.out.println("삭제할 글이 없습니다.");
		
		}

	}

}
