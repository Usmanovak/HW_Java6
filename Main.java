import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Notebook> note = new HashSet<>();
		Map<Integer, String> ask = new HashMap<>();
		Map<String, String> filter = new HashMap<>();
		Set<Notebook> showModels = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		note.add(new Notebook("Lenovo", 16, "Windows 10", "Silver", 512));
		note.add(new Notebook("Acer", 8, "Windows 10", "White", 256));
		note.add(new Notebook("Mac", 16, "MacOS", "Black", 800));
		note.add(new Notebook("Lenovo", 8, "Linux", "Black", 1000));
		note.add(new Notebook("Huawei", 8, "Windows 10", "Silver", 1000));

		ask.put(1, "model");
		ask.put(2, "ram");
		ask.put(3, "os");
		ask.put(4, "color");
		ask.put(5, "hard");

		for (Map.Entry entry : ask.entrySet()) {
			System.out.println(
					"Введите критерий " + entry.getValue() + " или нажмите 0, если это не важно : ");
			String value = scanner.nextLine();
			filter.put((String) entry.getValue(), value);
		}
		scanner.close();

		for (Notebook entry : note) {
			if ((entry.getModel().equals(filter.get("model")) || filter.get("model").equals("0")) &&
					entry.getRam() >= Integer.parseInt(filter.get("ram")) &&
					(entry.getOs().equals(filter.get("os")) || filter.get("os").equals("0")) &&
					(entry.getColor().equals(filter.get("color")) || filter.get("color").equals("0")) &&
					entry.getHard() >= Integer.parseInt(filter.get("hard"))) {
				showModels.add(entry);
			}
		}
		System.out.println("Подходящие модели:");
		for (Notebook notebook : showModels) {
			System.out.println(notebook);
		}
	}

}