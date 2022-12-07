package Exercise2;

//Find the largest element in an array
public class Example3 {

    public static void main(String[] args) {

        int [] arr = new int[] {1,2,3,4,5};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element is " + max);
    }
}
