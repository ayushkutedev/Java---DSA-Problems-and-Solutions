package Arrays;
// Find second largest element in array
public class secondlargestt {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 30};
        int largest =arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest = arr[i];

            }

        }
        System.out.println("Largest element is : " + largest);

        int secondlargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest){
                if(secondlargest == 0 || arr[i] > secondlargest){
                    secondlargest = arr[i];
                }
            }
        }

        System.out.println("Second largest element : " + secondlargest);
    }

}
// 👣 Step-by-step:
//🟢 Step 1: First find the largest
//java
//Copy
//Edit
//arr = {10, 20, 5, 8, 30}
//We loop through all elements and find that:
//
//largest = 30
//
//🟡 Step 2: Now find the second largest
//We initialize:
//
//java
//Copy
//Edit
//secondLargest = -1
//Now go through each number but skip 30 (because it's already the largest):
//
//🔄 Walk through:
//Check 10
//
//Is 10 != 30? ✅ Yes
//
//Is 10 > -1? ✅ Yes
//→ secondLargest = 10
//
//Check 20
//
//Is 20 != 30? ✅ Yes
//
//Is 20 > 10? ✅ Yes
//→ secondLargest = 20
//
//Check 5
//
//Is 5 != 30? ✅ Yes
//
//Is 5 > 20? ❌ No
//→ Do nothing
//
//Check 8
//
//Is 8 != 30? ✅ Yes
//
//Is 8 > 20? ❌ No
//→ Do nothing
//
//Check 30
//
//Is 30 != 30? ❌ No
//→ Skip
//
//✅ Final Answer:
//secondLargest = 20