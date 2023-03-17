import java.util.Scanner;

public class ViewUser {
    public static String[] inputData() {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = scan.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные.");
            } else System.out.println("Вы ввели данных больше, чем пологается.");
        }

    }
}
