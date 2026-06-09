public class MaxSmax {
    public static void main(String[] args) {
        // program to find the max and second max number for the given array
        int[] arr={33,55,55,133,556,1,88,99,0,111,999};
        int max=-1;
        int smax=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>= max)
            {
                smax=max;
                max=arr[i];
            }
            else if(smax<=arr[i])
            {
                smax=arr[i];
            }
        }
        System.out.println("The maximum number is "+max);
        System.out.println("The second maximum number is "+smax);
    }
}
