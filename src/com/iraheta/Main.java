package com.iraheta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner lector = new Scanner(System.in);
        System.out.println("****************");
        System.out.println("\tBenvenido");
        System.out.println("****************");

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ford");
            System.out.println("2. Toyota");
            System.out.println("3. Honda");
            System.out.println("4. Nissan");
            System.out.println("5. Mostrar Vehiculos");
            System.out.println("6. Salir");
            int opcion = LectorDeDatos.solicitarEntero("Ingrese una opcion");
            switch (opcion){
                case 1:
                    Ford cFord = new Ford();
                    System.out.println("Ford");
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorFord = lector.next();
                    cFord.color= colorFord;
                    int yearFord= LectorDeDatos.solicitarEntero("Ingrese el año: ");
                    cFord.year=yearFord;
                    double precioFord= LectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    cFord.precio= precioFord;
                    vehiculos.add(cFord);
                    System.out.println("Su Registro fue Guardado con Éxito");
                    System.out.println("");
                    break;
                case 2:
                    Toyota cToyota= new Toyota();
                    System.out.println("Toyota");
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorToyota = lector.next();
                    cToyota.color= colorToyota;
                    int yearToyota= LectorDeDatos.solicitarEntero("Ingrese el año: ");
                    cToyota.year=yearToyota;
                    double precioToyota= LectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    cToyota.precio= precioToyota;
                    vehiculos.add(cToyota);
                    System.out.println("Su Registro fue Guardado con Éxito");
                    System.out.println("");
                    break;
                case 3:
                    Honda cHonda = new Honda();
                    System.out.println("Honda");
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorHonda = lector.next();
                    cHonda.color= colorHonda;
                    int yearHonda= LectorDeDatos.solicitarEntero("Ingrese el año: ");
                    cHonda.year=yearHonda;
                    double precioHonda= LectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    cHonda.precio= precioHonda;
                    vehiculos.add(cHonda);
                    System.out.println("Su Registro fue Guardado con Éxito");
                    System.out.println("");
                    break;
                case 4:
                    Nissan cNissan = new Nissan();
                    System.out.println("Nissan");
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorNissan = lector.next();
                    cNissan.color= colorNissan;
                    int yearNissan = LectorDeDatos.solicitarEntero("Ingrese el año: ");
                    cNissan.year= yearNissan;
                    double precioNissan = LectorDeDatos.solicitarDouble("Ingrese el precio: ");
                    cNissan.precio= precioNissan;
                    vehiculos.add(cNissan);
                    System.out.println("Su Registro fue Guardado con Éxito");
                    System.out.println("");
                    break;
                case 5:
                    if (vehiculos.isEmpty()){
                        System.out.println("No hay vehiculos registrados");
                    } else
                    {
                        System.out.println("Mostrando los vehiculos de Toyota y Nissan");
                        System.out.println("");
                    }
                    for (Vehiculo c:vehiculos) {
                        String marca = "";
                        if(c instanceof Toyota){
                            marca= "Toyota";
                            System.out.println("El color de: " + marca + "-" +c.color);
                            System.out.println("El año de: "  + marca + "-" + c.year);
                            System.out.println("El precio de: " + marca + "-" +c.precio );
                            System.out.println("");
                        }

                        else if (c instanceof Nissan){
                            marca= "Nissan";
                            System.out.println("El color de: " + marca  + "-" +c.color );
                            System.out.println("El año de: " + marca + "-" +c.year );
                            System.out.println("El precio de: " + marca + "-" +c.precio);
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    continuar =false;
                    System.out.println("Salio del Sistema Vehiculo");
                    break;
                default:
                    System.out.println("Opción no valida:");
                    break;
            }
        }
    }
}
