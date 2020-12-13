package interfaceextends.robot;

import java.util.List;

public class C3PO implements MovableRobot {

    private Point position;
    private int angle;
    private List<Point> path;

    private void walkTo(Point position) {
        this.position = new Point(position.getX(), position.getY(), 0);
        path.add(position);
    }

    public C3PO(Point position) {
        this.position = new Point(position.getX(), position.getY(), 0);
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public void moveTo(Point position) {
        walkTo(position);
    }

    public void fastMoveTo(Point position) {
        walkTo(position);
    }

    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
