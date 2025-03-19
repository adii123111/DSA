import java.util.*;

public class StringBuiler {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hellobitch");
        System.out.println(sb);

 
        System.out.println(sb.charAt(7));

        sb.setCharAt(7, 'd');
        System.out.println(sb);

        
        System.out.println(sb.insert(3, 'D'));

    }
}
