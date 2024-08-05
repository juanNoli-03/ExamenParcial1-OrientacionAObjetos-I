package modelos;

public class Mesa {
	
	//ATRIBUTOS
	private int idMesa;
	private int numeroMesa;
	private int capacidad;
	
	//CONSTRUCTOR
	public Mesa(int idMesa, int numeroMesa, int capacidad) {
		super();
		this.idMesa = idMesa;
		this.numeroMesa = numeroMesa;
		this.capacidad = capacidad;
	}
	
	//GETTERS Y SETTERS
	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	//EQUALS Y TO STRING
	public boolean equals(Mesa mesa) {
		// TODO Auto-generated method stub
		return (this.idMesa == mesa.getIdMesa() && this.numeroMesa == mesa.getNumeroMesa() && this.capacidad == mesa.getCapacidad());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("\nDatos de la mesa ---> Numero: %d --- Capacidad: %d --- Id: %d---\n", this.numeroMesa, this.capacidad, this.idMesa);
	}
	
	
	
	
	
	
	
}
