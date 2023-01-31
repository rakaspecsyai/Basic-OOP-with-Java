package mini_KNN;

class Driver {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point[] points = new Point[2];
        points[0] = point1;
        points[1] = point2;

        KNN data = new KNN(points);

        System.out.println(data.points[0].getX());
        System.out.println(data.points[1].getX());
    }
}
