import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionArrayBySet{
    public static void main(String[] args) {
         int[] a = {1,2,3,4,5}; 
         int[] b = {2,3,4,4,5};
        Set<Integer> num = new TreeSet<>();

        //  To Iterate the first array.
        for(int index = 0; index < a.length; index++){
            num.add(a[index]);
        }

        // To iterate the Second array
        for(int index = 0; index < b.length; index++){
            num.add(b[index]);
        }
        ArrayList<Integer> res = new ArrayList<>(num);
        System.out.println(res);
        
    }
}
