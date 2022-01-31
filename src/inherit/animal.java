package inherit;

class dog{
	
	public void dogs() {
		System.out.println("This is dogs method");
	}
}

class cat extends dog {
	
	public void cats() {
		System.out.println("This is cats method");
	}
}

public class animal {

	public static void main(String[] args) {
		cat obj = new cat();
		obj.dogs();
		obj.cats();
		

	}

}
