interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Circle implements Movable {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public void display() {
        System.out.println("Circle center: (" + center.x + ", " + center.y + "), radius: " + radius);
    }
}

public class MovableTest {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        p.display();

        p.moveUp();
        p.moveRight();
        p.display();

        Circle c = new Circle(new Point(5, 5), 10);
        c.display();

        c.moveLeft();
        c.moveDown();
        c.display();
    }
}
