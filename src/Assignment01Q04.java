import java.util.Arrays;


public class Assignment01Q04 {


    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (move==0 || array.length==0 )
            return array;
        int sign;
        int [] temp=new int[array.length];
        int realMove=move%array.length;
        
        switch (direction) {
            case 'R':
                sign=1;
                break;
            case 'L':
                sign=-1;
                break;
            default:
                return array;
            }
            if (realMove<0)
            {
                sign=sign*-1;
                realMove=realMove*-1;
            }
            
            int checker;
            for (int i=0;i<array.length;i++)
            {
                checker=(i+((sign)*realMove))%array.length;
                if (checker<0)
                checker=checker+array.length;
                temp[checker]=array[i];

            }

            for (int i=0;i<array.length;i++)
            {
                array[i]=temp[i];
            }
    
            
            

            
        



        return array;
    
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}