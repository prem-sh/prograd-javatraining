package sidestudy;

public class StringExperiment {
    public static void main(String[] args) {
        String a = "string a";
        String b = new String("Hellow");

        System.out.print("compares address : ");
        System.out.println(a == b);

        System.out.print("compares value : ");
        System.out.println(a.equals(new String("string a")));

        System.out.print("compares value case insensitive: ");
        System.out.println(a.equalsIgnoreCase(new String("STRIng a")));

        System.out.println(a.charAt(4));

        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());

        System.out.println(b.replace('l','e'));
        System.out.println(new String("   hi   ").trim());

        System.out.println(b.contains("ll"));
        System.out.println(b.toCharArray());


        System.out.println("Is empty : "+"".isEmpty());
        System.out.println("Is empty : "+" ".isEmpty());
        System.out.println("Is blank : "+"hi".isBlank());
        System.out.println("Is blank : "+" ".isBlank());
        System.out.println("ends with : "+"Java world".endsWith("world"));
        System.out.println("starts with : "+"Java world".startsWith("Java"));

        System.out.println("Substring : "+"Meenu kutti".substring(6,10));
        System.out.println("String to int : "+Integer.parseInt("111"));
        System.out.println("String to double : "+Double.parseDouble("156.09902"));

        System.out.println("Int to String : "+String.valueOf(1));
        System.out.println("Double to String : "+String.valueOf(1.1111111111111111));
        System.out.println("Float to String : "+String.valueOf(1.11111111111f));

    }
}
