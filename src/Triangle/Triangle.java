package Triangle;

/**
 * Created by conghua on 16/3/18.
 */
public class Triangle {
    public  static String Shape(int a, int b,int c) {
        String shape = "";
        if ((a + b <= c) || (a + c <= b) || (b + c <= a) || (a <= 0) || (b <= 0) || (c <= 0)) {
            shape = "非三角形";
        }
        else if ((a == b) && (b == c)) {
                shape = "等边三角形";
        }
        else if (((a == b) && (b != c)) || ((b == c) && (a != b)) || ((a == c) && (c != a))) {
                    shape = "等腰三角形";
        }
        else {
                    shape = "任意三角形";
        }
        return shape;
    }
}