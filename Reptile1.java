public class Reptile1 {

    public static void main(String[] Args) {
        Reptile1 reptile = new Reptile1();
        String res = reptile.printReptile("Snake");
        reptile.printReptile(res);
    }

    public String printReptile(String reptile) {
        System.out.println(reptile);
        return reptile;

    }

}


