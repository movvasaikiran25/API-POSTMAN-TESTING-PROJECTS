public class WhileLoop {


    public static void main(String[] Args) {

        char i;
        i = 'a';
        while (i <= 'z') {
            System.out.println("i:  "+i+" and a-z is printed");
            i++;
        }
        float f;
        f = 2.2f;
        while (f <= 8.8f){
            System.out.println("f:  "+f+" and float number are printed ");
            f=f+10;
        }
        long a;
        a = 1000L;
        while (a<=9000L){
            System.out.println("a: "+a+"and long number are printed");
            a=a+8;
        }
        boolean one=false;
        int g;
        g=2;
        while (g<=10 && one==false){
            System.out.println("g:"+g+"and given criteria is false");
            g=g+2;
        }
    }

}
