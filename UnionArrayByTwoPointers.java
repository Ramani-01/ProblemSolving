import java.util.ArrayList;
import java.util.List;

public class UnionArrayByTwoPointers {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; 
        int[] b = {2,3,4,4,5};

        List<Integer> unionList = new ArrayList<>(); 
        int i = 0, j = 0;
        int len1 = a.length, len2 = b.length; 


        while(i < len1 && j < len2){
            if(a[i] < b[j]){
                if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != a[i]){
                    unionList.add(a[i]);
                }
                i++;
            }
            else{
                if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != b[j]){
                    unionList.add(b[j]);
                }
                j++;
            }
        }
        while(i < len1){
            if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != a[i]){
                unionList.add(a[i]);
            }
            i++;
        }

        while(j < len2){
            if(unionList.isEmpty() || unionList.get(unionList.size() - 1) != b[j]){
                unionList.add(b[j]);
            }
            j++;
        }
       System.out.println(unionList);


    }
}
