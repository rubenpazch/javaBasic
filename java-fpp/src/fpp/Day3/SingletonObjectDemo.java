package Day3;

class SingletonClass {
	// static SingletonClass singletonObject;
	private static SingletonClass singletonObject;
	String key;

	/** A private Constructor prevents any other class from instantiating. */

	private SingletonClass() {
		key = "K135J89L35";
		this.getKey();
	}

	public static SingletonClass getSingletonObject() {

		if (singletonObject != null) {
			System.out.println("Unsuccessful to produce the key....");
			return null;
		} else {
			System.out.println("Key generated Successfully  ");
			singletonObject = new SingletonClass();
			return singletonObject;
		}

	}

	private void getKey() {
		System.out.println("Your key to activate Avast anti virus is:" + key);
	}
}

public class SingletonObjectDemo {

	public static void main(String[] args) {
		// SingletonClass obj = new SingletonClass(); //Compilation error
		SingletonClass obj = SingletonClass.getSingletonObject();
		SingletonClass obj1 = SingletonClass.getSingletonObject();

	}
}
