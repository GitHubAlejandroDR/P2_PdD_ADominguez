import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TriBiestable tribiestable = new TriBiestable();
		
		try (Scanner sc = new Scanner(System.in)) {
			boolean salir = false;
			while (!salir) {
				String accion = sc.nextLine();
				
				switch (accion) {
				case "abrir":
					tribiestable.abrir();
					System.out.println(tribiestable.estado());
					break;
				case "cerrar":
					tribiestable.cerrar();
					System.out.println(tribiestable.estado());
					break;
				case "cambio":
					tribiestable.cambio();
					System.out.println(tribiestable.estado());
					break;
				default:
					salir = true;
				}
				
			}
			System.out.println("Fin del programa");
		}
		
	}
		
	}


