package mini_KNN;

public class KNN {
    private Point[] points;

    public KNN(double[][] listXY) {
        points = new Point[listXY.length];
        for (int i = 0; i < listXY.length; i++) {
            points[i] = new Point(listXY[i][0], listXY[i][1]);
        }
    }

    public void ShowPoints() {
        for (Point p : points) {
            System.out.println(p);
        }
    }

    public boolean isEmpty() {
        return points.length == 0;
    }

    private double euclidean_distance(Point point, double x, double y) {
        double dx = point.getX() - x;
        double dy = point.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double[] getDistance(double x, double y, boolean isSorted) {
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            distances[i] = euclidean_distance(points[i], x, y);
        }
        if (!isSorted) {
            distances = SortDistance(distances);
        }
        return distances;
    }

    private double[] SortDistance(double[] distance) {
        int n = distance.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (distance[j] < distance[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = distance[i];
                distance[i] = distance[minIndex];
                distance[minIndex] = temp;
            }
        }
        return distance;
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x = " + x + ", y = " + y + '}';
    }
}
