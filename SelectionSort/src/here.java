public class here{
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,3,4};
        int n = arr.length;
        // System.out.println("\nBefore ==> ");
        // for(int a = 0; a < n; a++ ) {
        //     System.out.print(arr[a] + " ")
        for (int i = 0; i < 3- 1; i++) {
                int max=i;
                for (int j = i + 1; j < 3; j++) {
                if(arr[max]<arr[j]){ 
                    max = j; 
                }
            }
            int tanda = arr[max];
            arr[max] = arr[i];
            arr[i] = tanda;
        }
        
        System.out.println(" ");
        System.out.println("\nAfter ===> ");
        for(int b = 0; b < n; b++) {
            System.out.print(arr[b] + " ");
        }
    }
}