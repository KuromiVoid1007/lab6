import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];


        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
        }

        try {

            for (int i = 0; i < 5; i++) {
                if (strings[i] == null || strings[i].isEmpty()) {
                    System.out.println("Строка пустая");
                } else {
                    System.out.println("Длина строки: " + strings[i].length());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Обращение к несуществующему элементу массива.");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Строка пустая.");
        } finally {
            System.out.println("Обработка завершена.");
        }

        //Вариант всегда выдет ArrayIndexOutOfBoundsException
        /* try {
            for (int i = 0; i <= 5; i++) {
                if (strings[i] == null ) {
                    throw new NullPointerException();
                }
                if (strings[i].isEmpty()) {
                    System.out.println("Строка пустая");
                } else {
                    System.out.println("Длина строки: " + strings[i].length());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Обращение к несуществующему элементу массива.");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Строка пустая.");
        } finally {
            System.out.println("Обработка завершена.");
        }*/
    }
}