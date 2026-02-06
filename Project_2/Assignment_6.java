import com.sun.security.jgss.GSSUtil;

void main(){
    //Opgave 6.1: Print array elements
    int [] numbers = {10,20,30,40,50};

    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }

    //Opgave 6.2: Print index
    int [] numbers1 = {5, 10, 15, 20};

    for (int i = 0; i < numbers.length; i++){
        System.out.println("Score at index " + i + ": " + numbers[i]);
    }

    //Opgave 6.3: String array iteration
    String [] names = {"Anna", "Bob", "Carl", "Diana"};

    for (int i = 0; i < names.length; i++){
        System.out.println(names[i]);
    }

    //Opgave 6.4: Double array iteration
    double [] prices = {12.5, 8.75, 15.0, 22.25};

    for (int i = 0; i < prices.length; i++){
        System.out.println(prices[i] + " kr.");
    }

    //Opgave 6.5: Array length
    int [] numbers2 = {2, 6, 8, 10, 12};
    System.out.println("Arry length: " + numbers2.length);

    for (int i = 0; i < numbers2.length; i++){
        System.out.println(numbers2[i]);
    }

    //Opgave 6.6: Sum array elements
    int [] numbers3 = {10,20,30,40,50};
    int sum = 0;

    for (int i = 0; i < numbers3.length; i++){
        sum += numbers3[i];
    }
    System.out.println("Sum: " + sum);

    //Opgave 6.7: Average
    int [] scores = {85, 92, 78, 88, 95};
    int sum1 = 0;

    for (int i = 0; i < scores.length; i++){
        sum1 += scores[i];
        System.out.println("Total sum: " + sum1);
    }
    double average = sum1 /scores.length;
    System.out.println("Average: " + average);

    //Opgave 6.8: Count even numbers
    int [] numbers4 = {3, 8, 12, 5, 20, 7, 14};
    int count = 0;

    for (int i = 0; i < numbers4.length; i++){
        if (numbers4[i] % 2 == 0) {
            count++;
        }
    }
    System.out.println("Even numbers: " + count);

    //Opgave 6.9: Count above threshold
    int [] numbers5 = {45, 67, 23, 89, 12, 56, 78};
    int count1 = 0;

    for (int i = 0; i < numbers5.length; i++){
        if (numbers5[i] > 50){
            count1++;
        }
    }
    System.out.println("Above 50: " + count1);

    //Opgave 6.10: Sum and count
    int [] number = {10, 25, 5, 30, 15, 20};
    int count2 = 0;
    int sum3 = 0;

    for (int i = 0; i < number.length; i++){
        sum3 += number[i];
        System.out.println("Total: " + sum3);

        if (number[i] >= 20) {
            count2++;
            System.out.println("Count: " + count2);
        }
    }

    //Opgave 6.11: Find element
    int [] numbers6 = {10, 20, 30, 40, 50};
    int target = 30;
    int foundIndex = -1;

    for(int i = 0; i < numbers6.length; i++){
        if (numbers6[i] == target) {
            foundIndex = i;
            System.out.println("Index: " + foundIndex);
            break;
        } else {
            System.out.println("Not found");
        }
    }

    //Opgave 6.12: Contains check
    int [] numbers7 = {5, 10, 15, 20, 25};
    int target1 = 15;
    boolean found = false;

    for(int i = 0; i < numbers7.length; i++){
        if (numbers7[i] == target1){
            found = true;
            break;
        }
    }
    if (found) {
        System.out.println("Array contains: "+ target1);
    } else {
        System.out.println("Array does not contain " + target1);
    }

    //Opgave 6.13: Find minimum
    int [] numbers8 = {45, 12, 67, 23, 89, 8, 34};
    int min = numbers8[0];

    for(int i = 1; i < numbers8.length; i++){
        if (numbers8[i] < min){
            min = numbers8[i];
        }
    }
    System.out.println("Minimum: " + min);

    //Opgave 6.14: Find maximum
    int [] numbers9 = {34, 78, 12, 56, 90, 23, 67};
    int min1 = numbers9 [0];
    int max1 = numbers9 [0];

    for(int i = 1; i < numbers9.length; i++){
        if (numbers9[i] < min1){
            min1 = numbers9[i];
        }
        if (numbers9[i] > max1) {
            max1 = numbers9[i];
        }
    }
    System.out.println("Minimum: " + min1);
    System.out.println("Maximum: "+ max1);
    System.out.println("Range: " + (max1 - min1));

    //Opgave 6.16: Double all value
    int [] numbers10 = {5, 10, 15, 20};

    System.out.println("Before:");
    for(int i = 0; i < numbers10.length; i++){
        System.out.println(numbers10[i] + " ");
    }

    for (int i = 0; i < numbers10.length; i++){
        numbers10 [i] = numbers10 [i] * 2;
    }

    System.out.println("After:");
    for (int i = 0; i < numbers10.length; i++) {
        System.out.println(numbers10[i] + " ");
    }

    //Opgave 6.17:
    int [] numbers11 = {10, 20, 30, 40};

    System.out.println("Before:");
    for(int i = 0; i < numbers11.length; i++){
        System.out.println(numbers11[i] + " ");
    }

    for (int i = 0; i < numbers11.length; i++){
        numbers11 [i] = numbers11 [i] + 5;
    }

    System.out.println("After:");
    for (int i = 0; i < numbers11.length; i++) {
        System.out.println(numbers11[i] + " ");
    }

    //Opgave 6.18: Se negatives to zero
    int [] numbers12 = {10, -5, 20, -15, 30};

    System.out.println("Before:");
    for(int i = 0; i < numbers12.length; i++){
        System.out.println(numbers12[i] + " ");
    }

    for (int i = 0; i < numbers12.length; i++){
        if(numbers12[i] < 0){
            numbers12[i] = 0;
        }
    }

    System.out.println("After:");
    for (int i = 0; i < numbers12.length; i++) {
        System.out.println(numbers12[i] + " ");
    }

    //Opgave 6.19: Normalize to percentage
    int [] scores4 = {25, 50, 75, 100};
    double [] percentages = new double[scores4.length];

    for (int i = 0; i < scores4.length; i++){
        percentages[i] = scores4[i] / 100.0;
    }
    System.out.println("Percentages:");
    for ( int i = 0; i < percentages.length; i++){
        System.out.println(percentages[i]);
    }

    //Opgave 6.20: Square all walues
    int [] scores3 = {2, 3, 4, 5};

    System.out.println("Before:");
    for(int i = 0; i < scores3.length; i++) {
        System.out.println(scores3[i] + " ");
    }
    System.out.println("After:");
    for (int i = 0; i < scores3.length; i++){
        scores3[i] = scores3[i] * scores3[i];
        System.out.println(scores3[i]);
    }

    //Opgave 6.21: Print backwards
    int [] numbers13 = {10, 20, 30, 40, 50};

    for(int i = numbers13.length -1; i>= 0; i--){
        System.out.println(numbers13[i]);
    }
    System.out.println("====================");

    //Opgave 22: Reverse sum
    int [] numbers14 = {5, 10, 15, 20};
    int sum2 = 0;

    for(int i = numbers14.length -1; i>= 0; i--){
        sum2 += numbers14 [i];
        System.out.println("Adding " + numbers14[i] + ", sum = " + sum2);
    }

    //Opgave 23: Find last oocurrence
    int [] numbers15 = {10, 20, 30, 20, 40};
    int target2 = 20;
    int founderIndex2 = - 1;

    for (int i = numbers15.length - 1; i >= 0; i--){
        if (numbers15[i] == target2) {
            founderIndex2 = i;
            break;
        }
    }
    System.out.println("Last occurrence at Index: " + founderIndex2);

    //Opgave 24: Print alternating
    int [] numbers17 = {1, 2, 3, 4, 5, 6};
    int left = 0;
    int right = numbers17.length -1;

    while (left <= right){
        System.out.println(numbers17[left]);
        if (left != right){
            System.out.println(numbers17[right]);
        }
        left++;
        right--;
    }

    //Opgave 25: Count from both ends
    int [] numbers16 = {5, 15, 25, 35, 45, 55};
    int countStart = 0;
    int countEnd = 0;

    for(int i = 0; i < numbers16.length; i++){
        if (numbers16[i] > 20) {
            countStart++;
        }
    }

    for(int i = numbers16.length -1; i>= 0; i--){
          if (numbers16[i] > 20){
              countEnd++;
          }
    }
    System.out.println("Start: " + countStart);
    System.out.println("End: " + countEnd);
 }
