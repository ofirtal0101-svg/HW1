public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int p=1;
        int num=Integer.parseInt(args[0]);
        for (int i=0;i<num;i++)
        {
            approxPi=approxPi+(((int)Math.pow(-1,i))*(1.0/p));
            p=p+2;
        }
    approxPi=approxPi*4;
        
        
        System.out.println(approxPi + " " + actualPi);
    }
}
