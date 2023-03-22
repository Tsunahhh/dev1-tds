package g60552.dev1.td12;

public class BoucleForImbriquee {

    public static void main(String[] args) {
        int n = 5;
        int m = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < m) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
