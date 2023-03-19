package assignment3;

public class JumpStatements {
    public static void main(String[] args) {
        //break
        for(int i=0; i<20;i++ ){
            if(i==7) break;
            {
                System.out.println("Welcome to Java class"+i);
            }
        }

        System.out.println("=====================================================");
        for(int i=0; i<20;i++ ){
            {
                System.out.println("Welcome to Java class"+i);
            }
            if(i==7) break;
        }
        System.out.println("=====================================================");

        for (int i = 0; i <9; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Welcome to Java class"+i);
        }

    }
}
