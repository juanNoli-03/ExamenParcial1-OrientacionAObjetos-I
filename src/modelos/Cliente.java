package modelos;

public class Cliente {
	
	//ATRIBUTOS
	private int idCliente;
	private String nombre;
	private String apellido;
	private long dni;
	private String telefono;
	
	//CONSTRUCTOR
	public Cliente(int idCliente, String nombre, String apellido, long dni, String telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	//GETTERS Y SETTERS
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//EQUALS Y TO STRING
	public boolean equals(Cliente cliente) {
		// TODO Auto-generated method stub
		return (this.idCliente == cliente.getIdCliente() && this.nombre.equals(cliente.getNombre()) && 
				this.apellido.equals(cliente.getApellido()) & this.dni == cliente.getDni() && this.telefono.equals(cliente.getTelefono()));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("\nDatos del cliente ----> Nombre completo: %s %s --- Dni: %d --- Telefono: %s --- ID: %d ---\n"
				, this.nombre, this.apellido, this.dni, this.telefono, this.idCliente);
	}
	
	
	
	
	
	
	
}
