package Day4;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;

    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void moveUp(){ y+=ySpeed; }
    public void moveDown(){ y-=ySpeed; }
    public void moveLeft(){ x-=xSpeed; }
    public void moveRight(){ x+=xSpeed; }

    public String toString(){
        return "Point ("+x+","+y+")";
    }
}

class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    MovableCircle(int x,int y,int xs,int ys,int r){
        center=new MovablePoint(x,y,xs,ys);
        radius=r;
    }

    public void moveUp(){ center.moveUp(); }
    public void moveDown(){ center.moveDown(); }
    public void moveLeft(){ center.moveLeft(); }
    public void moveRight(){ center.moveRight(); }

    public String toString(){
        return "Circle Center: "+center+" Radius: "+radius;
    }
}

class MovableRectangle implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(MovablePoint t,MovablePoint b){
        topLeft=t;
        bottomRight=b;
    }

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString(){
        return "Rectangle "+topLeft+" "+bottomRight;
    }
}


interface Polygon {

    double getArea();

    default double getPerimeter(int... sides){
        int sum=0;
        for(int s:sides)
            sum+=s;
        return sum;
    }

    static String shapeInfo(){
        return "Polygon Interface Example";
    }
}

class Rectangle implements Polygon{

    int l,w;

    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }

    public double getArea(){
        return l*w;
    }
}

class Triangle implements Polygon{

    int b,h;

    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }

    public double getArea(){
        return 0.5*b*h;
    }
}


public class Assignment_4 {

    public static void main(String[] args) {

        System.out.println("---- Movable Shapes ----");

        MovablePoint p=new MovablePoint(1,2,2,3);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c=new MovableCircle(0,0,1,1,5);
        c.moveUp();
        c.moveRight();
        System.out.println(c);

        MovableRectangle r=new MovableRectangle(
                new MovablePoint(0,0,1,1),
                new MovablePoint(4,4,1,1));

        r.moveUp();
        r.moveRight();
        System.out.println(r);


        System.out.println("\n---- Polygon ----");

        Rectangle rect=new Rectangle(10,5);
        System.out.println("Area Rectangle: "+rect.getArea());
        System.out.println("Perimeter: "+rect.getPerimeter(10,5,10,5));

        Triangle t=new Triangle(6,4);
        System.out.println("Area Triangle: "+t.getArea());
        System.out.println("Perimeter: "+t.getPerimeter(3,4,5));

        System.out.println(Polygon.shapeInfo());

    }
}

// Output :
/*---- Movable Shapes ----
Point (3,5)
Circle Center: Point (1,1) Radius: 5
Rectangle Point (1,1) Point (5,5)

---- Polygon ----
Area Rectangle: 50.0
Perimeter: 30.0
Area Triangle: 12.0
Perimeter: 12.0
Polygon Interface Example*/


