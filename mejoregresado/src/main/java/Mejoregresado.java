import java.util.Scanner;
public class Mejoregresado {
    static class Estudiante {
        String nombre;
        double promedioFinal;
        Estudiante(String nombre, double promedioFinal) {
            this.nombre = nombre;
            this.promedioFinal = promedioFinal;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = teclado.nextInt();
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = teclado.next();
            System.out.println("Ingrese el promedio final del estudiante " + (i + 1) + ":");
            double promedioFinal = teclado.nextDouble();
            estudiantes[i] = new Estudiante(nombre, promedioFinal);
        }
        double maxPromedio1 = Double.MIN_VALUE;
        double maxPromedio2 = Double.MIN_VALUE;
        Estudiante[] mejoresEgresados = new Estudiante[2];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.promedioFinal > maxPromedio1) {
                maxPromedio2 = maxPromedio1;
                maxPromedio1 = estudiante.promedioFinal;
                mejoresEgresados[1] = mejoresEgresados[0];
                mejoresEgresados[0] = estudiante;
            } else if (estudiante.promedioFinal > maxPromedio2) {
                maxPromedio2 = estudiante.promedioFinal;
                mejoresEgresados[1] = estudiante;
            }
        }
        System.out.println("\nMejores Egresados:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nombre: " + mejoresEgresados[i].nombre);
            System.out.println("Promedio Final: " + mejoresEgresados[i].promedioFinal);
            System.out.println("-------------");
        }
    }
}

/*
Ingrese la cantidad de estudiantes:
4
Ingrese el nombre del estudiante 1:
jose
Ingrese el promedio final del estudiante 1:
8
Ingrese el nombre del estudiante 2:
lenin
Ingrese el promedio final del estudiante 2:
10
Ingrese el nombre del estudiante 3:
alejandro
Ingrese el promedio final del estudiante 3:
9,8
Ingrese el nombre del estudiante 4:
jean
Ingrese el promedio final del estudiante 4:
10

Mejores Egresados:
Nombre: lenin
Promedio Final: 10.0
-------------
Nombre: jean
Promedio Final: 10.0
*/