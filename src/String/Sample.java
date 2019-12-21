package String;

public class Sample {
    public static void main(String[] args) {
        String a="Apple",b="Apple";
        String c=new String("Apple");
        StringBuffer d=new StringBuffer("Apple");
        System.out.println(c.equals(d));
    }

    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
        String s=(String)obj;
        return true;
    }
}
