<div id="user-content-toc">
  <ul align="center">
    <summary><h1 style="display: inline-block">Resolución del primer examen parcial - Orientación a Objetos 1 - Año 2023</h1>
    <h1 style="display: inline-block">"Sistema Restaurante"</h1>
    </summary>
  </ul>
</div>

---

**1- Diagrama de Clases:**

![image](https://github.com/user-attachments/assets/13230f09-c0b9-442f-acbc-92431c84a278)

**2- Consigna:**

---

**Nota:** El examen acredita puntos por la resolución del modelo y test de cada CU.

**Casos de Uso:**

**1.** + traerCliente(long dni): Cliente

**2.** + agregarCliente(String cliente, String apellido, long dni, String telefono): boolean

**3.** + traerMesa(int numeroMesa): Mesa

**4.** + agregarMesa(int numeroMesa, int capacidad): boolean

***Lanzar excepción si ya existe una mesa con el mismo número. El id se calcula de forma autoincremental, teniendo en cuenta que la lista puede tener altas y bajas de objetos.***

**5.** - validarComensales(int cantComensales): boolean

***Lanzar excepción si la cantidad de comensales de la reserva es superior a la capacidad de la mesa.***

**6.** + traerReserva(int numeroMesa, LocalDate fechaReserva): Reserva

**7.** + agregarReserva(Cliente cliente, LocalDate fechaReserva, Mesa mesa, int cantComensales): boolean

***Lanzar excepción si la mesa seleccionada ya está reservada para esa fecha. El id se calcula de forma autoincremental, teniendo en cuenta que la lista puede tener altas y bajas de objetos.***

**8.** + traerReservasPorFecha(LocalDate fechaDesde, LocalDate fechaHasta): List <Reserva>

***El método retorna una lista de todas las reservas que se encuentren entre la fechaDesde y la fechaHasta (incluyendo extremos).***

**9.** + traerMesasLibreasPorFecha(LocalDate fecha): List <Mesa>

***El método retorna una lista de todas las mesas que no tengan una reserva para el dia indicado.***

**3- Test:**

---

**Nota:** Al comenzar cada test indicar el numero de CU a resolver ej: ***System.out.println("1)");*** y luego la implementación del mismo.

**1-** Agregar los siguientes clientes:

***Cliente [nombre= "Juan", apellido= "Perez", dni= 38958345, telefono= "+541146592131"]***

***Cliente [nombre= "Mario", apellido= "Lopez", dni= 32964234, telefono= "+541163927564"]***

***Cliente [nombre= "Delia", apellido= "Gonzalez", dni= 33095256, telefono= "+541109624724"]***

**2-** Agregar las siguientes Mesas:

***Mesa [numeroMesa= 1, capacidad= 4]***

***Mesa [numeroMesa= 2, capacidad= 4]***

***Mesa [numeroMesa= 3, capacidad= 2]***

***Mesa [numeroMesa= 4, capacidad= 4]***

***Mesa [numeroMesa= 5, capacidad= 6]***

***Mesa [numeroMesa= 6, capacidad= 4]***

**3-** Agregar las siguientes Reservas:

***Reserva [cliente= Cliente [nombre= "Juan", apellido= "Perez", dni= 38958345, telefono= "+541146592131"], fechaReserva= 2023-8-10, mesa= Mesa [numeroMesa= 3, capacidad= 2], cantComensales= 2]***

***Reserva [cliente= Cliente [nombre= "Mario", apellido= "Lopez", dni= 32964234, telefono= "+541163927564"], fechaReserva= 2023-8-10, mesa= Mesa [numeroMesa= 2, capacidad= 4], cantComensales= 4]***

***Reserva [cliente= Cliente [nombre= "Delia", apellido= "Gonzalez", dni= 33095256, telefono= "+541109624724"], fechaReserva= 2023-8-20, mesa= Mesa [numeroMesa= 6, capacidad= 4], cantComensales= 4]***

**4-** Traer e imprimir todas las reservas entre las fechas 2023-8-10 y 2023-8-15

**5-** Traer e imprimir todas las mesas libres para la fecha 2023-8-10

**6-** Intentar agregar nuevamente al siguiente Cliente:

***Cliente [nombre= "Mario", apellido= "Lopez", dni= 32964234, telefono= "+541163927564"]***

**7-** Intentar agregar nuevamente la siguiente Mesa:

***Mesa [numeroMesa= 2, capacidad= 4]***

**8-** Intentar agregar la siguiente Reserva:

***Reserva [cliente= Cliente [nombre= "Delia", apellido= "Gonzalez", dni= 33095256, telefono= "+541109624724"], fechaReserva= 2023-8-10, mesa= Mesa [numeroMesa= 3, capacidad= 2], cantComensales= 2]***

**9-** Intentar agregar la siguiente Reserva:

***Reserva [cliente= Cliente [nombre= "Mario", apellido= "Lopez", dni= 32964234, telefono= "+541163927564"], fechaReserva= 2023-8-15, mesa= Mesa [numeroMesa= 4, capacidad= 4], cantComensales= 6]***
