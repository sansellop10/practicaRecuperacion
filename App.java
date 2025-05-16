import java.util.Scanner;
public class App{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        boolean bandera = true;
        while(bandera){
            mostrarMenu();
            int opcion = in.nextInt();
            in.nextLine();
            gestionarOpciones(opcion);
            if (opcion == 5) {
                bandera = false;
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("\nMenu de calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("\nIntroduce opcion");
        System.out.println(" >");
    }
    public static void gestionarOpciones(int opcion){
        switch(opcion){
            case 1:
                System.out.println("Falta por implementar la suma");
            break;
            case 2:
                System.out.println("Falta por implementar la resta");
            break;
            case 5:
                System.out.println("Saliendo...");
            break;
            default:
                System.out.println("Error");
            break;
        }
    }
}