package Sample;

import java.util.Arrays;

public class Reference {
    public static void ref(int a[])
    {

      for(int i:a)
          System.out.println(i);
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        ref(Arrays.copyOfRange(a1,2,4));
    }
}
