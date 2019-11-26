package BinarySearch;

public class Peak {
    public int peak(int a[],int l,int r) {

            int m = l + r;
            if((m==0) || (m==a.length))
                return a[m];
            else if(a[m-1]<a[m]&&a[m]>a[m+1])
                return a[m];
            else if(a[m-1]>a[m])
                return peak(a,l,m-1);
            else
                return peak(a,m+1,r);



    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 40, 1, 0};
        int n=arr.length;
        Peak k=new Peak();
        System.out.println(k.peak(arr,0,n-1));
    }
}
