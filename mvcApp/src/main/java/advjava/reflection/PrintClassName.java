package advjava.reflection;

public class PrintClassName {

	public static void main(String[] args) {

		String s=new String("hello");
		printClassNames(new PrintClassName());
	}
	static void printClassNames(Object obj){
		System.out.println("the current class is ="+obj.getClass().getName());
		System.out.println("the super class name is ="+obj.getClass().getSuperclass().getName());
	}

}
