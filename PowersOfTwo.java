public class PowersOfTwo {
    public static void main(String[] args) {
        // program to discuss the whether the given number is exact power of 2 or not
        int number=333;
        int i=0;
        int flag=0;
        while (number>=Math.pow(2, i)) {
            if(number==Math.pow(2, i))
            {
                flag=1;

            }
            i++;
            
        }
        if(flag==1)
        {
            System.out.println("The given number is in the order of 2.");
        }
        else
        System.out.println("The given number is not in order of 2.");
    }
}
// more effective code for this problem using shift operator
/*public class PowersOfTwo {
    public static void main(String[] args) {
        int number = 333;
        if (number <= 0) {
            System.out.println("The given number is not in order of 2.");
            return;
        }
        boolean flag = false;
        int i = 0;
        while ((1 << i) <= number) {
            if (number == (1 << i)) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag)
            System.out.println("The given number is in the order of 2.");
        else
            System.out.println("The given number is not in order of 2.");
    }
}
 */
