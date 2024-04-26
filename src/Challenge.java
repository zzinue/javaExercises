import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        String nombre="Tony stark";
        String tipoDeCuenta="Corriente";
        double saldo=1599.99;
        int opcion=0;

        System.out.println("**********************************");
        System.out.println("\n Nommbre del cliente: "+ nombre);
        System.out.println("El tipo de cuenta es:"+tipoDeCuenta);
        System.out.println("Su saldo disponible es:"+ saldo);
        System.out.println("\n********************************");

        String menu = """
                *** Escriba el numero de la opcion deseadad***
                1.- Consultar saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;

        Scanner teclado=new Scanner(System.in);
        while(opcion !=9){
            System.out.println(menu);
            opcion=teclado.nextInt();
        }
    }
}
