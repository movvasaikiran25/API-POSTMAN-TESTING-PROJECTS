public class CallMethod {

    public static void main (String [] Args){
        CallMethod cm = new CallMethod();
        cm.printName("Akhil");
        cm.printNameInfo("Ashish");

    }
    public void printName (String name) {
        System.out.println(name);
    }
    public String printNameInfo(String nameInfo){
        System.out.println(nameInfo);
        return "Ashish";

    }


}



