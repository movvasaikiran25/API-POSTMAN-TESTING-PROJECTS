public class SwitchFeedBack {


    public static void main(String[] Args){
        int FeedBack=5;

        switch (FeedBack)
        {
            case 1: {
                System.out.println("Did you attend the class ?");
                break;
            }
             case 2: {
                 System.out.println("Not good");
                 break;
             }
             case 3: {
                 System.out.println("Need Improvement");
                 break;
             }
            case 4: {
                System.out.println("OK");
                break;
            }
            case 5: {
                System.out.println("good");
                break;
            }
            case 6: {
                System.out.println("doing good");
                break;
            }
            default :{
                System.out.println("Input not provided");
                break;
            }


        }




    }
}
