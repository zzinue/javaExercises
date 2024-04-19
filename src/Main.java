//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut  actionId="ShowIntentionActions"/> with your caret at the highlighted text
                    // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido a screen match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan=true;
        double notaDeLaPelicula=8.2;

        double media=(8.2+6.0+9.0)/3;

        System.out.println(media);

        String sinopsis= """
                Matrix es una paradoja la mejor pelicula del fin del milenio
                fue lanzada en: 
                """+fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion= (int) (media/2);
        System.out.println(clasificacion);

        int convertidor=44;
        double multiplicador=1.8;
        double operacion= (convertidor* multiplicador)+32;
        System.out.println(operacion);




    }
}