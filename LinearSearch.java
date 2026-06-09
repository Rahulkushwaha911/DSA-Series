public class LinearSearch {
    public static void main(String[] args) {
        // program to find the particular number in the array using linear sear ch
        int[] arr={22,333,55,66,11,00,001,44,77};
        int target=77;
        System.out.println(linearSearch(arr, target));

    }
    static boolean linearSearch(int[] nums, int target)
    {
        for (int i : nums) {
            if(target== i)
            return true;
            
        }
        return false;
    }
}
