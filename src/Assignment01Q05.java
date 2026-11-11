public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        boolean [] arr=new boolean[m.length];
        return (rec(m,i,j,arr));
    }

public static int rec(int[][] m,int i,int j,boolean[] arr)
{
    if (i==j)
            return 0;
        arr[i]=true;
        int min=m.length;
        int x;
        int path;
        
        for (int k=0;k<m.length;k++)
        {
            if ((m[i][k]==1)&&(arr[k]==false))
            {
               path=rec(m, k, j,arr);
               if (path!=-1)
            {
                x=path+1;
                if (x<min)
                    min=x;
            }
            }
        
        }
        arr[i]=false;
        if (min==m.length)
            return -1;
        else
            return min;
}


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}