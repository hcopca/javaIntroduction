import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingresa el % de propina");
        int porcentaje = entrada.nextInt();

        if (porcentaje < 15) {
            System.out.println("El servicio no fue bueno");
        } else if (porcentaje <= 15 && porcentaje <30){
            System.out.println("El servicio fue excelente");
        }
        else {
            System.out.println("El servicio fue perfecto");
        }

        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("El total es: %.1f", total);
    }
}
