/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {3,5,7,78,99,9};
        int[] array2 = {6,4,4,6,77,8,6};
        int[] divArray = divArrays(array1, array2);
        printArray(divArray);
    }

    private static int[] divArrays(int[] arr1, int[] arr2){

        if (arr1 == null || arr2 == null) throw new RuntimeException("Нет массивов!");
        if(arr1.length != arr2.length) throw new RuntimeException("Длины массивов не равны!!!");
        
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = arr1[i]/arr2[i];
        }
        
        return resultArr;
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.println(number);
        }
    }
}
