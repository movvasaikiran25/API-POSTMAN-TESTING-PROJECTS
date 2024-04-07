// age 0-10 -child,age 10-60 -Adult , age 60> Senior citizen //
public class IfElseIfAge {

    public static void main (String[] Args){
         int age = 89;
         if (age>=2 && age<=10){
             System.out.println("User is child");
         }else if (age>=10 && age<=60){
             System.out.println("User is Adult");
         }else if (age>=60){
             System.out.println("User is Senior citizen");
        }

    }
}
