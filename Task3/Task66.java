
package Task3;



public class Task66 {
    public static void main(String[] args) {
        int[] aa = {};
        int[] bb = {};
        int[] aa1 = {20, 199, 512};
        int[] bb2 = {13,28,-0};
        Calc(aa, bb);
        Calc(aa1,bb2);
    } 
    

    
    public static void Calc(int[] arrayA, int[] arrayB) { 
        System.out.println("\nЕлементи у першій множині: ");
        for(int i: arrayA ){
            System.out.print(i + "  ");
        }
        System.out.println("\nЕлементи у другій множині: ");
        for(int i: arrayB ){
            System.out.print(i + "  ");
        }
        int numb = arrayA.length + arrayB.length;
        int [] finalArr = new int[numb];
        System.arraycopy(arrayA, 0, finalArr, 0, arrayA.length);
        System.arraycopy(arrayB, 0, finalArr, arrayA.length , arrayB.length);
        
        System.out.println("\nЕлементи у першій + другій множині:");
        for(int i =0; i<finalArr.length; i++) {
            System.out.print( finalArr[i] + " ");
        }
        System.out.println(" ");
    }
}
    