public class Demo013 {
    public static void main(String[] args) {
        int base=4;
        int height=3;
        double area=areaoftriangle(base, height);
        System.out.println("AREA of the triangle: "+area);
        int s1=5,s2=4,s3=6;
        double areawhen3=gettrianglearea(s1, s2, s3);
        System.out.println("Area of the triangle when three sides are given :"+areawhen3);
    }
    static double areaoftriangle(int b,int h){
        return 0.5*b*h;
    }
    static double gettrianglearea(int s1,int s2,int s3){
        double s=(s1+s2+s3)/2;
        double ta=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return ta;
    }
}