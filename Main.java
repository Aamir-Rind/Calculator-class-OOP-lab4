
package lab4;

public class Main {

	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		System.out.println("value of Square :"+obj1.CalculateSquare(5));
		
		Calculator obj2 = new Calculator();
		System.out.println("value of Cube :"+obj2.CalculateCube(5));
		
		Calculator obj3 = new Calculator();
		System.out.println("Factorial is :"+obj3.CalculateFact(5));
		
		Calculator obj4 = new Calculator();
		System.out.println("Genrate Table ");
		obj4.GenTable(5);
	}

}
