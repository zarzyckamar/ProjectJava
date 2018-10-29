import java.util.Scanner;

public class ListOfResidents {


    public static void main(String[] args) {
        while (true) {
            System.out.println("Podaj imie lub wyjdz z programu komenda exit");
            Scanner input = new Scanner(System.in);
            String imie = input.next();
            if (imie.equals("exit"))  {
                break;
            }
            System.out.println("Podaj nazwisko:");
            String nazwisko = input.next();
            System.out.println("Podaj pesel:");
            String pesel = input.next();
            System.out.println("Podaj miasto:");
            String miasto= input.next();

        }

    }

}