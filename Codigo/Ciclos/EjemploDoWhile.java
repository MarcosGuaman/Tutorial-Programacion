import java.util.Scanner;

public class EjemploDoWhile {
 public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String clave;

        do {
            System.out.println("Ingrese la contraseña:");
            clave = teclado.nextLine();

            if (!clave.equals("java123")) {
                System.out.println("Contraseña incorrecta");
            }

        } while (!clave.equals("java123"));

        System.out.println("Acceso permitido");
    }
}
