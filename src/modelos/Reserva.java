package modelos;

//INCLUIMOS LIBRERIA DE LOCALDATE
import java.time.LocalDate;

public class Reserva {
	
	//ARIBUTOS
	private int idReserva;
	private Cliente cliente;
	private LocalDate fechaReserva;
	private Mesa mesa;
	private int cantComensales;
	
	//CONSTRUCTOR
	public Reserva(int idReserva, Cliente cliente, LocalDate fechaReserva, Mesa mesa, int cantComensales) throws Exception {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.fechaReserva = fechaReserva;
		this.mesa = mesa;
		setCantComensales (cantComensales);
	}
	
	//GETTERS Y SETTERS
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getCantComensales() {
		return cantComensales;
	}

	public void setCantComensales(int cantComensales) throws Exception {
		
		if (validarComensales (cantComensales)) {
			
			throw new Exception ("\nError! La cantidad de comensales no puede ser superior a la capacidad de la mesa.\n");
		
		} else {
			
			this.cantComensales = cantComensales;
		}
	}

	//EQUALS Y TO SRING
	public boolean equals(Reserva reserva) {
		// TODO Auto-generated method stub
		return (this.idReserva == reserva.getIdReserva() && this.cliente.equals(reserva.getCliente()) && this.fechaReserva.equals(reserva.getFechaReserva()) 
				&& this.mesa.equals(reserva.getMesa()) && this.cantComensales == reserva.getCantComensales());
				
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n---DATOS DE LA RESERVA---\n" +
				"\nId: " + this.idReserva + "\n" +
				"\nFecha: " + this.fechaReserva + "\n" +
				this.cliente + 
				this.mesa +
				"\nCantidad comensales: " + this.cantComensales + "\n");		
				
	}
	
	//METODOS PROPIOS
	
	//VALIDAR COMENSALES
	private boolean validarComensales (int cantComensales) {
		
		return cantComensales > this.mesa.getCapacidad();
	}
	//------------------------------------------------------
	
	//------------------------------------------------------


	
}
