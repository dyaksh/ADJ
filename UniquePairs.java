import java.util.*;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the  no. of pairs :");
        
        n = Integer.parseInt(sc.nextLine());
        HashSet<String> hs= new HashSet<>();
        System.out.println("Enter the "+n+" pairs");
        for (int i=0;i<n; i++){
            hs.add(sc.nextLine());
        }

        System.out.println("Unique pairs :"+hs.size());
        System.out.println("Unique pairs entered : "+hs);
        
    }
}