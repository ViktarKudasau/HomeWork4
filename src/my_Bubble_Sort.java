public class my_Bubble_Sort {
    public static void main(String[] args){

        int[] array = {23,17,34,3,157,18,25,39,163,27,99};
        PrintArray(array);      // ¬ыводим в консоль исходный массив
        boolean sort = false;
        while (sort != true){
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sort = false;
                }
            }
        }
        System.out.println();
        PrintArray(array);   // ¬ыводим в консоль отсортированный массив методом Bubble Sort
    }
    static void PrintArray(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(" " +arrayToPrint[i]);
        }
    }
}
