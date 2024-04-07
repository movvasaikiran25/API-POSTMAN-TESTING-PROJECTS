public class ForLoop {


    public static void main (String[] Args){

        for(char i='a';i<='z';i++ ){
            System.out.println("i:  "+i+" and alphabets from a-z printed");
        }
        for(float f=1.1f;f<=9.9f;f=f+2){
            System.out.println("f:  "+f+" and float numbers given are printed");
        }
        for(long a=100000L;a<=900000L;a=a+10){
            System.out.println("a:   "+a+" and long numbers given are printed");
        }
        Boolean isValid=true;

        for(int i=2;(i<=100 && isValid==true); i=i+10){
            System.out.println(i);
        }

    }
}
