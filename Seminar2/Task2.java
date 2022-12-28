import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task2 {
    public static void main(String[] args) {
        
        System.out.print("Ввод: ");
        Scanner scan = new Scanner(System.in);

        try {
            String str = scan.nextLine();
            if(str.isEmpty()){
                throw new RuntimeException("Пустую строку вводить нельзя");
            }
            System.out.println(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
