package CodigoLimpio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

		vehiculos.add(new Vehiculo(1, "coche", "Toyota", 40));
		vehiculos.add(new Vehiculo(2, "moto", "Yamaha", 25));
		vehiculos.add(new Vehiculo(3, "bicicleta", "BH", 10));

		boolean salir = false;

		do {
			System.out.println("\n=== ALQUILER DE VEHÍCULOS ===");
			System.out.println("1. Ver vehículos disponibles");
			System.out.println("2. Alquilar vehículo");
			System.out.println("3. Devolver vehículo");
			System.out.println("4. Salir");
			System.out.print("Opción: ");

		} while (!salir);

	}
}
