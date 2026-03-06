package Arrays;// Print array elements at even index and odd index
//Even numbers: 2, 4, 6, 8, 10
//Odd numbers: 1, 3, 5, 7, 9

public class evnodindexarray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        System.out.println("Elements at Even index : ");
        for(int i = 0; i<arr.length; i++)
        {
            if(i % 2 == 0){
                System.out.println(arr[i] + " ");

            }
        }

        System.out.println("Elements at Odd index : ");
        for(int i = 0; i<arr.length; i++)
        {
            if(i % 2 != 0){
                System.out.println(arr[i] + " ");
            }
        }


    }
}

