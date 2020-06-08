package kim.hashmap.board.service;

import java.util.HashMap;
import java.util.Scanner;

import kim.hashmap.board.control.BoardAction;

public class BoardUpdate implements BoardAction {

	@Override
	public void execute(Scanner scanner) {
		String title;
		String passWord;



		if (arrayList.size() > 0) {
			System.out.print("수정할 글의 제목을 입력하세요:");
			title = scanner.next();
			System.out.println();

			System.out.print("비밀번호를 입력하세요:");
			passWord = scanner.next();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).get("title").equals(title)) {
					
					if (arrayList.get(i).get("passWord").equals(passWord)) {

						arrayList.remove(i);

						System.out.println("======수정=======");
						System.out.print("수정할 작성자: ");
						String writer = scanner.next();
						
						System.out.print("수정할 이 메일 : ");
						String email = scanner.next();
						System.out.print("수정할 글 제목 : ");
						String newTitle = scanner.next();
						System.out.print("수정할 글 내용 : ");
						String content = scanner.next();
						HashMap<String, String> hashMap = new HashMap<String, String>();

						hashMap.put("writer", writer);
						hashMap.put("title", newTitle);
						hashMap.put("email", email);
						hashMap.put("content", content);
						hashMap.put("password", passWord);

						System.out.println("수정이 완료되었습니다.");

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
			System.out.println("등록된 글이 없습니다.");
			
		}

	}

}
