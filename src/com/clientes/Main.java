package com.clientes;

import com.clases.Clientes;
import com.clases.Empresas;
import com.clases.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empresas> listaEmpresa = new ArrayList<>();
        ArrayList<Clientes> listaCliente = new ArrayList<>();
        ArrayList<Producto> listaProducto = new ArrayList<>();
        Empresas empresa = new Empresas();


        String menu =   "                          MENU DE OPCIONES\n      "+
                        "---------------------------------------------------------------\n"+
                        "         * 1. Agregar cliente\n" +
                        "         * 2. Editar cliente\n" +
                        "         * 3. Eliminar cliente\n" +
                        "         * 4. Agregar productos\n" +
                        "         * 5. Consultar clientes con documento y tipo de documento \n" +
                        "         * 0. salir de la aplicación";

        Scanner in = new Scanner(System.in);
        Integer opMenu;

        do {
            System.out.println(menu + "\n");
            System.out.print("Ingrese una opción: ");
            opMenu = in.nextInt();
            switch (opMenu.toString()) {
                case "1":
                    System.out.print("REGISTRO DE CLIENTES \n");

                    Clientes cliente = new Clientes();

                    Scanner ingresoCliente = new Scanner(System.in);
                    String registroCliente;

                    System.out.print("Favor ingrese la información solicitada \n");
                    System.out.print("Cédula: ");
                    registroCliente = ingresoCliente.nextLine();
                    cliente.setCedula(registroCliente);

                    System.out.print("Nombre completo: ");
                    registroCliente = ingresoCliente.nextLine();
                    cliente.setNombre(registroCliente);

                    System.out.print("Número de celular: ");
                    registroCliente = ingresoCliente.nextLine();
                    cliente.setCelular(registroCliente);

                    System.out.print("Número de Teléfono: ");
                    registroCliente = ingresoCliente.nextLine();
                    cliente.setTelefono(registroCliente);

                    System.out.print("Dirección de residencia: ");
                    registroCliente = ingresoCliente.nextLine();
                    cliente.setDireccion(registroCliente);

                    if(listaProducto.isEmpty()){
                        System.out.println("Productos: ");
                        System.out.println("En el momento no se tienen productos registrados");
                    }
                    else{
                        System.out.println("Productos: ");
                        for(int i = 0; i< listaProducto.size(); i++){
                            System.out.println((i+1)+ ". "+listaProducto.get(i).getIdProducto() +" - "+listaProducto.get(i).getNombre());
                        }
                        System.out.print("Asignar código de producto: ");
                        registroCliente = ingresoCliente.nextLine();
                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;

                case "4":
                    System.out.print("REGISTRO DE PRODUCTOS \n");


                    Producto producto = new Producto();
                    Scanner ingresoProducto = new Scanner(System.in);
                    String registroProducto;

                    System.out.print("Ingrese el ID del producto a registrar: ");
                    registroProducto = ingresoProducto.nextLine();
                    producto.setIdProducto(registroProducto);

                    System.out.print("Ingrese el nombre del producto: ");
                    registroProducto = ingresoProducto.nextLine();
                    producto.setNombre(registroProducto);

                    System.out.print("Ingrese las características del producto: ");
                    registroProducto = ingresoProducto.nextLine();
                    producto.setCarateristicas(registroProducto);

                    System.out.print("Ingrese las condiciones del producto: ");
                    registroProducto = ingresoProducto.nextLine();
                    producto.setCondiciones(registroProducto);

                    listaProducto.add(producto);

                    System.out.println("Producto registrado exitosamente \n");

                    break;

                case "5":
                    break;
                case "0":
                    System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                    break;
                default:
                    System.out.println("El valor ingresado no es una opción de menu");
                    break;
            }
        } while (!opMenu.toString().equals("0"));
        in.close();

    }
}
