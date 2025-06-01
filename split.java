import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String s = "i am a very good boy do you know that u motherfucker";
         String r = "i,am,a very goo*boy do you know that u,motherfucker";
        String [] str = s.split(" "); // a single space as the breaking point is a space
        String[] all = s.split("[ ,*]");// if there are multiple breaking point put them inside a third bracket
        System.out.println(Arrays.toString(all));
    }
}
