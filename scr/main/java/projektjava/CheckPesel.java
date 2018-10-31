package projektjava;

public class CheckPesel {

    public static boolean IsValidPesel(String pesel) {

        final int PESEL_DLUGOSC = 11;


        if (pesel == null)
            return false;
        if (pesel.length() != PESEL_DLUGOSC)
            return false;

        int[] position = new int[11];
        for (int i = 0; i < 11; i++) {
            position[i] = Integer.parseInt(pesel.substring(i, i + 1));
        }
        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int check = 0;

        for (int i = 0; i < 10; i++) {
            check += weights[i] * position[i];
        }
        int lastNumber = check % 10;
        int controlNumber = 10 - lastNumber;

        if (controlNumber != position[10]) {
            return false;
        }

        return true;
    }
}
