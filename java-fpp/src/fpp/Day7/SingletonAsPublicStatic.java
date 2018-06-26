package Day7;

/*
 * Sol 2
 * Thread safe
 * easy initialization
 */
public class SingletonAsPublicStatic {
	public static final SingletonAsPublicStatic INSTANCE 
		= new SingletonAsPublicStatic();
	
	private SingletonAsPublicStatic() {System.out.println("Object created");}
	
	public static void main(String[] args) {
		// You can not create Instances for the class because your object is static and final, object created during the class loading
		SingletonAsPublicStatic singleton1 = SingletonAsPublicStatic.INSTANCE;
		SingletonAsPublicStatic singleton2 = SingletonAsPublicStatic.INSTANCE;
	}
}
