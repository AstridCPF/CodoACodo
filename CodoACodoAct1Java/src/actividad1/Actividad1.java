package actividad1;
import java.util.Scanner;

public class Actividad1 {
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		Info datos= new Info();
		
		System.out.print("Ingrese su nombre y apellido: ");
		datos.setNombre(teclado.nextLine());
			
		System.out.print("Ingrese su edad: ");
		datos.setEdad(teclado.nextInt());
		
		System.out.print("�C�al es tu hobbie? ");
		datos.setHobbie(teclado.next());
		
		System.out.print("�C�al es tu editor de c�digo preferido? ");
		datos.setCodEditPref(teclado.next());
		
		System.out.print("�Qu� sistema operativo utilizas? ");
		datos.setSo(teclado.next());
		
		System.out.println("===========");
		
		teclado.close();		
		
		System.out.println("Los datos ingresados son: ");
		
		System.out.println(datos.toString());
		
	}

}


