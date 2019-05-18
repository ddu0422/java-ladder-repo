package ladder.input;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] inputParticipants() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return StringUtils.split(scanner.nextLine(), ",");
    }
}
