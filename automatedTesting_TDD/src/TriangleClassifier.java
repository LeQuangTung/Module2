public class TriangleClassifier {
    public static boolean check(int canhA, int canhB, int canhC) {
        if((canhA + canhB > canhC) &&  (canhA + canhC > canhB) && (canhC + canhB > canhA)){
            return  true;
        }
        return false;
    }
    public static boolean checkEquilateralTriangle(int canhA, int canhB, int canhC) {
        if (canhA == canhB && canhB == canhC) {
            return true;
        }
        return false;
    }
    public static boolean checkIsoscelesTriangle(int canhA, int canhB, int canhC) {
        if (canhA == canhB || canhB == canhC || canhC == canhA ) {
            return true;
        }
        return false;
    }
}


