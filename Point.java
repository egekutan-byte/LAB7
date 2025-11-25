public class Point {
    private int x;
    private int y;
    public Point(int a,int b) {
        x = a;
        y = b;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distanceTo(Point b){
        double dx=Math.pow(x-b.x,2);
        double dy=Math.pow(y-b.y,2);
        return Math.sqrt(dx+dy);
    }
    public static void main(String[] args) {
        Point a=new Point(0,0);
        Point b=new Point(3,4);
        System.out.println(a.distanceTo(b));
        System.out.println(a.getX());
    }









}
