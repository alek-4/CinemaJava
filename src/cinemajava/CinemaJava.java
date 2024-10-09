import Datos.Matriz;
import Datos.Peliculas;
import Datos.Personas;

import java.util.Scanner;

public class CinemaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peliculas peliculas = new Peliculas("IT-2", 120, 14, "idk", 5000);
        System.out.println("Informacion de la pelicula" + "\n" + peliculas.toString() + "\n");
        Personas spectador = new Personas();



        Matriz matriz = new Matriz();
        boolean detener = true;

        mainloop:
        while(detener) {

            for (int i = 0; i < matriz.getMatriz().length; i++) {
                for (int j = 0; j < matriz.getMatriz().length; j++) {

                    System.out.println("Por favor ingrese su nombre:");
                    spectador.setNombre(sc.next());
                    System.out.println("Por favor ingrese su edad");
                    spectador.setEdad(sc.nextInt());
                    System.out.println("Por favor ingrese la cantidad de dinero:");
                    spectador.setDinero(sc.nextInt());

                    boolean stop = true;
                    while(stop) {
                        if (!matriz.getMatriz()[i][j].equals("0")){
                     System.out.print("quieres asignar el puesto?  " + matriz.getMatriz()[i][j] + "\n");
                     System.out.println("1-SI" + "\n" + "2-NO");
                    int opc = sc.nextInt();
                    switch (opc) {
                        case 1:
                            if (spectador.getEdad() < peliculas.getEdad()) {
                                System.out.println("Lo sentimos no cumples con la edad necesaria");
                            }
                            else {
                                if(spectador.getDinero() < peliculas.getValor()) {
                                    System.out.println("No tienes el dinero necesario para la boleta");
                                }
                                else {
                                    spectador.setDinero(spectador.getDinero()-peliculas.getValor());
                                    matriz.getMtr()[i][j] = "0";
                                    System.out.println("Informacion del espectador" + "\n" + "Asiento Asignado: " + matriz.getMatriz()[i][j]);
                                    System.out.println(spectador.toString());
                                    System.out.println("Le gustaria ver los asientos asignados?" + "\n" + "1-SI" + "\n" + "2-NO");
                                    int ps = sc.nextInt();
                                    if (ps == 1) {
                                        for (i = 0; i < matriz.getMatriz().length; i++) {
                                            for (j = 0; j < matriz.getMatriz().length; j++) {
                                                System.out.print(matriz.getMtr()[i][j] + " ");

                                            }
                                            System.out.println();
                                        }
                                        System.out.println();
                                    }
                                    System.out.println("\n" + "Le gustaria comprar otro boleto?" + "\n" + "1-SI" + "\n" + "2-NO");
                                    int opc2= sc.nextInt();

                                    if (opc2 != 1) {
                                        stop = false;
                                    }
                                    break;


                                }
                            }
                             detener = false;
                        break mainloop;

                        case 2:
                            for (i = 0; i < matriz.getMatriz().length; i++) {
                                for (j = 0; j < matriz.getMatriz().length; j++) {

                                    System.out.print("quieres asignar este puesto?  " + matriz.getMatriz()[i][j] + "\n");
                                    System.out.println("1-SI" + "\n" + "2-NO");
                                    opc = sc.nextInt();
                                    break;
                                }

                            }

                            default:
                                System.out.println("Opcion no valida");

                            break;






                      }
                      i++;
                    if (i <= matriz.getMatriz()[j].length) {
                        j++;
                        i = 0;
                    }
                    if (j >= matriz.getMatriz().length) {
                        i = 0;
                        j = 0;
                    }
                  }
                 }
                }

            }
        }


    }

}
