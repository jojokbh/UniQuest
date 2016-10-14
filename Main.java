
//just trying github

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        double a[][] = new double[m][m];
        //asdasd

        //adding numbers into a array
        for(int a_i=0; a_i < m; a_i++){
            for(int a_j=0; a_j < m; a_j++){
                a[a_i][a_j] = in.nextDouble();
            }
        }

        if(m == m) {

            double sum1 = 0;

            // walking through diagonals
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j) {
                        sum1 += a[i][j];
                    }
                }
                //sum2 += a[i][a.length - i - 1];
            }

            System.out.printf("%.2f", sum1);
        }
    }


}

