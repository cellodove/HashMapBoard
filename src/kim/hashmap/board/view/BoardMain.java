package kim.hashmap.board.view;

import java.util.Scanner;

import kim.hashmap.board.service.BoardDelete;
import kim.hashmap.board.service.BoardList;
import kim.hashmap.board.service.BoardUpdate;
import kim.hashmap.board.service.BoardWirte;

public class BoardMain {
	public static void main(String[] args) {
		boolean onOff = false;
		Scanner scanner = new Scanner(System.in);
		int menu;

		do {
			System.out.println("====================게시판=====================");
			System.out.println();
			System.out.println("[1] 글검색, [2]글 작성, [3]글 수정, [4]글 삭제, [5]종료");
			System.out.print("입력하세요:");
			menu = scanner.nextInt();
			
			

			switch (menu) {
			case 1:
				BoardList boardList = new BoardList();
				boardList.execute(scanner);
				break;
				
			case 2:
				BoardWirte boardWirte = new BoardWirte();
				boardWirte.execute(scanner);
				break;
				
			case 3:
				BoardUpdate boardUpdate = new BoardUpdate();
				boardUpdate.execute(scanner);
				break;
				
			case 4:
				BoardDelete boardDelete = new BoardDelete();
				boardDelete.execute(scanner);

				break;
			case 5:
				onOff = true;
				System.out.println("시스템을 종료합니다.");
				break;

			}

		} while (!onOff);
		scanner.close();

	}

}
