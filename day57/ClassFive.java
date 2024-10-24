package day57;

public class ClassFive {

	public static void main(String[] args) {
		// Conditional_Statements
		
		//Java8 switch case
		String myfist = "paper";
		
		switch(myfist) {
		case "paper": 
			System.out.println("Paper de my hand");
			break;
		case "sweet":
			System.out.println("Sweet de my hand");
			break;
		case "money":
			System.out.println("Money de my hand");
			break;
		case "cookies":
			System.out.println("Cookies de my hand");
			break;
		case "flash drive":
			System.out.println("Flash Drive de my hand");
			break;
		default: 
			System.out.println("Default block");
		}

	//JAVA12 SWITCH CASE
		
		String result = switch(myfist) {
		case "paper"-> "flash drive is in my hand";
		case "sweet"-> "sweet is in my hand";
		case "money"-> "money is in my hand";
		case "cookies"-> "cookies is in my hand";
		default -> "Nothing is there";
		};
		
		System.out.println(result);
		
		
		switch (myfist) {
		case "paper" -> System.out.println("Paper is in my hand");
		case "sweet" -> System.out.println("Sweet is in my hand");
		case "money"-> System.out.println("Money is in my hand");
		case "flash drive"-> System.out.println("flash drive is in my hand");
		case "cookies" -> System.out.println("Cookies is in my hand");
		}
		// ???Does this version of swich case not need breaks???

	}

}
