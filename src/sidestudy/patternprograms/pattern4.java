package sidestudy.patternprograms;

public class pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    private static void pattern4(int n){
        int[][] matrix = new int[n][n];
        int i,j,k;
        int direction = 1;

        for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++) System.out.print(matrix[j][j]+" ");
            System.out.println();
            for (i=0,j=0,k=0;i<=16;i++){
                matrix[j][k] = i;
                switch (direction){
                    case 1:
                        if(k+1<n){
                            if(matrix[j][k+1] == 0){
                                k++;
                                continue;
                            }else {
                                j++;
                                direction = 2;
                                continue;
                            }
                        }else {
                            j++;
                            direction=2;
                            continue;
                        }
                    case 2:
                    case 3:
                    case 4:
                }
            }
        }
    }
}
