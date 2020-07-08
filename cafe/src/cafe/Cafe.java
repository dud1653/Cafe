package cafe;

public class Cafe {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.showMenus();
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);// 아메리카노 1,500원 객체가 넘어와야함
	}
}
