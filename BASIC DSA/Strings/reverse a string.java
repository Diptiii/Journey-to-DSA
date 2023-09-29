import java.util.*;

public class Questions {
    public static void main(String args[]) {

                StringBuilder greeting=new StringBuilder("Hello");
                int n=greeting.length();
                for(int i=0;i<greeting.length()/2;i++){
                    int start=i;
                    int end=n-1-i;

                    char stch=greeting.charAt(start);
                    char ench=greeting.charAt(end);

                    greeting.setCharAt(start,ench);
                    greeting.setCharAt(end,stch);

                }

        System.out.println(greeting);
            }
        }

