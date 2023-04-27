import java.util.Scanner;

public class diasemana {

    public static void main(String[] args) {

        int N;

        Scanner digitarEntrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Inserte un numero de dia, del 1 al 7");
        System.out.println("1 es Lun / 2 es Mar / 3 es Mie / 4 es Jue / 5 es Vie / 6 es Sab / 7 es Dom ");
        N = digitarEntrada.nextInt();

        if (N > 0 && N < 7) {

            if (N == 1) {
                System.out.println("Has seleccionado el Lunes, es un dia laboral");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 2) {
                System.out.println("Has seleccionado el Martes, es un dia laboral");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 3) {
                System.out.println("Has seleccionado el Miercoles, es un dia laboral");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 4) {
                System.out.println("Has seleccionado el Jueves, es un dia laboral");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 5) {
                System.out.println("Has seleccionado el Viernes, es un dia laboral");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 6) {
                System.out.println("Has seleccionado el Sabado, es un dia festivo");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
            if (N == 7) {
                System.out.println("Has seleccionado el Lunes, es un dia festivo");
                System.out.println("Vielve a ejecutar el programa para comprobar denuevo un dia");
            } else {}
        } else {
            System.out.println("Necesitas seleccionar un numero de dia valido del 1 al 7");
            System.out.println("Vielve a ejecutar el programa");
        }
    }
}

