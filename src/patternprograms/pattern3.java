package patternprograms;

public class pattern3 {
    public static void main(String[] args) {
        pattern3(9);
    }
    static void pattern3(int n){

        int itt = 0;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
                if (i==j||(i+j)==n+1) {
                    System.out.print((int)(i-itt));
                }
                else System.out.print(" ");
            }
            if(i>n/2) itt+=2;
            System.out.println();
        }
    }

}
