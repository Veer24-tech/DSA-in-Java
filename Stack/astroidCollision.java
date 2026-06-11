// //brute force approach 
// import java.util.*;

// public class astroidCollision {

//     public static int[] asteroidColl(int[] asteroids) {

//         ArrayList<Integer> list = new ArrayList<>();

//         for (int x : asteroids) {
//             list.add(x);
//         }                

//         int i = 0;

//         while (i < list.size() - 1) {

//             int a = list.get(i);
//             int b = list.get(i + 1);

//             if (a > 0 && b < 0) {

//                 if (a > -b) {
//                     list.remove(i + 1);

//                     if (i > 0) {
//                         i--;
//                     }

//                 } else if (a < -b) {
//                     list.remove(i);

//                     if (i > 0) {
//                         i--;
//                     }

//                 } else {
//                     list.remove(i + 1);
//                     list.remove(i);

//                     if (i > 0) {
//                         i--;
//                     }
//                 }

//             } else {
//                 i++;
//             }
//         }

//         int[] ans = new int[list.size()];

//         for (int j = 0; j < list.size(); j++) {
//             ans[j] = list.get(j);
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] asteroids = {3, 5, -6, 2, -1, 4};

//         int[] result = asteroidColl(asteroids);

//         System.out.println(Arrays.toString(result));
//     }
// }



import java.util.*;

public class astroidCollision {

    public static int[] asteroidsColl(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int a : asteroids) {

            while (!s.isEmpty() && s.peek() > 0 && a < 0
                    && s.peek() < -a) {
                s.pop();
            }

            if (!s.isEmpty() && s.peek() > 0 && a < 0) {

                if (s.peek() == -a) {
                    s.pop();
                }

                // current asteroid destroyed
            } else {
                s.push(a);
            }
        }

        int[] ans = new int[s.size()];

        for (int i = s.size() - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] asteroids = {3, 5, -6, 2, -1};

        int[] result = asteroidsColl(asteroids);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}