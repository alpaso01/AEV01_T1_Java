import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A que actividad quieres acceder?");
        int elegir = teclado.nextInt();

        switch (elegir){

            case 1 :
                sayHello hello1 = new sayHello();
                String saludoAlMundo = hello1.saludoAlMundo;
                System.out.println(saludoAlMundo);

                break;

            case 2 :
                sayHello numeros = new sayHello();
                numeros.Numeros();
                break;

            case 3 :
                sayHello alumnos = new sayHello();
                alumnos.alumnos();
                break;
        }



    }

}