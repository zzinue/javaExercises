import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("EScribe el nombre de tu pelicula");
        String pelicula=teclado.nextLine();
        System.out.println("Ahora escribe la fecha del lanzamiento");
        int fechaDeLanzamiento=teclado.nextInt();
        System.out.println("Por ultimo escribe  que nota le das a esta pelicula");
        double nota=teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

    }
}
