package mini_KNN;

public class Driver {
    public static void main(String[] args) {
        double[][] listXY = {{1, 2}, {3, 4}, {7, 8}, {5, 6} };
        KNN knn = new KNN(listXY);
        knn.ShowPoints();
        System.out.println(knn.isEmpty());
        double[] distances = knn.getDistance(0, 0, true);
        for (double d : distances) {
            System.out.println(d);
        }
    }
}
