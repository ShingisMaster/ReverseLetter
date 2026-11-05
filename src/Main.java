import java.util.Scanner;

public class Main {

    final static String EXIT_COMMAND = "Exit";


    public static void main(String[] args) {
        while (true) {

            System.out.println("Enter your letter:\n");

            Scanner scanner = new Scanner(System.in);
            String letter = scanner.nextLine();

            if (letter.isBlank()) {
                System.out.println("Letter should not be empty!\n");
                continue;
            } else if (letter.equals(EXIT_COMMAND)) {
                System.out.println("Exiting program...\n");
                break;
            }

                String revertedLetter = revertLetter(letter);
            System.out.println(revertedLetter);
        }
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

            if ((Character.isLetter(array[left])) && (Character.isLetter(array[right]))) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            left++;
            right--;


        }
        return new String(array);
    }
}