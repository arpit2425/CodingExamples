package BinarySearch;

public class FixedPoint {
    public int isFixed(int a[])
    {
        int l,r;
        l=0;
        r=a.length-1;
        while (l<r)
        {
            int m=(l+r)/2;
            if(a[m]==m)
                return m;
            else if(a[m]<m)
            {
                l=m+1;
            }
            else
            {
                r=m-1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-10, -5, 3, 4, 7, 9};
        FixedPoint p=new FixedPoint();
        System.out.println(p.isFixed(arr));
    }
}
