void main(){
    /*Opgave 4.1: Dit første while loop
    int i = 0;

    while (i < 5) {
        System.out.println(i);
        i++;
    }*/

    /*Opgave 4.2: Count to 10
    int i = 1;

    while (i <= 10) {
        System.out.println(i);
        i++;
    }*/

    /*Opgave 4.3: Count by 2
    int i = 0;

    while (i <= 20) {
        System.out.println(i);
        i += 2;
    } */

    /*Opgave 4.4: Count iterations
    int i = 0;
    while (i < 10){
        i++;
    }
    System.out.println("Loop ran " + i + " times");
    */

    /*Opgave 4.5: Count even numbers
    int count = 0;
    int i = 1;

    while (i <= 20) {
        if (i % 2 == 0) {
            count++;
        }
        i++;
    }
    System.out.println("Even numbers: " + count);
     */

    /*Opgave 4.6: count multiples of 3
    int count = 0;
    int i = 1;

    while (i <= 30){
        if ( i % 3 == 0 ){
            count ++;
        }
        i++;
    }*/

    /*Opgave 4.7: Count digits
    int count = 0;
    int number = 12345;

    while (number > 0 ) {
        count++;
        number = number / 10;
    }
    System.out.println("Digits: " + count);
    */

    /*Opgave 4.8: Count down
    int i = 10;
    int count = 0;

    while ( i > 0 ){
        System.out.println(i);
        count++;
        i--;
    }
    System.out.println("Printed " + count + " numbers");
    */

    /*Opgave 4.9: Sum 1 to 10
    int sum = 0;
    int i = 1;

    while (i <= 10){
        sum += i;
        i++;
    }
    System.out.println("Accumuleret værdi " + sum);
    */

    /*Opgave 4.10: Sum even numbers
    int i = 1;
    int sum = 0;

    while (i <= 20){
        if (i % 2 == 0){
            sum+= i;
        }
        i++;
    }
    System.out.println("Accumuleret værdi: " + sum);
    */

    /*opgave 4.11: Procut/factorial
    int product = 1;
    int i = 5;

    while(i > 0){
        product *= i;
        i--;
    }
    System.out.println("5! = " + product);
    */

    /*Opgave 4.12: Sum and count
    int count = 0;
    int sum = 0 ;
    int i = 1;

    while (i <= 100){
        if (i % 7 == 0) {
            sum += i;
            count ++;
        }
        i ++;
    }
    System.out.println("Count: " + count);
    System.out.println("Sum: " + sum);
    */

    /*Opgave 4.13: Average
    int sum = 0;
    int count = 0;
    int i = 10;

    while(i <= 50) {
        sum+= i;
        count++;
        i += 10;
    }
    double average = (double) sum /count;
    System.out.println("Sum: " + sum);
    System.out.println("Count: " + count);
    System.out.println("Average " + average);
    */

    /*Opgave 4.14:
    int number = 10;

    while (number != -1){
        System.out.println(number);
        number--;
        if (number == 5) {
            number = -1;
        }
    } */

    /*Opgave 4.15:
    int number1 = 100;
    int steps = 0;

    while (number1 >= 0){
        number1 -=7;
        steps++;
    }
    System.out.println("Antal step: " + steps);
     */

    /*Opgave 4.16:
    int target = 64;
    int number = 1;
    boolean found = false;

    while (!found){
        if (number * number == target){
            found = true;
        } else {
            number++;
        }
    }
    System.out.println("Square root of: " +  target + " is " + number);
    */

    /*Opgave 4.17: Halve until small
    int number = 1000;
    int steps = 0;

    while (number >= 10){
        System.out.println(number);
        number = number / 2;
        steps++;
        }
    System.out.println("Final: " + number);
    System.out.println("Antal steps: " + steps);

    //Opgave 4.18: Power of 2
    int power = 1;
    int exponent = 0;

    while (power <= 1000){
        power *= 2;
        exponent++;
    }
    System.out.println("2^" + exponent + "=" + power);
    */

    /*Opgave 4.19: Countdown from 20
    int i = 20;

    while (i > 0){
        if (i % 3 != 0){
            System.out.println(i);
        }
        i--;
    } */

    /*Opgave 4.20: Stop on condition
    int sum = 0;
    int i = 1;
    int count = 0;

    while (sum <= 100){
        sum += i;
        count++;
        i++;
    }
    System.out.println("Sum: " + sum);
    System.out.println("Added: " + count + " numbers");
    */

    //Opgave 4.21: Double until large
    int number = 1;
    int doublings = 0;

    while (number <= 1000){
        number *= 2;
        doublings++;
    }
    System.out.println("Number: " + number);
    System.out.println("Doublings: " + doublings);

    //Opgave 4.22: Multiple conditions
    int i = 0;

    while (i <= 50 && i*i <= 100){
        i++;
    }
    System.out.println("Stopped at i = " + i);
    System.out.println("i squared = " + (i*i));

    //Opgave 4.23: Fibronaccii until limit
    int a = 0;
    int b = 1;
    int count = 0;

    while (b <= 100){
        System.out.println(b);
        int next = a + b;
        a = b;
        b = next;
        count++;
    }
    System.out.println("Generated " + count + " numbers");
}
