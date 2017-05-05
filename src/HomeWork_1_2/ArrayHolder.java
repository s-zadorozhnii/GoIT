package HomeWork_1_2;

/**
 * Created by Serhii Zadorozhnii on 01.05.2017.
 */
public class ArrayHolder {

    private int[] masiv;

    ArrayHolder(int arraySize) {
        masiv = new int[arraySize];
    }


    int[] getMas() {
        return masiv;
    }

    void fillArray(int[] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = (int) ((Math.random() * 10 + 1));
        }
    }

    void sortArrayInAscending() {
        for (int i = 1; i < masiv.length; i++) {
            for (int j = 1; j < masiv.length; j++) {
                if (masiv[j] < masiv[j - 1]) {
                    int swap = masiv[j];
                    masiv[j] = masiv[j - 1];
                    masiv[j - 1] = swap;
                }
            }
        }
    }

    void sortArrayInDescending() {
        for (int i = 1; i < masiv.length; i++) {
            for (int j = 1; j < masiv.length; j++) {
                if (masiv[j] > masiv[j - 1]) {
                    int swap = masiv[j];
                    masiv[j] = masiv[j - 1];
                    masiv[j - 1] = swap;
                }
            }
        }
    }

    String findElement(int element) {
        String string = "";
        boolean isInArray = false;

        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] == element) {
                if (isInArray)
                    string += ", ";
                string += i;
                isInArray = true;

            }
        }
        if (string.equals("")) return ("NOWHERE\n");
        return string;
    }
}
