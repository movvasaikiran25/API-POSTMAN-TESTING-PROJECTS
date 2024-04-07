public class IfElseIfGender {

    public static void main (String[] Args) {

        int age = 89;
        String Gender = "Male";

        if (age > 0 && age <= 15) {
            if (Gender == "Male") {
                System.out.println("User is a boy");
            } else if (Gender == "Female") {
                System.out.println("User is a girl");
            }
        } else if (age > 16 && age <= 50) {

            if (Gender == "Male") {
                System.out.println("User is a Man ");
            } else if (Gender == "Female") {
                System.out.println("User is a Woman");
            }

        } else {
            System.out.println("User is a Senior Citizen");
        }

    }

}
