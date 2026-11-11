public class Assignment01Q01 {
    public static void main(String[] args) {

        for (String arg :args)
        {
            char c=arg.charAt(0);
            int asc=(int)c;
            if (asc%5==0)
            System.out.println(c);
        }
    }
}
