package kim.hashmap.board.service;

import java.util.HashMap;
import java.util.Scanner;

import kim.hashmap.board.control.BoardAction;

public class BoardWirte implements BoardAction {

	@Override
	public void execute(Scanner scanner) {
		String writer;
		String email;
		String title;
		String content;
		String passWord;

		System.out.print("이름을 입력하세요: ");
		writer = scanner.next();
		System.out.println();

		System.out.print("이메일을 입력하세요: ");
		email = scanner.next();
		System.out.println();

		System.out.print("제목을 입력하세요: ");
		title = scanner.next();
		System.out.println();

		System.out.print("내용을 입력하세요: ");
		content = scanner.next();
		System.out.println();

		System.out.print("비밀번호를 입력하세요: ");
		passWord = scanner.next();
		System.out.println();

		HashMap<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("writer", writer);
		hashMap.put("email", email);
		hashMap.put("title", title);
		hashMap.put("content", content);
		hashMap.put("passWord", passWord);

		addArtcle(hashMap);
		System.out.println("글을 등록했습니다.");

	}

	public void addArtcle(HashMap<String, String> hashMap) {
		arrayList.add(hashMap);

	}

}
