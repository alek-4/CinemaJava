import Datos.Matriz;
import Datos.Peliculas;
import Datos.Personas;

import java.util.Scanner;

public class CinemaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peliculas peliculas = new Peliculas("IT-2", 120, 14, "idk");

        System.out.println("Informacion de la pelicula" + "\n" + peliculas.toString() + "\n");

        Personas spectador = new Personas("Juan", 15, 15000);

        System.out.println("Informacion del espectador:" + "\n" + spectador.toString() + "\n");

        Matriz matriz = new Matriz();

        while(true) {
            for (int i = 0; i < matriz.getMatriz().length; i++) {
                for (int j = 0; j < matriz.getMatriz().length; j++) {

                     System.out.print("quieres asignar el puesto?  " + matriz.getMatriz()[i][j] + "\n");
                     System.out.println("1-SI" + "\n" + "2-NO");
                    int opc = sc.nextInt();
                    switch (opc) {
                        case 1:

                        break;

                        case 2:
                            for (int y = 0; y < matriz.getMatriz().length; y++) {
                                for (int x = 1; x < matriz.getMatriz().length; x++) {

                                    System.out.print("quieres asignar el puesto?  " + matriz.getMatriz()[y][x] + "\n");
                                    System.out.println("1-SI" + "\n" + "2-NO");
                                    opc = sc.nextInt();
                                }
                            }





                    }
                }
                System.out.println();
            }
        }


    }

}
