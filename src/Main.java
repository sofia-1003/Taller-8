import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = sc.nextInt();
        int sumaCalificaciones = 0;
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;
        int contadorF = 0;

        for (int i = 1; i <= cantEstudiantes; i++){
            System.out.printf("Ingrese la nota del estudiante # %d: ", i);
            int nota = sc.nextInt();
            sumaCalificaciones += nota;

            char letraCalificacion;
            switch (nota / 10){
                case 10:
                case 9:
                    letraCalificacion = 'A';
                    contadorA++;
                    break;

                case 8:
                    letraCalificacion = 'B';
                    contadorB++;
                    break;

                case 7:
                    letraCalificacion = 'C';
                    contadorC++;
                    break;

                case 6:
                    letraCalificacion = 'D';
                    contadorD++;
                    break;

                default:
                    letraCalificacion = 'F';
                    contadorF++;
                    break;
            }

            System.out.printf("El estudiante # %d obtuvo una %c\n", i, letraCalificacion);
        }

        double promedio = (double) sumaCalificaciones / cantEstudiantes;
        System.out.println("\nDetalle :");
        System.out.println("Suma de calificaciones: " + sumaCalificaciones);
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Numero de estudiantes por cada nota obtenida: ");
        System.out.println("A: " + contadorA);
        System.out.println("B: " + contadorB);
        System.out.println("C: " + contadorC);
        System.out.println("D: " + contadorD);
        System.out.println("F: " + contadorF);
    }

}