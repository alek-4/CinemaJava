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


        mainloop:
        while(true) {

            for (int i = 0; i < matriz.getMatriz().length; i++) {
                for (int j = 0; j < matriz.getMatriz()[i].length; j++) {

                    System.out.println("Por favor ingrese su nombre:");
                    spectador.setNombre(sc.next());
                    System.out.println("Por favor ingrese su edad");
                    spectador.setEdad(sc.nextInt());
                    System.out.println("Por favor ingrese la cantidad de dinero:");
                    spectador.setDinero(sc.nextInt());


                    boolean stop = true;

                    while(stop) {
                        if (!matriz.getMtr()[i][j].equals("0 ")){

                     System.out.print("quieres asignar el puesto?  " + matriz.getMatriz()[i][j] + "\n");
                     System.out.println("1-SI" + "\n" + "2-NO");
                    int opc = sc.nextInt();
                    switch (opc) {
                        case 1:
                            if (spectador.getEdad() < peliculas.getEdad()) {
                                System.out.println("Lo sentimos no cumples con la edad necesaria");
                            }
                            else {
                                if(spectador.getDinero() < peliculas.getValor() && spectador.getDinero() <= 0)  {
                                    System.out.println("No tienes el dinero necesario para la boleta");
                                }
                                else {
                                    spectador.setDinero(spectador.getDinero()-peliculas.getValor());
                                    matriz.getMtr()[i][j] = "0 ";
                                    System.out.println("Informacion del espectador" + "\n" + "Asiento Asignado: " + matriz.getMatriz()[i][j]);
                                    System.out.println(spectador.toString());
                                    System.out.println("Le gustaria ver los asientos asignados?" + "\n" + "1-SI" + "\n" + "2-NO");
                                    int ps = sc.nextInt();
                                    if (ps == 1) {
                                       mostrar(matriz);
                                    }
                                    System.out.println("\n" + "Le gustaria comprar otro boleto?" + "\n" + "1-SI" + "\n" + "2-NO");
                                    int opc2= sc.nextInt();

                                    if (opc2 != 1) {
                                        System.out.println("Hasta la proxima " + spectador.getNombre());
                                        stop = false;
                                    }




                                    break;


                                }
                            }

                        break mainloop;

                        case 2:



                            break;











                            default:
                                System.out.println("Opcion no valida");

                            break;

                      }
                      j++;
                    if (j >= matriz.getMatriz()[i].length) {
                        i++;
                        j = 0;
                    }
                    if (i >= matriz.getMatriz().length) {
                        i = 0;
                        j = 0;
                    }
                  }
                 }
                }

            }
        }


    }

    private static void mostrar(Matriz matriz) {
        for (int i = 0; i < matriz.getMtr().length; i++) {
            for (int j = 0; j < matriz.getMtr()[i].length; j++) {
                System.out.print(matriz.getMtr()[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

}
