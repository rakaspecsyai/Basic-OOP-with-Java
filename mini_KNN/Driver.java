package mini_KNN;

class Driver {
    public static void main(String[] args) {
        int num_of_points = 5;
        double[][] listXY = new double[num_of_points][2];

        for (int i = 0; i < listXY.length; i++) {
            listXY[i][0] = Math.random() * 10;
            listXY[i][1] = Math.random() * 10;
        }
    }
}
