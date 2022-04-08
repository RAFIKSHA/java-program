import java.lang.*;

public class string_java {
    public static void main(String[] args) {
        String name=new String("Ravi");
        //length()
        System.out.println(name.length());
        //charAt()
        System.out.println(name.charAt(2));
        //substring()
        System.out.println(name.substring(1));
        //contains()
        System.out.println(name.contains("vi"));
        //equals()
        System.out.println(name.equals("ravi"));
        //equalIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Ravi"));
        //concat
        System.out.println(name.concat("hello"));
        //indexOf()
        System.out.println(name.indexOf("i"));
        //replace
        System.out.println(name.replace(name, "rohit"));
       //split
        System.out.println(name.split("regex"));
        //toLower
        System.out.println(name.toLowerCase());
        //toUperCase
        System.out.println(name.toUpperCase());
        //trim
        System.out.println(name.trim());

        //Math class method
        double x=5;
        double y=4;

        System.out.println("abs: "+Math.abs(x));
        
        System.out.println("max: "+Math.max(x,y));

        System.out.println("min: "+Math.min(x,y));

        System.out.println("round: "+Math.round(x));

        System.out.println("sqrt is: "+Math.sqrt(x));

        System.out.println("cbrt: "+Math.cbrt(x));

        System.out.println("pow: "+Math.pow(x, y));

        System.out.println("signum: "+Math.signum(x));

        System.out.println("copySign: "+Math.copySign(x, y));

        System.out.println("log: "+Math.log(x));

        System.out.println("log10: "+Math.log10(y));

        System.out.println("exp: "+Math.exp(x));

        System.out.println("sin: "+Math.sin(x));

        System.out.println("cos: "+Math.cos(x));

        System.out.println("floor: "+Math.floor(x));

        System.out.println("nextUp: "+Math.nextUp(x));

        System.out.println("nextAfter: "+Math.nextAfter(x, y));

        System.out.println("nextdown: "+Math.nextDown(x));




    }
}
