package projektjava;

public class Person {
    public String imie;
    public String nazwisko;
    public String pesel;

    public String getImie() {
        return imie;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Person(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void RenamePerson(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


}