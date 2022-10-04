//class fruit {
//	int price = 200;
//	
//}
//
//class apple extends fruit{
//	int price = 100;
//	public void display() {
//		System.out.println(super.price);
//	}	
//	
//} 
//class Main {
//	public static void main(String[] args) {
//		apple F = new apple();
//		F.display();
//		
//	}
//}
class ID {
	String name = "Buya";
	
	
}

class name extends ID{
	String name = "Dorj";
	int age = 45;
	void display (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
	}	
	
} 
class Main {
	public static void main(String[] args) {
		name F = new name();
		F.display();
		
	}
}