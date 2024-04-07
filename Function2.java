public class Function2 {


    public static void main(String[] Args){
        Function2 f2 = new Function2();
        String res = f2.printInfo(23,"Akhil");
        System.out.println(res);
    }

     public String printInfo( int age, String name){
        System.out.println(name);
        String result= age+name;
        return result;
     }

}
