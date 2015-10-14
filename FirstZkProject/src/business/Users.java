package business;

import java.util.ArrayList;
import java.util.List;

public class Users {
	
	String name;
	String title;
	int age;
	
	public static List<Users> getAll(){
		ArrayList<Users> liste = buildUserCredentials();
		
		return liste;
	}

	private static ArrayList<Users> buildUserCredentials() {
		Users user = new Users();
		user.setName("Dirk");
		user.setTitle("Herr");
		user.setAge(25);
		
		Users user2 = new Users();
		user2.setName("Betina");
		user2.setTitle("Frau");
		user2.setAge(19);
		
		ArrayList<Users> liste = new ArrayList<Users>();
		liste.add(user);
		liste.add(user2);
		
		return liste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
