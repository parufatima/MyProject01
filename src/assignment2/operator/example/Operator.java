package assignment2.operator.example;

public class Operator {
    public static void main(String[] args) {
        //Unary Operator: expr++ expr-- ++expr --expr
        int salary = 5000;

        System.out.println("++expr ........: " + ++salary);   //5000+1= 5001
        System.out.println("expr++ ........: " + salary++);    // print 5001 ,then 5001+1= 5002
        System.out.println("expr ........: " + salary);     //   5002


        System.out.println("expr-- ........: " + salary--);  // print 5002 , then 5002-1= 5001
        System.out.println("--expr ........: " + --salary); // 5001-1 = 5000
        System.out.println("expr ........: " + salary);      // 5000

        salary++;
           System.out.println("expr-- ........: " + salary--);  // print 5001 , then 5001-1= 5000
           System.out.println("--expr ........: " + --salary); // 5000-1 = 9999
           System.out.println("expr ........: " + salary);      // 9999                                  Arithmetic Operator: * / % + -


        //    Arithmetic Operator: * / % + -
        int number1 = 100;
        int number2 = 60;

        System.out.println("Addition of two number : "+( number1+ number2));
        System.out.println("Subtraction of two number : "+ (number1- number2));
        System.out.println("Multiplication of two number : "+ number1* number2);
        System.out.println("Division of two number : "+ number1/ number2);
        System.out.println("Modulus of two number : "+ number1% number2);

        // Assignment Operator: = += -= *= /= %=
        number1 += 50;
        System.out.println("Number1= Number1+50 : " + number1);
        number2 -=20;
        System.out.println("Number2= Number2-20 : " + number2);
        number1 *=8;

        System.out.println("Number1= Number1*8 : " + number1);
         number2 /=4;
        System.out.println("Number2= Number2/4 : " + number2);

        number2 %= 3;
         System.out.println("Number2= Number2%3 : " + number2);

        //       Ternary Operator and : ? : (int min=(a<b)?a:b; )

        int number3 = 560;
        int number4 = 490;


       int maxNumber  = (number3> number4) ? number3 : number4 ;
        System.out.println("Maximum number :" + maxNumber );

        int minNumber =   (number3<number4) ? number3 : number4 ;
         System.out.println("Minimum number :" + minNumber );


         //  Relational Operator: < > <= >= instanceof == !=

        System.out.println("number3> number4  :" + (number3> number4));       //T
        System.out.println("number3< number4  :" + (number3< number4));       // F
        System.out.println("number3>= number4  :" + (number3>= number4));     // T
        System.out.println("number3<= number4  :" + (number3<= number4));     //F
        System.out.println("number3== number4  :" + (number3== number4));     //F
        System.out.println("number3!= number4  :" + (number3!= number4));     //T

        //Logical Operator: && ||

        System.out.println((number3> number4) && (number3>= number4));    // if both condition are true return true
         System.out.println((number3> number4) && (number3< number4));    // F
          System.out.println((number3> number4) || (number3<= number4));  //if any condition is true return true
           System.out.println((number3< number4)||(number3== number4));    //F
    }

}
