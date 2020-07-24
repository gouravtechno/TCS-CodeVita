package digitsexcanged;

import java.util.*;

public class DigitsExchanged {

    public static void main(String[] args) {
        
        boolean flag = false;
        
        //Taking Input in the given fromat : 459 500
        String[] arr = new Scanner(System.in).nextLine().split(" ");
        
        //Getting back data after permutation form the permutate class
        ArrayList<Integer> al = Permutate.printPermutn(arr[0], "");
        
        //Sorting in ascending order
        Collections.sort(al);
        
        for(int a:al)
        {
            //finding the number just bigger from the second value
            if(a>Integer.parseInt(arr[1]))
            {
                flag=true;
                System.out.println(a);
                break;
            }
        }
        //Checking if the number is not found
        if(!flag)
            System.out.println(-1);
    }
}
class Permutate {
    
    public static ArrayList<Integer> al = new ArrayList<>();
    
    static ArrayList<Integer> printPermutn(String str, String ans) 
    { 
        // If string is empty 
        if (str.length() == 0) { 
            al.add(Integer.parseInt(ans));
            return al; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    return al;
    } 
} 