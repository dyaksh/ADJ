import java.util.*;
public class LinkList{
    public static void main(String[]args)
    {
    LinkedList<Integer> courselist1 = new LinkedList<>();
    courselist1.add(80);
    courselist1.add(45);
    courselist1.add(90);
    courselist1.add(55);
    courselist1.add(70);
    System.out.println("Linked list 1:"+courselist1);
  

    LinkedList<Integer> courselist2 = new LinkedList<>();
    courselist2.add(35);
    courselist2.add(20);
    courselist2.add(25);
    courselist2.add(95);
    courselist2.add(40);
    System.out.println("Linked list 2:"+courselist2);



    System.out.println("Merging of List 1 and List 2:");
    LinkedList<Integer> courselist3 =new LinkedList<>();
    courselist3 =(LinkedList) courselist1.clone();
    courselist3.addAll(courselist2);
    System.out.println(courselist3);

    
    Collections.sort(courselist3);
    System.out.println("Sorting of list"+courselist3);

    System.out.println("Minimum :"+Collections.min(courselist3));
    System.out.println("Maximum :"+Collections.max(courselist3));

    LinkedList<Integer> Pass= new LinkedList<>();
    LinkedList<Integer> Fail= new LinkedList<>();

    for(Integer e:courselist3)
    {
        if(e>50){
            Pass.add(e);
        }
        else{
            Fail.add(e);
        }
    }
    System.out.println("Pass"+Pass);
    System.out.println("Fail"+Fail);

    LinkedList<Integer> Above= new LinkedList<>();
       for(Integer i:courselist3)
    {
        if(i>=90){
            Above.add(i);
        }
    }
    System.out.println("Student Above 90:"+Above);
    }
}