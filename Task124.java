public class Task124 {
    public static void main(String[] args) {
        Point p = new Point(32, 64);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}

