package sidestudy.patternprograms;

public class pattern2 {
    public static void main(String[] args) {
        pattern2(10);
    }
    static void pattern2(int n){
        for(int i =1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(j<=i)
                    System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
