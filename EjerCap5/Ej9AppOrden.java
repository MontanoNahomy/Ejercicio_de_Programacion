package EjerCap5;

public class Ej9AppOrden {

	public static void main(String[] args) {
		Ej9Producto producto1 = new Ej9Producto(1, "Carpeta", "Carpeta anillada metálica",1000);
		Ej9Producto producto2 = new Ej9Producto(2, "Tinta", "Tinta china de color negro.", 3000);
		Ej9Producto producto3 = new Ej9Producto(3, "Cinta pegante",
		"Cinta adhesiva de color transparente.",800);
		Ej9Producto producto4 = new Ej9Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms. ",600);
		Ej9Orden orden = new Ej9Orden(1);
		orden.añadirItem(1, 5, producto1);
		orden.añadirItem(2, 3, producto2);
		orden.añadirItem(3, 2, producto1);
		orden.añadirItem(4, 4, producto4);
		orden.calcularTotalOrden();
		System.out.println(orden);
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		// Creación de clientes
        Ej9Empresa empresa = new Ej9Empresa();
        empresa.setNombreEmpresa("Mi Empresa");
        empresa.setNit("123456-7");
        empresa.setTelefono("123456789");
        empresa.setDireccion("Dirección de la Empresa");

        Ej9ClienteParticular clienteParticular = new Ej9ClienteParticular();
        clienteParticular.setNombre("Juan");
        clienteParticular.setApellidos("Pérez");
        clienteParticular.setNumeroDocumento("12345678A");
        clienteParticular.setTelefono("987654321");
        clienteParticular.setDireccion("Codesa");
        
        Ej9Orden ordenClienteParticular = new Ej9Orden(2, clienteParticular);
        ordenClienteParticular.añadirItem(2, 3, producto1);
        ordenClienteParticular.añadirItem(4, 5, producto2);
        
        Ej9Orden ordenEmpresa = new Ej9Orden(1, empresa);
        ordenEmpresa.añadirItem(1, 5, producto1);
        ordenEmpresa.añadirItem(2, 4, producto1);
        // Cálculo del total de la orden
        ordenEmpresa.calcularTotalOrden(); 
        ordenClienteParticular.calcularTotalOrden();

        // Muestra las órdenes con sus respectivos clientes
        System.out.println("Orden de Empresa:\n" + ordenEmpresa + "\nCliente: " + ordenEmpresa.getCliente());
        System.out.println("\nOrden de Cliente Particular:\n" + ordenClienteParticular + "\nCliente: " + ordenClienteParticular.getCliente());
    
	}
	/*En este App se ejecutan 2 ejercicios, es decir, está la solución del ejercicio 9 y 10
	 
	 Ej10:
	 Modificar el programa anterior para que soporte que las órdenes de compra están 
	 relacionadas con un único cliente. Los clientes a su vez pueden tener muchas 
	 órdenes de compra. Los cuales pueden ser empresas o clientes particulares; las 
	 primeras tienen un nombre o razón social, NIT, teléfono y dirección. Los últimos 
	 tienen nombre, apellidos, número de documento, teléfono y dirección.

	 Resultado:
	 	Orden [id = 1]
		Items del pedido
		[Línea de Pedido [id = 1, Cantidad = 5, Producto =id = 1, Nombre =Carpeta,Descripción = Carpeta anillada metálica, Precio = $ 1000]
		, Línea de Pedido [id = 2, Cantidad = 3, Producto =id = 2, Nombre =Tinta,Descripción = Tinta china de color negro., Precio = $ 3000]
		, Línea de Pedido [id = 3, Cantidad = 2, Producto =id = 1, Nombre =Carpeta,Descripción = Carpeta anillada metálica, Precio = $ 1000]
		, Línea de Pedido [id = 4, Cantidad = 4, Producto =id = 4, Nombre =Cartulina,Descripción = Pliego de cartulina 60x40 cms. , Precio = $ 600]
		]
		Total orden = $18400
		
		----------------------------------------------------------------------------------------------
		Orden de Empresa:
		Orden [id = 1]
		Items del pedido
		[Línea de Pedido [id = 1, Cantidad = 5, Producto =id = 1, Nombre =Carpeta,Descripción = Carpeta anillada metálica, Precio = $ 1000]
		, Línea de Pedido [id = 2, Cantidad = 4, Producto =id = 1, Nombre =Carpeta,Descripción = Carpeta anillada metálica, Precio = $ 1000]
		]
		Total orden = $9000
		
		Cliente: Empresa: Mi Empresa
		NIT: 123456-7
		Teléfono: 123456789
		Dirección: Dirección de la Empresa
		
		Orden de Cliente Particular:
		Orden [id = 2]
		Items del pedido
		[Línea de Pedido [id = 2, Cantidad = 3, Producto =id = 1, Nombre =Carpeta,Descripción = Carpeta anillada metálica, Precio = $ 1000]
		, Línea de Pedido [id = 4, Cantidad = 5, Producto =id = 2, Nombre =Tinta,Descripción = Tinta china de color negro., Precio = $ 3000]
		]
		Total orden = $18000
		
		Cliente: Cliente Particular: Juan Pérez
		Número de Documento: 12345678A
		Teléfono: 987654321
		Dirección: Dirección del Cliente Particular

	 
	*/
}
