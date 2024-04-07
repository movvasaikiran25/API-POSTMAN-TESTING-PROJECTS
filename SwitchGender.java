public class SwitchGender {


    public static void main (String[] Args) {
        char gender='M';

        switch (gender){

            case 'M':{
                System.out.println("You are a Male");
                System.out.println("I am a Hasini");
                break;
            }
            case 'F':{
                System.out.println("You are a female");
                break;
            }
            case 'T':{
                System.out.println("You are a gender queer");
                break;
            }
            default :{
                System.out.println("Wrong input provided");
                break;
            }
        }
    }
}
