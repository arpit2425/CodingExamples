package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class MinCab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt( br.readLine());
        double start[]=new double[N];
        double end[]=new double[N];
        int i,count=0;
        HashMap<Double,Double> record=new HashMap<>();
        String s;
        for(i=1;i<=N;i++)
        {
            s=br.readLine();
            String s1[]=s.split(" ");
            start[i-1]=Double.parseDouble(s1[0]+"."+s1[1]);
            end[i-1]=Double.parseDouble(s1[2]+"."+s1[3]);

        }
        for(i=0;i<N;i++)
        {
            record.put(start[i],end[i]);
        }
        Arrays.sort(start);
        for(i=0;i<N-1;i++)
        {
//            if(record.get(start[i])>start[i+1])
                
        }
    }
}
