import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        String revertedLetter = revertLetter(letter);
        System.out.println(revertedLetter);

    }

    public static String revertLetter(String letter) {

        char[] array = letter.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {


            if ((Character.isLetter(array[left])) && (!Character.isLetter(array[right]))) {

                do {
                    right--;
                }
                while (!Character.isLetter(array[right]));

            } else if ((!Character.isLetter(array[left])) && (Character.isLetter(array[right]))) {

                do {
                    left++;
                }
                while (!Character.isLetter(array[left]));
            }

            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;

        }
        return new String(array);
    }
}