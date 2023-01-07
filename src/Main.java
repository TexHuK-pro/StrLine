import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название метода или поля через пробел: ");
            String string = in.nextLine();

            //выход из программы если встретим символ 'q'
            if (Objects.equals(string, "q")) break;

            System.out.println(creatingNamesForMethodsAndFields(string));
        }
    }

    private static String creatingNamesForMethodsAndFields(String string) {
        String[] arrayFromInputString = string.split(" ");
        StringBuilder finishedString = new StringBuilder();
        String preparedWordForString;

        for (int i = 0; i < arrayFromInputString.length; i++) {
            if (i != 0) {
                //Замена в каждом слове первую букву на заглавную, кроме первого слова
                preparedWordForString = arrayFromInputString[i].substring(0, 1).toUpperCase() +
                        arrayFromInputString[i].substring(1);
            } else {
                preparedWordForString = arrayFromInputString[i];
            }
            finishedString.append(preparedWordForString);
        }
        System.out.println("<---------------->");
        return finishedString.toString();
    }
}