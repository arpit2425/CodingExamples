package sorting;

public class MergeSort {
    int a[];
    int n;

public void mergesort(int l,int r)
{
    if(l<r)
    {
        int m=(l+r)/2;
        mergesort(l,m);
        mergesort(m+1,r);
        merge(l,m,r);
    }
}

    public void merge(int l, int m, int r) {
    int n1,n2;
    n1=m-l+1;
    n2=r-m;
    int left[]=new int[n1];
    int right[]=new int[n2];
    int i,j,k;
    for(i=0;i<n1;i++)
        left[i]=a[l+i];

    for(i=0;i<n2;i++)
    {
        right[i]=a[m+i+1];
    }

    i=0;
    j=0;
    k=l;
    while(i<n1&&j<n2)
    {
        if(left[i]<=right[j])
        {
            a[k]=left[i];
            i++;
        }
        else         {
            a[k]=right[j];
            j++;
        }
        k++;
    }
   while (i<n1)
   {
       a[k]=left[i];
       i++;
       k++;
   }
   while (j<n2)
   {
       a[k]=right[j];
       j++;
       k++;
   }


        }

    public static void main(String[] args) {
        MergeSort s=new MergeSort();
        s.a=new int[]{10,2,11,6,78,32};
        for(int i=0;i<6;i++)
            System.out.println(s.a[i]);
        s.mergesort(0,5);
        System.out.println("After sorting");
        for(int i=0;i<6;i++)
            System.out.println(s.a[i]);
    }
}
