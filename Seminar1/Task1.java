/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {

    public static void main(String[] args) {
        
        String[] sArray = {"first", null, "third"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        div(9, 0);
        printValueByIndex(array,12);
        printStringArray(sArray);

    }
    
    public static void div(double firstNum, double secondNum){

        if(secondNum ==  0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    public static void printValueByIndex(int[] array, int index){

        if(index > array.length-1) {
            throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        }
        else {
            System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
        }
    }

    public static void printStringArray(String[] sArray){
        
        for (String item: sArray){
            if(item == null) {
                throw new NullPointerException("Элемент отсутствует!");
            }
            System.out.println(item);
        }
    }
    
}