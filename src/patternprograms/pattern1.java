package patternprograms;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println("\n\nPattern 1\n");
        pattern1(5);
    }
    static void pattern1(int n){
//        5432*
//        543*1
//        54*21
//        5*321
//        *4321
        for (int i=1; i<=n; i++){
            for (int j=n;j>=1;j--){
                if (i==j) System.out.print('*');
                else System.out.print(j);
            }
            System.out.println();
        }
    }

}
