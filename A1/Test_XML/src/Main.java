import visitor.*;
import syntaxtree.*;
import java.util.*;
public class Main 
{
    public static void main(String arg[])
    {
        try
        {
            Integer a = 0;
            GJVoidDepthFirst<Integer> obj = new GJVoidDepthFirst<Integer>();
            Node root = new QTACoJavaParser(System.in).Goal();
            root.accept(obj,a);
            a++;
            root.accept(obj,a);
        }
        catch(ParseException e)
        {
            System.out.println(e);
        }
    }    
}
