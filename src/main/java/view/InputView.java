package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputNames() {
        return scanner.nextLine();
    }

    public static int inputLadderLength() {
        try {
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            scanner.nextLine();
            return inputLadderLength();
        }
    }
}
