package Exercise2;

//Print the elements of an array in reverse order
public class Example2 {

    public static void main(String[] args) {

        int [] array = new int[] {1,2,3,4,5};
        System.out.println("Original array: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nArray in reverse order: ");
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
