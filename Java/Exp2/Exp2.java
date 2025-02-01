public class Exp2 {
     
     public static void main(String[] args)
     {
        //class
        int a=12;
        if(a>10){
            System.out.println("Condition is True");
            System.out.println("a is greater than 10");
        }
        else
        {
            System.out.println("a is less than 10");
            System.out.println("Outside of if else");
        }

        while(a>10)
        {
            System.out.println(a);
        }
 
        // 1.
        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //2.
        int number=123;
        int sum=0;
        while(number>0){
             int digit =number%10;
             sum = sum +digit;
             number/=10;
        }
        System.out.println("Sum :" + sum );

        //3.
        int num1=10;
        int num2=20;
        if(num1>num2){
            System.out.println(num1+"is greater than"+num2);
        }
        else if (num1<num2){
            System.out.println(num1+"is smaller than"+ num2);
        }
        else{
            System.out.println("both numbers are equal");
        }

        //4.
        int year=2024;
        if((year%4==0 && 100 !=0 || (year%400==0))){
            System.out.println(year+"is a leap year");
        }
        else{
            System.out.println(year+"is not a leap year");
        }

        //5.
        int num=121;
        int original= num;
        int reverse=0;

        while(num!=0){
            int digit = num%10;
            reverse = reverse *10 +digit;
            num /=10;
        }
        if(original==reverse){
            System.out.println(original + "is a palindrome");
        }
        else{
            System.out.println(original + "is not a palindrome");
        }

        //6.
        int limit = 50;

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        //7.
        for (int i=5; i>=1; i--){
            for (int j=1; j<=5-i; j++){
                 System.out.println(" ");
            }
            for (int k=1; k<=(2*i-1);k++){
                 System.out.println("*");
            }
            System.out.println();
        }

        //8. 
        char color = 'R'; 
        switch (color) {
            case 'R':
                System.out.println("The color is Red.");
                break;
            case 'G':
                System.out.println("The color is Green.");
                break;
            case 'B':
                System.out.println("The color is Blue.");
                break;
            default:
                System.out.println("Color not recognized.");
        }

        //9.
        int N = 5;
        int sumOdd = 0, sumEven = 0;

        for (int i = 1; i <= N; i++) {
            sumOdd += 2 * i - 1;
            sumEven += 2 * i;
        }

        System.out.println("Average of odd numbes :" + sumOdd);
        System.out.println("Average of even numbers: " + sumEven) ;
    
     }
}