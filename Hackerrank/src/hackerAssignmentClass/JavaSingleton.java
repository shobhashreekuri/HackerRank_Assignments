package hackerAssignmentClass;

public class JavaSingleton {

    private volatile static JavaSingleton instance;
    public static String str;
    @SuppressWarnings("unused")
	private void Singleton() {}
    
    static JavaSingleton getSingleInstance() {
        if (instance == null) {
            synchronized (JavaSingleton.class) {
                if (instance == null) {
                    instance = new JavaSingleton();
                }
            }
        }
        return instance;
    }

}
