
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AddToArray {


    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        
        int[] list={1,2,0,0};
       list1= addToArrayForm(list, 34);
       System.out.println(list1);
        
    }
    static List<Integer> addToArrayForm(int[]num,int k)
    {
        List<Integer> list= new ArrayList<>();
        int pointer=num.length-1;
        int carry=0;
        while (pointer>=0 || k>0) {
            int digit=k%10;
            k=k/10;
            int x = (pointer >= 0) ? num[pointer] : 0;//Hidden case
            int sum= x+carry+digit;
            int val=sum%10;
            carry=sum/10;
            list.add(val);
            pointer--;
            
        }if (carry>0) {
            list.add(carry);
            
        }
        Collections.reverse(list);
        return list;
    }
    
}
