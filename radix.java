package coding;
class radi{
    public void sort(int[]a, double []b)
    {
        for(int i=1;i<a.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (b[j]>b[i])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        
    }
    public void rad(int [] a)
    { 
        double[] b=new double[a.length];
        for(int i =0;i<3;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                b[j]=(((a[j]/(Math.pow(10, i))))%10);
            }
            
        sort(a,b);
        }
          for (int j=0;j<a.length;j++)
            {
                System.out.println(a[j]);
            }
    }
}

public class radix {
    public static void main(String args[])
    {
        int[]a={1,5,887,44,12,10};
        radi o=new radi();
      o.rad(a);
    }
   
}
