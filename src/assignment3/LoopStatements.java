package assignment3;

public class LoopStatements {
    public static void main(String[] args) {
        //for loop
        //Increment
        for(int i=0; i<=6; i++){
            System.out.println("Life is beautiful"+i);
        }
        //Decrement

        for(int i=9; i>0;i--){
            System.out.println("Programming is fun" +i);
        }
        //while loop: while(condition)
        int i=5;
        while(i<6){
            System.out.println("Bangladesh is beautiful");
            i++;
        }

        //do-while loop: do{} while (condition)
        int j=8;
        do{
            System.out.println("Life is beautiful ");
            j++;
        }while (j<6);

//The main difference between while & do-while loop is -->in while loop 1st check the condition &if it is true then execute the block
        //but in do-while loop ist execute the block then check the condition.
        //while -> if condition is not true we don't get any output
        //do-while ->if condition is not true we get at least one output.
        System.out.println("============================================================");
        //Java for-each loop: for(data_type var : array_name/collection_name)
        String [] cars = {"Toyota","BMW","Audi","Volvo"};
        for (String carName: cars)
              {
                  System.out.println(carName);
              }
        System.out.println("================================================");
        int[] age ={23,34,43,44,22,26};
        for (int studentAge : age)
        {
            System.out.println(studentAge);
        }
        System.out.println("=================================================");
        Double []price={23.5,59.99,99.99,295.99};
        for (Double newPrice: price)
        {
            System.out.println(newPrice);
        }

    }
}
