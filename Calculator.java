//Aamir Rind -2312169
package lab4;

public class Calculator {
	int Square =2;
	int Cube =3;
	 Calculator() {
		System.out.println("Inside the default Constructor ");
	}
	 Calculator(int num) {
		System.out.println("Inside the Parametrized Constructor :"+num);
	}
 int CalculateSquare(int x) {
	 return x*x;
 }
 int CalculateCube(int x) {
	 return x*x*x;
 }
 int CalculateFact(int x) {
	 if(x==0) {
		 return 1;
	 }
	 else {
		 return x*CalculateFact(x-1);
	 }
 }
 void GenTable(int x) {
	 for(int i=1;i<=10;i++) {
		 System.out.println(x + " * "+ i +" = "+(x*i));
	 }
 }
}
