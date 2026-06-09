public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(321));
    }
    static boolean isPalindrome(int x)
    {
        int temp=x;
        int reversedxber=0;
        while (x>0) {
            int remainder=x%10;
            reversedxber=reversedxber*10+remainder;
            x=x/10;
            
        }
        if(reversedxber==temp)
        {
            return true;
        }
        else
         return false;
    }
}
