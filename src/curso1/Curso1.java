
package curso1;

import java.util.Scanner;

public class Curso1 {

    public static void main(String[] args) {
        double promedio=0,notas = 0,materias,suma=0;
        int j=0,i=0,f=0,d=0,k=0,c=0;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        d=entrada.nextInt();
        System.out.println("Ingrese cuantas materias:");
        c=entrada.nextInt();
        for (i = 1; i <= d; i++) {
        System.out.println("Ingrese el numero de notas del estudiante "+i+": ");
        f=entrada.nextInt();
            for (j = 1; j <= f ; j++) {
                System.out.print("Ingrese la "+j+" nota:");
                notas=entrada.nextDouble();
                suma+=notas;
            }
            for (k = 1; k <= c; k++) {
                System.out.println("El promdio de la "+k+"materia es: "+promedio);
                
            }
            promedio=suma/f;
            System.out.println("El promedio del estudiante es "+i+": "+promedio);
            }

           
        }
        
        

    }
    

