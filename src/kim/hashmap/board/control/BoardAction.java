package kim.hashmap.board.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public interface BoardAction {

	ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

	public void execute(Scanner scanner);

}
