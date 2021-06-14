import java.util.Scanner;

public class AdivinaElNumero {

    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {
        String nombreJugador = obtenerNombreJugador();

        while (juegoActivo) {
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numeroJuego = obtenerNumeroAleatorio(1, 100);

            System.out.printf("%s, He escogido un número entre %d y %d, adivinalo\nd", nombreJugador, min, max);
            int numeroJugador;

            do {

                numeroJugador = escogerNumero();
                mensaje(numeroJuego, numeroJugador);
                intentos++;
            } while (numeroJuego != numeroJugador);

            System.out.printf("Has ganado, realizaste %d intentos", intentos);

            juegoActivo = jugarNuevamente();
        }
    }

    private int obtenerNumeroAleatorio(int min, int max) {

        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private String obtenerNombreJugador() {
        System.out.println("¿Cuál es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombreJugador);
        return nombreJugador;
    }

    private int escogerNumero() {
        System.out.println("Escoge un numero");
        return entrada.nextInt();
    }

    private void mensaje(int numeroJuego, int numeroJugador) {
        if (numeroJuego < numeroJugador) {
            System.out.println("Muy alto, adivina otra vez");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("Muy bajo, adivina otra vez");
        }
    }

    public boolean jugarNuevamente() {
        System.out.println("¿Quieres jugar nuevamente?\n1. Si\n 2. No");
        int respuesta = entrada.nextInt();
        if (respuesta == 1) {
            System.out.println("Juguemos nuevamente");
            return true;
        } else {
            System.out.println("Fin del juego.");
            return false;
        }
    }}
