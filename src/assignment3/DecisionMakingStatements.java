package assignment3;

public class DecisionMakingStatements {
    public static void main(String[] args) {

        // Simple if statement
        int  temperature =35;

        if(temperature>30){
            System.out.println("Today is very hot day");
        }
        // if-else statement

      if(temperature<30){
          System.out.println("Nice weather");
      }else{
          System.out.println("Today is very hot day, drink enough water");
      }
      // if-else-if ladder

        if(temperature>=35 && temperature<40){
            System.out.println("Very hot day");
        } else if (temperature>=30 && temperature<35) {
             System.out.println("Hot day");

        } else if (temperature>=25 && temperature<30) {
            System.out.println("Nice weather");
        } else if (temperature>=15 && temperature<20) {
            System.out.println("Hum! winter nock! nock! ");
        }else if(temperature>=5 && temperature<15) {
            System.out.println("Cold day");
        }else {
            System.out.println("Very cold");
        }
        //Nested if-statement

        if (temperature>30){
            if (temperature>30 && temperature<35){
                System.out.println("Hot day");
            }else {
                System.out.println("Nice weather");
            }
        }else {
            System.out.println(temperature);
        }


    }
}

