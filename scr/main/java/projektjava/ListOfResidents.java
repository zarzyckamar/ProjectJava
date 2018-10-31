package projektjava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListOfResidents {

    public static HashMap<String, ArrayList<Person>> PersonStorage;

    public ListOfResidents() {
        PersonStorage = new HashMap<>();

    }

    public static void Start() {

        String imie;
        String nazwisko;
        String pesel;
        String miasto;

        File outputFile = new File("odp.txt");
        try {
            outputFile.createNewFile();
        } catch (IOException e) {
            System.out.print("Failed creating file!Exiting...");
            System.exit(-1);
        }


        while (true) {
            System.out.println("Podaj miasto lub wyjdz z programu komenda exit");
            Scanner input = new Scanner(System.in);
            miasto = input.next();
            if (miasto.equals("exit")) {
                break;
            }
            System.out.println("Podaj imie:");
            imie = input.next();
            System.out.println("Podaj nazwisko:");
            nazwisko = input.next();
            System.out.println("Podaj pesel:");
            pesel = input.next();
            if (!CheckPesel.IsValidPesel(pesel)) {
                System.out.println("Pesel nie jest prawidłowy...");
                break;
            }

            Person newPerson = new Person(imie, nazwisko, pesel);
            ArrayList<Person> ListofPeople;

          /*  if (PersonStorage.get(miasto.toUpperCase()) == null)
            {
                ListofPeople = new ArrayList<Person>();
                ListofPeople.add(newPerson);
                PersonStorage.put(miasto.toUpperCase(), ListofPeople);
            }
            else
            {
                ListofPeople = PersonStorage.get(miasto.toUpperCase());
                Person personWithTheSamePesel= ListofPeople.stream()
                        .filter((person)-> person.getPesel().equals(newPerson.getPesel()))
                        .findFirst()
                        .orElse(null);
                if(personWithTheSamePesel==null)
                    {
                        ListofPeople.add(newPerson); }
                else{personWithTheSamePesel.RenamePerson(newPerson.imie, newPerson.nazwisko);}
            }*/
        }
        }
    }
