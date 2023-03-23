import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> intList =  new ArrayList<>();
        for (int i=0;i<10;i++)
            intList.add(i,x.nextInt());
        System.out.println(max(intList));
    }

    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty()|| list.size()==0)
            return null;
        int max = list.get(0);
        for(Integer k:list){
            if(k>max)
                max = k;
        }
        return max;
    }
}

// Write the following method that returns the maximum value in an ArrayList of integers.
// The method returns null if the list is null or the list size is 0.