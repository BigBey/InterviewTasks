import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList result = new ArrayList();
        if(A.size() == 1 && A.get(0).size() == 1){
            result.add(A.get(0).get(0));
        }else {
            int dir, T, B, L, R;
            dir = 0;
            T = 0;
            B = A.size()-1;
            L = 0;
            R = A.get(0).size()-1;
            while (T <= B && L <= R) {
                if (dir == 0) {
                    for (int i = L; i <= R; i++) {
                        result.add(A.get(T).get(i));
                    }
                    T++;
                    dir = 1;
                } else if (dir == 1) {
                    for (int i = T; i <= B; i++) {
                        result.add(A.get(i).get(R));
                    }
                    R--;
                    dir = 2;
                } else if (dir == 2) {
                    for (int i = R; i >= L; i--) {
                        result.add(A.get(B).get(i));
                    }
                    B--;
                    dir = 3;
                } else if (dir == 3) {
                    for (int i = B; i >= T; i--) {
                        result.add(A.get(i).get(L));
                    }
                    L++;
                    dir = 0;
                }
            }
        }
        return result;
    }
}
