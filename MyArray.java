import java.util.*;
public class MyArray{
    public static void main(String[]args){
        ArrayList<String> li =   new ArrayList<String>();
        li.add("AIDS");
        li.add("IOT");
        li.add("IT");
        li.add("COMPS");
        li.add("MECH");
        System.out.println(li);
        
        li.set(2,"change");
        System.out.println(li);

        li.remove(4);
        System.out.println(li);
    }
}