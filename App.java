import java.util.Scanner;
public class App{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        boolean bandera = true;
        while(bandera){
            mostrarMenu();
            int opcion = in.nextInt();
            in.nextLine();
            gestionarOpciones();
            if (opcion == 5) {
                bandera = false;
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("\nMenu por implementar");
    }
    public static void gestionarOpciones(){
        System.out.println("Por implementar");
    }
}