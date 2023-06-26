package quang.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.insertPhone("Z", "123456789");
		phoneBook.insertPhone("A", "987654321");
		phoneBook.insertPhone("B", "987654321");
		phoneBook.insertPhone("C", "000000000");
		phoneBook.insertPhone("D", "8888888888");

		phoneBook.searchPhone("A");

		phoneBook.removePhone("Z");

		phoneBook.updatePhone("A", "8000000 đã đổi số");

		phoneBook.sort();

		// In ra danh sách điện thoại sau khi được sắp xếp
		for (String entry : phoneBook.PhoneList) {
			System.out.println(entry);
		}

	}

}
