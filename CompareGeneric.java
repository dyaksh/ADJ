import java.util.Scanner;



public class CompareGeneric {

    public static <E>Boolean equalTo(E o1, E o2){
if (o1.equals(o2)){
    return true;
} else{
    return false;
}
} 
    public static void main(String[] args){
        Object o1, o2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input 1");
        
        o1 = sc.nextLine();
        System.out.println("Enter input 2");
        o2 = sc.nextLine();

if(equalTo(o1, o2)){
    System.out.println("TRUE");
} else{
        System.out.println("False");

}
sc.close();
    }
}
