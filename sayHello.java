import java.util.Scanner;

public class sayHello {
    String saludoAlMundo = "Hola Mundo";

    public String Numeros (){
        String mostrar = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el ultimo numero");
        int num2 = teclado.nextInt();

        for (int i =0; i < num2 ; i++){


            //debe sumarse 1 cada vez que pasa
            num1++;

            //mostrar numeros
           System.out.println(num1);

            //los numeros deben ser menores o iguales al ultimo numero
            if (num1 < num2){
                int resultado = 0;

                resultado = num1 % 2;

                //si el resultado del numero dividido entre 2 da 0 es primo
                if (resultado == 0){
                    mostrar = "El numero es primo";
                    System.out.println(mostrar);
                }else {
                    mostrar = "El numero no es primo";
                    System.out.println(mostrar);
                }
            }
        }
        return mostrar;
    }


    public void alumnos(){
int contador = 0;
        String[] ArrayAlumnos = new String[6];
        ArrayAlumnos[0] = "Alex";
        ArrayAlumnos[1] = "Rafa";
        ArrayAlumnos[2] = "Alberto";
        ArrayAlumnos[3] = "Quique";
        ArrayAlumnos[4] = "Pablo";
        ArrayAlumnos[5] = "Fermin";
System.out.println("ALUMNOS : ");
System.out.println("--------------");
for (String a : ArrayAlumnos){
    System.out.println(a);
}
System.out.println("--------------");

System.out.println("EL MAS GRANDE : ");
        for (String a : ArrayAlumnos){
            System.out.println(a.length());
        }
        System.out.println("--------------");
        for (String a : ArrayAlumnos){

            System.out.println("Posición de "+ a + "["+contador+"]" );
            contador++;
        }
    }
}