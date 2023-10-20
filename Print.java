import java.util.*;
public class Print{
    public static <E> void printlist(ArrayList<E> inputList)
    {
        for(E element: inputList)
        {
        System.out.println(element);
        }
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        ArrayList<String> arr2= new ArrayList<>();
        arr2.add("Hii");
        arr2.add("Yaksh");
        arr2.add("hellloo");
        arr2.add("Heyy");
        arr2.add("kush");

        printlist(arr);
        printlist(arr2);

    

    }
}