public class JavaPractises {

    public static void main(String[] args) {
        JavaPractises jd = new JavaPractises();
        System.out.println(jd.addNum(1,2));
        System.out.println(jd.subNum(5,2));
        System.out.println(jd.divideNum(5,2));
        System.out.println(jd.multNum(1,2));


    }
    public int addNum(int a,int b)
    {
        return a+b;
    }
    public int subNum(int a,int b)
    {
        return a-b;
    }
    public float divideNum(int a,int b)
    {
        return ((float)(a /b));
    }
    public int multNum(int a,int b)
    {
        return a*b;
    }
}



