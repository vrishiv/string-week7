package stringhw7;

public class Class5 {
    public static void main(String[] args)
    {
        String name = "I@love@java";

        System.out.println(name);
        name = name.replace( "@", " ");

        System.out.println(name);
        name= name.replace( "I","We" );
        System.out.println(name);


    }

}
