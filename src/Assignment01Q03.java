public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int [] arr= new int[x];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<x;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }

        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
            if (arr[i]%2==1) 
                numOdd++;
        }
        
        
        
        System.out.println('\n'+"The number of odd numbers is: " + numOdd);
    }
}
