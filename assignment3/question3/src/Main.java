import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> intList =  new ArrayList<>();
        for (int i=0;i<5;i++)
            intList.add(i,x.nextInt());
        sort(intList);
    }

    public static void sort(ArrayList<Integer> list){
        if(list.isEmpty() || list.size()==0)
            System.out.println("ArrayList is empty!!");
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                Integer tempI= list.get(i);
                Integer tempJ= list. get(j);
                if(tempI>tempJ){
                    list.set(i,tempJ);
                    list.set(j,tempI);
                }
            }
        }
        for(Integer k:list)
            System.out.println(k);
    }
}

// Write the following method that sorts an ArrayList of numbers