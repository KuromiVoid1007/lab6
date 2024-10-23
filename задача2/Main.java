import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);


        for(int i = 0;i < students.length;i++){
            String name = null;
            int grade = 0;

            while(true){
                try{
                    System.out.print("Введите имя студента " + (i + 1) + ": ");
                    name = scanner.nextLine().trim();

                    if (name.isEmpty()) {
                        throw new IllegalArgumentException("Имя не может быть пустым.");
                    }

                    System.out.print("Введите оценку студента " + (i + 1) + ": ");
                    grade = Integer.parseInt(scanner.nextLine());

                    students[i] = new Student(name, grade);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Ошибка: Оценка должна быть числом. Пожалуйста, попробуйте снова.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Попробуйте снова.");
                }
            }
        }

        System.out.println("\nСписок студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Обработка завершена.");
        scanner.close();
    }
}