import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biestable biestable = new Biestable();
		try (Scanner sc = new Scanner(System.in)) {
			boolean salir = false;
			while (!salir) {
				String accion = sc.nextLine();
				
				switch (accion) {
				case "abrir":
					biestable.abrir();
					System.out.println(biestable.estado());
					break;
				case "cerrar":
					biestable.cerrar();
					System.out.println(biestable.estado());
					break;
				default:
					salir = true;
				}
				
			}
			System.out.println("Fin del programa");
		}

		
	}

}
