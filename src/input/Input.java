package input;
import java.time.LocalDate;
import java.util.Scanner;

public class Input
{
    private static Scanner sc = new Scanner(System.in);

    public static String inputString(String texto)
    {
        System.out.println(texto);
        return sc.next();
    }

    public static int inputInt(String texto) {
        try {
            System.out.println(texto);
            return Integer.parseInt(sc.next());
        } catch (NumberFormatException ex) {
            System.out.println("Digite um número válido: " + ex);
            return inputInt(texto);
        }
    }

    public static int inputIntSemTexto() {
        try {
            return Integer.parseInt(sc.next());
        } catch (NumberFormatException ex) {
            System.out.println("Digite um número válido: " + ex);
            return inputIntSemTexto();
        }
    }

    public static double inputDouble(String texto) {
        try {
            System.out.println(texto);
            return Double.parseDouble(sc.next());
        } catch (NumberFormatException ex) {
            System.out.println("Digite um número válido: " + ex);
            return inputInt(texto);
        }
    }

    public static char inputChar() {
        return sc.next().charAt(0);
    }

    public static LocalDate inputDate(String texto)
    {
        return LocalDate.parse(sc.next());
    }
}