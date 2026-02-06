void main (){
    //Opgave 7.1: Dit første for-each loop
   int [] numbers = {10, 20, 30, 40, 50};
    for (int number : numbers){
        System.out.println(number);
    }

    //Opgave 7.2: Print on one line
    int [] numbers1 = {1, 2, 3, 4, 5};

    for (int number1 : numbers1){
        System.out.print(number1 + " ");
    }

    System.out.println ("========");

    //Opgave 7.3: Double each value (display only)
    int [] numbers2 = {5, 10, 15, 20};

    for (int number2 : numbers2){
        System.out.println(number2 * 2);
    }

    //Opgave 7.4: Print with labels
    int [] numbers4 = {100, 200, 300};
    int value = 0;

    for(int number4 : numbers4){
        value += number4;
        System.out.println("Value: " + value);
    }

    //Opgave 7.5
    int [] numbers3 = {2, 3, 4, 5};

    for(int number3 : numbers3){
        int square = number3 * number3;
        System.out.println(number3 + " squared = " + square);
    }

    //Opgave 7.6
    String [] names = {"Anna", "Bob", "Carl", "Diana"};

    for(String name : names){
        System.out.println(name);
    }

    //Opgave 7.7
    String [] names1 = {"Alice", "Bob", "Charlie"};

    for(String name1 : names1){
        System.out.println("Hello, " + name1);
    }

    //Opgave 7.8
    String [] words = {"Cat", "Elephant", "Dog", "Butterfly"};

    for (String word : words) {
        System.out.println(word + " has " + word.length() + " letters");
    }

    //Opgave 7.9:
    String [] words2 = {"hello", "world", "java"};

    for (String word2 : words2){
        System.out.println(word2.toUpperCase());
    }

    //Opgave 7.10
    String [] names3 = {"Anna", "Bob", "Carl"};

    for(String name3 : names3){
        System.out.println(name3.charAt(0));
    }
    //Opgave 7.11
    int [] numbers5 = {5, 10, 15, 20, 25};
    int sum = 0;

    for(int number5 : numbers5){
        sum += number5;
    }
    System.out.println("Sum: " + sum);

    //Opgave 7.12
    int [] numbers6 = {10, 20, 30, 40, 50};
    int sum3 = 0;
    int count = 0;

    for(int number6 : numbers){
        sum3 += number6;
        count++;
    }

    double average = (double) sum3 / count;
    System.out.println("Average: " + average);

    //Opgave 7.13
    int [] numbers7 = {-5, 10, -3, 8, 0, 15, -2};
    int count1 = 0;

    for(int number7 : numbers7){
         if(number7 > 0) {
             count1++;
         }
    }
    System.out.println("Positive numbers: " + count1);
    //Opgave 7.14
    int [] numbers8 = {23, 45, 12, 67, 34, 89, 21};
    int max = numbers[0];

    for(int number8 : numbers8){
        if (number8 > max){
            max = number8;
        }
    }
    System.out.println("Maximum: " + max);

    //Opgave 7.15
    int [] numbers9 = {2, 3, 4, 5};
    int product = 1;

    for(int number9 : numbers9){
        product *= number9;
    }
    System.out.println("Product: " + product);

    //Opgave 7.16
    int [] numbers10 = {1, 2, 3, 4, 5};

    for(int number10 : numbers10){
        System.out.println(number10);
    }

    for (int i = 0; i < numbers10.length; i++) {
        System.out.println(numbers10[i]);
    }

    //Opgave 7.17
    int [] numbers11 = {10, 20, 30, 40};
    int sum1 = 0;
    int sum2 = 0;

    for (int number11 : numbers11){
        sum1 += number11;
    }
    System.out.println(sum1);

    for(int i = 0; i < numbers11.length; i++){
        sum2 += numbers11[i];
    }
    System.out.println(sum2);
    
    //Opgave 7.18
    int [] numbers12 = {100, 200, 300};
    for(int i = 0; i < numbers12.length; i++){
        System.out.println("Index " + i + ": " + numbers12[i]);
    }
    //No index needed! Loop automatically goes through each element.
    // Cannot do this with for-each - no access to index

    //Opgave 7.19
    int [] numbers13 = {5, 10, 15};

    // For-each is READ-ONLY
    // To modify, must use traditional for:
    for (int i = 0; i < numbers13.length; i++) {
        numbers13[i] = numbers13[i] * 2;
        System.out.println(numbers13[i]);
    }

    //Opgave 7.20
    int[] numbers14 = {10, 20, 30, 40, 50};

    // 1. Print all - for-each is better
    for (int number14 : numbers14) {
        System.out.println(number14);
    }

    // 2. Modify array - MUST use traditional
    for (int i = 0; i < numbers14.length; i++) {
        numbers14[i] *= 2;
    }

    // 3. Sum - for-each is better
    int sum5 = 0;
    for (int number14 : numbers14) {
        sum5 += number14;
    }

    // 4. Print with index - MUST use traditional
    for (int i = 0; i < numbers14.length; i++) {
        System.out.println("Index " + i + ": " + numbers14[i]);
    }

    // 5. Find max - for-each is fine
    int max2 = numbers[0];
    for (int number14 : numbers14) {
        if (number14 > max2) max2 = number14;
    }

    //Opgave 7.21
    int [] numbers15 = {10, 20, 30, 40, 50, 60};

    // For-each always goes through ENTIRE array
    for(int i = 0; i < 3; i++){
        System.out.println(numbers15[i]);
    }

    //Opgave 7.22
    int [] numbers16 = {1, 2, 3, 4, 5};

    // Cannot do backwards with for-each - must use traditional
     for (int i = numbers16.length - 1; i >= 0; i--) {
         System.out.println(numbers16[i]);
     }

    //Opgave 7.23
    int [] numbers17 = {10, 20, 30, 40, 50, 60};

     // Cannot skip elements with for-each
    for (int i = 0; i < numbers17.length; i += 2) {
        System.out.println(numbers17[i]);
    }

    //Opgave 7.24
    int [] numbers18 = {5, 3, 8, 2, 9};
    int count2 = 0;

    // Must use traditional - need to compare i and i+1
    for (int i = 0; i < numbers18.length - 1; i++) {
        if (numbers18[i] > numbers18[i + 1]) {
            count2++;
        }
    }

    System.out.println("Count: " + count2);

    //Opgave 7.25:
    int [] numbers19 = {10, 20, 30, 40, 50};
    int target = 30;
    int foundIndex = -1;

    // Must use traditional - need index
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            foundIndex = i;
            break;
        }
    }

    System.out.println(foundIndex);
}