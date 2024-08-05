package modelos;

//INCLUIMOS LIBRERIA DE LISTAS
import java.util.List;
import java.util.ArrayList;

//INCLUIMOS LIBRERIA DE LOCALDATE
import java.time.LocalDate;

public class SistemaRestaurante {
	
	//ATRIBUTOS
	private List <Cliente> lstClientes;
	private List <Mesa> lstMesas;
	private List <Reserva> lstReservas;
	
	//CONSTRUCTOR
	public SistemaRestaurante() {
		super();
		this.lstClientes = new ArrayList <Cliente> ();
		this.lstMesas = new ArrayList <Mesa> ();
		this.lstReservas = new ArrayList <Reserva> ();
	}
	
	//GETTERS Y SETTERS
	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	public List<Mesa> getLstMesas() {
		return lstMesas;
	}

	public void setLstMesas(List<Mesa> lstMesas) {
		this.lstMesas = lstMesas;
	}

	public List<Reserva> getLstReservas() {
		return lstReservas;
	}

	public void setLstReservas(List<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}
	
	//TO STRING
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n---DATOS DEL RESTAURANTE---\n" + "\n---CLIENTES---\n" + this.lstClientes + 
				"\n---MESAS---\n" + this.lstMesas + "\n---RESERVAS---\n" + this.lstReservas + "\n--------------------------\n");
	}
	
	//METODOS PROPIOS
	
	//CLIENTE
	public boolean agregarCliente (String nombre, String apellido, long dni, String telefono) throws Exception {
		
		//VALIDAMOS SI EL CLIENTE YA EXISTE EN NUESTRA LISTA
		if (traerCliente(dni) != null) {
			
			throw new Exception ("\nError! El cliente que deseas agregar ya existe en tu lista.\n");
		}
		//------------------------------------------------------
		
		Cliente cliente = new Cliente (generarIdCliente (), nombre, apellido, dni, telefono);
		
		return this.lstClientes.add(cliente);
	}
	
	public Cliente traerCliente (long dni) {
		
		Cliente clienteAux = null;
		
		int i = 0;
		
		while (i < this.lstClientes.size() && clienteAux == null) {
			
			if (dni == this.lstClientes.get(i).getDni()) {
				
				clienteAux = this.lstClientes.get(i);
			}
			
			i ++;
		}
		
		return clienteAux;
	}
	
	private int generarIdCliente () {
		
		int id = 1;
		
		if (this.lstClientes.size() > 0) {
			
			id = this.lstClientes.get(this.lstClientes.size() - 1).getIdCliente() + 1;
		}
		
		return id;
	}
	//------------------------------------------------------
	
	//MESA
	public boolean agregarMesa (int numeroMesa, int capacidad) throws Exception {
		
		//VALIDAMOS SI LA MESA YA EXISTE EN NUESTRA LISTA
		if (traerMesa (numeroMesa) != null) {
			
			throw new Exception ("\nError! La mesa que deseas agregar ya existe en tu lista.\n");
		}
		//------------------------------------------------------
		
		Mesa mesa = new Mesa (generarIdMesa (), numeroMesa, capacidad);
		
		return this.lstMesas.add(mesa);
	}
	
	public Mesa traerMesa (int numeroMesa) {
		
		Mesa mesaAux = null;
		
		int i = 0;
		
		while (i < this.lstMesas.size() && mesaAux == null) {
			
			if (numeroMesa == this.lstMesas.get(i).getNumeroMesa()) {
				
				mesaAux = this.lstMesas.get(i);
			}
			
			i ++;
		}
		
		return mesaAux;
	}
	
	private int generarIdMesa () {
		
		int id = 1;
		
		if (this.lstMesas.size() > 0) {
			
			id = this.lstMesas.get(this.lstMesas.size() - 1).getIdMesa() + 1;
		}
		
		return id;
	}
	//------------------------------------------------------
	
	//RESERVA
	public boolean agregarReserva (Cliente cliente, LocalDate fechaReserva, Mesa mesa, int cantComensales) throws Exception {
		
		//VALIDAMOS SI LA RESERVA YA EXISTE EN NUESTRA LISTA
		if (traerReserva (mesa.getNumeroMesa(), fechaReserva) != null) {
					
			throw new Exception ("\nError! La mesa seleccionada ya reservada esta en esa fecha.\n");
		}
		//------------------------------------------------------
				
		Reserva reserva = new Reserva (generarIdReserva (), cliente, fechaReserva, mesa, cantComensales);
				
		return this.lstReservas.add(reserva);
	}
	
	public Reserva traerReserva (int numeroMesa, LocalDate fechaReserva) {
		
		Reserva reservaAux = null;
		
		int i = 0;
		
		while (i < this.lstReservas.size() && reservaAux == null) {
			
			if (numeroMesa == this.lstReservas.get(i).getMesa().getNumeroMesa() && 
					fechaReserva.equals(this.lstReservas.get(i).getFechaReserva())) {
				
				reservaAux = this.lstReservas.get(i);
			}
			
			i ++;
		}
		
		return reservaAux;
	}
	
	private int generarIdReserva () {
		
		int id = 1;
		
		if (this.lstReservas.size() > 0) {
			
			id = this.lstReservas.get(this.lstReservas.size() - 1).getIdReserva() + 1;
		}
		
		return id;
	}
	
	public List <Reserva> traerReservasPorFecha (LocalDate fechaDesde, LocalDate fechaHasta) {
		
		List <Reserva> lstReservaAux = new ArrayList <Reserva> ();
		
		for (Reserva reserva: this.lstReservas) {
			
			if (Funciones.fechaEntre(reserva.getFechaReserva(), fechaDesde, fechaHasta)) {
				
				lstReservaAux.add(reserva);
			}
		}
		
		return lstReservaAux;
	}
	
	public List <Mesa> traerMesasLibresPorFecha (LocalDate fecha) {
		
		List <Mesa> lstMesaAux = new ArrayList <Mesa> ();
		
		for (Mesa mesa : this.lstMesas) {
			
			if (traerReserva (mesa.getNumeroMesa(), fecha) == null) {
				
				lstMesaAux.add(mesa);
			}
		}
		
		return lstMesaAux;
	}
	//------------------------------------------------------



	
	//------------------------------------------------------
	
	
	
	
	
	
}
