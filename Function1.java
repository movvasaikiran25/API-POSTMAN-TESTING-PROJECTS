public class Function1 {

    public static void main (String[] Args){
        Function1 f1 = new Function1();
        String res= f1.printName("Ashish");
        System.out.println(res);

        f1.getName();
        f1.printName();
    }
    public String printName(String name) {
        System.out.println(name);
        return "Ashish";
    }

    public String getName (){
        return "Akhil jAIN";
    }

    public void printName (){
        System.out.println("Ashish");
    }
}
