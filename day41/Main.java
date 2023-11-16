package day41;

public class Main {

	String name = "Jerry";
	
	public void accept_String() {
		
//		boolean result =name.equals("jerry"); // result = false
		boolean result = name.equalsIgnoreCase("jerry");
		System.out.println(result);
		System.out.println(name.length());
		System.out.println(name.indexOf("r"));
		System.out.println(name.lastIndexOf("r"));
		String newName = name.replace("ry", "go");
		
		System.out.println(newName);
		System.out.println(newName.length());
		System.out.println(newName.startsWith("go"));
		System.out.println(newName.indexOf("o"));
		System.out.println(newName);
		newName = newName.replace("go", "em");
		// newName += "iah";
		// newName = newName+ "iah"; 
		newName = newName.concat("iah");
		System.out.println(newName);
		System.out.println(newName.charAt(2));
		System.out.println(newName.substring(2));
		System.out.println(newName.substring(1, 5));
		
		//Extra String Methods
		//StringBuffer
		StringBuffer bf = new StringBuffer("I am ");
		System.out.println(bf);
		System.out.println(bf.capacity());
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		
		Main obj = new Main();
			obj.accept_String();

	}

}
