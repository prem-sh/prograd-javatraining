package otheractivities;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TypeCasting {
    public static void main(String[] args) throws Exception {

        //String to other
        System.out.println("String to Integer : "+Integer.parseInt("1243"));
        System.out.println("String to Long : "+Long.parseLong("2382567235467"));
        System.out.println("String to Float : "+Float.parseFloat("1332545.45454"));
        System.out.println("String to Double : "+Double.parseDouble("1.453624546335645"));
        System.out.println("String to Boolean : "+Boolean.parseBoolean("hi"));
        System.out.println("String to Boolean : "+Boolean.parseBoolean("true"));

        //other to string
        System.out.println("Integer to String : "+String.valueOf(15));
        System.out.println("Long to String : "+String.valueOf(12345678935l));
        System.out.println("Float to String : "+String.valueOf(1.546f));
        System.out.println("Double to String : "+String.valueOf(12.3545425));
        System.out.println("Boolean to String : "+String.valueOf(true));

        //date
        System.out.println("String to date : 01/12/1999 ==> "+new SimpleDateFormat("dd/MM/yyyy mm:HH").parse("01/12/1999 10:17"));
        Date today = new Date();
        System.out.println("Date to String : Today ===> "+new SimpleDateFormat("dd/MM/yyyy mm:HH").format(today));
        System.out.println("Date to Timestamp : Timestamp ===> "+new Timestamp(today.getTime()));

        //Binary
        System.out.println("Binary string to Decimal : "+Integer.parseInt("1001",2));
        System.out.println("Binary number to Decimal custom : "+binToDec(1001));
        System.out.println("Decimal number to Binary custom : "+decToBin(9));
        System.out.println("Decimal number to Binary : "+Integer.toBinaryString(7));


        //Hex
        System.out.println("Hexa string to Decimal : "+Integer.parseInt("AA",16));
        System.out.println("Decimal : "+Integer.parseInt("AA",16));
        System.out.println("Hexa string to Decimal custom : "+hexToDec("AA"));
        System.out.println("Decimal to Hex custom : "+decToHex(170));

        //Octa
        System.out.println("Octa string to Decimal : "+Integer.parseInt("77", 8));
        System.out.println("Octa to Decimal custom : "+octToDec(77));
        System.out.println("Decimal to octal : "+Integer.toOctalString(170));
        System.out.println("Decimal to octal custom : "+decToOct(170));

    }
    private static int binToDec(int n){
        int res,temp, digit;
        res = 0; temp = 0; digit = 0;
        while(n>0){
            temp = n%10;
            res += temp*(int)Math.pow(2,digit);
            n/=10;
            ++digit;
        }
        return res;
    }
    private static long decToBin(int n){
        Byte[] bin = new Byte[64];
        int index = 0;

        while(n>0){
            bin[index++] = (byte)(n%2);
            n/=2;
        }
        long res = 0;
        for (Byte i : bin) {
            if (i == null) break;
            res*=10;
            res+=i;
        }
        return res;
    }
    private static long hexToDec(String n){
        String hexas = "0123456789ABCDEF";
        long ret = 0;
        n = n.toUpperCase();
        for(char i : n.toCharArray()){
            ret*=16;
            ret+=hexas.indexOf(i);
        }
        return ret;
    }
    private static String decToHex(long n){
        char[] hexes = "0123456789ABCDEF".toCharArray();
        String result = "";
        while (n>0){
            int rem = (int)(n%16);
            result+=String.valueOf(hexes[rem]);
            n/=16;
        }
        return result;
    }
    private static long octToDec(int n){
        long result = 0;
        int digit = 0;
        while(n>0){
            int temp = n%10;
            result += (long)(temp*Math.pow(8,digit++));
            n/=10;
        }
        return result;
    }
    private static int decToOct (int n){
        int result = 0;
        while(n>0){
            int rem = n%8;
            result*=10;
            result+=rem;
            n/=8;
        }
        return result;
    }
}
