package CodigoLimpio;

public class Vehiculo {
	private int id;
	private String tipo;
	private String modelo;
	private boolean disponible;
	private double precioDia;

	public Vehiculo(int pId, String pTipo, String pModelo, double pPrecioDia) {
		id = pId;
		tipo = pTipo;
		modelo = pModelo;
		precioDia = pPrecioDia;
		disponible = true;
	}

	public void alquilar(String cliente, int dias) {

		if (dias <= 0) {
			System.out.println("Dias invalidos");
			return;
		}

		double total = dias * precioDia;

		disponible = false;

		System.out.println("Vehiculo alquilado");
		System.out.println("Cliente: " + cliente);
		System.out.println("Total: " + total + " euros");
	}

	public void devolver() {

		if (disponible) {
			System.out.println("Ya estaba disponible");
		} else {
			disponible = true;
			System.out.println("Vehiculo devuelto");
		}
	}

	public boolean isDisponible() {
		return disponible;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "ID: " + id + " Tipo: " + tipo + " Modelo: " + modelo + " Precio/dia: " + precioDia + " Disponible: "
				+ disponible;
	}

}
