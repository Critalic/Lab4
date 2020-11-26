package Task2;



public class Task43 {
    // Задаємо множини і викликаємо метод Error()
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 6, 4, 0};
        int[] arr1 = {0};
        int[] arr2 = {};
        int[] arr3 = {1,2}; 
        Error(arr);
        Error(arr1);
        Error(arr2);
        Error(arr3);

    }
    // Ловимо помилки з Calc() і виводимо букви на екран
    public static void Error(int[] array) {
        System.out.print("Дано: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("]");
        try {
            Calc(array);
        } catch (IndexOutOfBoundsException err) {
            System.out.println("ERROR! " + err.getMessage());
        }
    }
    // Обчислюємо все і видаємо помилки, якщо щось не так
    public static void Calc(int[] array) {
        int index =0;
        int numberOf2=0;
        if( array.length<2) 
            throw new IndexOutOfBoundsException("Масив має містити хоча б 2 елементи");
        
        for(int i =1; i<=array.length; i++) {
            if( i%2 ==0) numberOf2++;
        }
        
        int [] arr = new int[numberOf2];
        
        for(int i =1; i<=array.length; i++) {
            if( i%2 ==0){
                arr[index] = array[i-1];
                index++;
            }
        }
        for(int i = 0; i<arr.length; i++) {
            for( int b = arr.length-1; b>i; b--) {
                if(arr[b] < arr[b-1]) {
                    int t = arr[b-1];
                    arr[b-1] = arr[b];
                    arr[b] = t;
                }
            }
        }
        if(arr.length==1) 
            System.out.println("Сума найбільшого та найменшого елементів масиву, індекс яких кратний 2 = " + arr[0] );
        
        else
            System.out.println("Сума найбільшого та найменшого елементів масиву, індекс яких кратний 2 = " + (arr[0] + arr[arr.length-1]));
    }
}