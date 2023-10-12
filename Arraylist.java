import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args){
           // Syntex: ArrayList<DataType_Name> variable_Name = new ArrayList<>();
           ArrayList<Integer> list = new ArrayList<>();
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           System.out.println(list);
           System.out.println(list.get(2));
           list.remove(3);
           System.out.println(list);
           list.set(2,5);
           System.out.println(list);
           System.out.println(list.contains(3));

        //    Problem 1. Print reverse of an arraylist:
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        //  Problem 2. Find maximum in the arraylist
        int max= Integer.MIN_VALUE;
        for(int j=0; j<list.size();j++){
            max= Math.max(list.get(j), max);
        }
        System.out.println("Max No: " + max);

    }
    }