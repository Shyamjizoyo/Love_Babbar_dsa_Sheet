import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
        String rname = "";
        int l = name.length();
       for(int i=l-1;i>=0;i--){
        rname = rname+name.charAt(i);
       }
       System.out.println(rname);
    }
}
