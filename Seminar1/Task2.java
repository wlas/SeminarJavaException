/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {3,5,7,78,99,9};
        int[] array2 = {6,4,4,6,77,8,6};
        comparison(array1, array2);
    }

    private static int[] comparison(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны.");
        }

        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = arr1[i] - arr2[i];
        }
        return resultArr;
    }
}
