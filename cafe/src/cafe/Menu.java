package cafe;

import java.util.LinkedList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new LinkedList<MenuItem>();

	public Menu() {
		init();
	}

	public List<MenuItem> init() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카푸치노", 2000));
		arr.add(new MenuItem("카라멜 마키아또", 2500));
		arr.add(new MenuItem("에스프레소", 2500));
		return arr;
	}

	public void showMenus() {
		int i = 1;
		System.out.println("----------Menu----------");
		for(MenuItem menu : arr) {
			System.out.printf("%d. %s\n",i, menu);
			i++;
		}
		System.out.println("------------------------");
	}
	
	public MenuItem choose(int index) {
		return arr.get(index);
	}

}
