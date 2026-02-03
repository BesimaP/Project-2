import java.sql.SQLOutput;

void main () {
    /*Opgave 5.1: Dit første for loop
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    } */

    /*Opgave 5.2: Count 1 to 10
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }*/

    /*Opgave 5.3: Custom range
    for (int i = 5; i <= 15; i++) {
        System.out.println(i);
    } */

    /*Opgave 5.4: Count down
    for (int i = 10; i > 0; i--) {
        System.out.println(i);
    }*/

    /*Opgave 5.5: Even number
    for (int i = 0; i <= 20; i += 2) {
        System.out.println(i);
    } */

    /*Opgave 5.6: Multiples of 5
    for (int i = 0; i <= 100; i += 5) {
        System.out.println(i);
    }*/

    /*Opgave 5.7: Odd numbers backward
    for (int i = 19; i > 0; i--) {
        System.out.println(i);
    } */

    /*Opgave 5.8: Powers of 2
    int power = 1;
    for (int i = 0; i <= 9; i++) {
        power *= 2;
        System.out.println("2^" + i + " = " + power);
    } */

    /*Opgave 5.9: Sum 1 to 100
    int sum = 0;
    for (int i = 1; i<= 100; i++){
        sum += i;
    }
    System.out.println(sum);
    */

    System.out.println(" ");

    /*Opgave 5.10: Factorial
    int factorial = 1;
    for (int i = 1; i <= 10; i++) {
        factorial *= i;
    }
    System.out.println("10! = " + factorial);
    */

    /*Opgave 5.11: Sum even numbers
    int sum = 0;
    for (int i = 0; i <= 50; i+=2){
        sum += i;
    }
    System.out.println("Sum of even numbers: " + sum);
    */

    /*Opgave 5.12: Count multiples
    int count = 0;
    for (int i = 1; i <= 100; i++){
        if (i % 7 == 0) {
            count++;
        }
    }
    System.out.println("Multiples of 7: "+ count);
     */

    /*Opgave 5.13: Average
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= 20; i++) {
        sum += i;
        count++;
    }
    double average = (double) sum / count;
    System.out.println("Average: " + average);
    */

    /*Opgave 5.14: Multiplication
    int n = 5;
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }*/

    /*Opgave 5.15: Simple nested loop
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            System.out.println("(" + i + "," + j + ") ");
        }
    }*/

    /*Opgave 5.16: Number rectangle
    for (int row = 1; row <= 5; row++){
        for ( int col = 1; col <= 5; col++){
            System.out.println(col + " ");
        }
        System.out.println();
    }*/

    /*Opgave 5.17: Star rectangle
    for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    /*Opgave 5.18: Right triangle
    for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
    }*/

    /*Opgave 5.19: Number triangle
    for (int row = 1; row <= 5; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    /*Opgave 5.20: Inverted triangle
    for (int row = 5; row >= 1; row--) {
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
    } */

    /*Opgave 5.21: When to use for
    for (int i = 0; i <= 10; i++) {
        System.out.println(i);
    }

    int i = 1;

    while (i <= 10) {
        System.out.println(i);
        i++;
    }
    */

    /*Opgave 5.22: Concert while to for
    for (int i = 0; i <20; i +=2){
        System.out.println(i);
    }
     */

    //Opgave 5.24: Sum comparison for loop
    int sum1 = 0;
    for (int i = 1; i <= 50; i++){
        sum1 += i;
    }
    System.out.println(sum1);


    //Opgave 5.24: Sum comparison while loop
    int sum2 = 0;
    int i = 1;
    while (i <= 50){
        sum2 += i;
        i++;
    }
    System.out.println(sum2);

}