import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nARRAY DATA INPUT AND DISSPALY");
        Scanner sc  = new Scanner(System.in);

         Map map = new HashMap();
         String str = "Hello im Pramuditha Madura and Im cool";

         for(char x:str.toCharArray()){
             if(map.containsKey(x)){
                 int old = (int) map.get(x);
                 map.put(x,old+1);
             }
             else{

                 map.put(x,1);
             }
         }
        map.remove(' ');
        System.out.println(map);

    }
}