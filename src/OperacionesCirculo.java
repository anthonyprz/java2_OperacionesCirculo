import java.util.Scanner;
public class OperacionesCirculo {

	public static void main (String args[]) {

	double  radio;
		Circulo operaciones = new Circulo(); 

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresar el radio r: ");
		radio = sc.nextDouble();

		
		System.out.println("\nhalla el area de un ciculo: " + operaciones.area(radio));
		System.out.println("\nhalla el area de una circunferencia: " + operaciones.circunferencia(radio));

	}
}
