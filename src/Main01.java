import java.util.Scanner;

public class Main01 {
// типа что то новое добавил =/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Введите 1 чтобы закончить программу или 0 чтобы закончить цикл");
      int answer = scanner.nextInt();
      if (answer == 1) {
        // return заканчивает выполнение метода. В этой строке закончится выполнение всей программы
        return;
      } else if (answer == 0) {
        // break закончит только выполнение цикла. В этой строке закончится только цикл, а программа продолжит работать
        break;
      }
      System.out.println("Вы ввели неправильное число!");
    }
    System.out.println("Цикл окончен! Хорошего дня!");

  }

}
