void main(){
    /*Opgave 3.1: Din første statement
    int day = 3;

    switch (day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
    } */

    /*Opgave 3.2: Complete week
    int day = 5;

    switch (day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    }*/

    /*Opgave 3.3: Default case
    int day = 10;

    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
    }*/

    /*Opgave 3.4: String switch
    String command = "start";

    switch (command){
        case "start":
            System.out.println("Starting...");
            break;
        case "stop":
            System.out.println("Stopping...");
            break;
        case "pause":
            System.out.println("pausing...");
            break;
        default:
            System.out.println("Unknown command");
    }*/

    /*Opgave 3.5:
    String command = "START";

    switch (command) {
        case "start":
            System.out.println("Starting...");
            break;
        case "stop":
            System.out.println("Stopping...");
            break;
        case "pause":
            System.out.println("pausing...");
            break;
        default:
            System.out.println("Unknown command");
    }*/

    /*Opgave 3.6: Traffic light
    String color = "red";

    switch (color){
        case "red":
            System.out.println("Stop");
            break;
        case "yellow":
            System.out.println("Slow down");
            break;
        case "green":
            System.out.println("Go");
            break;
        default:
            System.out.println("Unknown command");
    }*/

    /*OPGAVE 3.7: Month names
    String month = "March";

    switch (month){
        case "December":
        case "January":
        case "February":
            System.out.println("Winter");
            break;
        case "March":
        case "April":
        case "May":
            System.out.println("Spring");
            break;
        case "June":
        case "July":
        case "August":
            System.out.println("Summer");
            break;
        case "September":
        case "October":
        case "November":
            System.out.println("Fall");
            break;
        default:
            System.out.println("Invalid month");
    }*/

    /*Opgave 3.8: Calculator operation
    String operation = "add";
    int a = 10;
    int b = 5;
    int result;

    switch (operation){
        case "add":
            result = a + b;
            break;
        case "subtract":
            result = a - b;
            break;
        case "multiply":
           result = a * b;
            break;
        case "divide":
            result = a / b;
            break;
        default:
            result = 0;
            System.out.println("Unknown operation");
    }

    System.out.println("Result: " + result);
    */

    /*Opgave 3.9: Weekend check
    int day = 6;

    switch (day){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Weekday");
            break;
        case 6:
        case 7:
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Invalid day");
    }*/

    /*Opgave 3.10: Vowel check
    char ch = 'e';

    switch (ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
    }*/

    /*Opgave 3.11: Grade categories
    char grade = 'B';

    switch (grade){
        case 'A':
        case 'B':
            System.out.println("Good");
            break;
        case 'C':
        case 'D':
            System.out.println("Average");
            break;
        case 'F':
            System.out.println("Poor");
            break;
        default:
            System.out.println("Invalid grade");
    }*/

    /*Opgave 3.12: Number categories
    int num = 5;

    switch (num){
        case 1:
        case 2:
        case 3:
            System.out.println("Low");
            break;
        case 4:
        case 5:
        case 6:
        case 7:
            System.out.println("Medium");
            break;
        case 8:
        case 9:
        case 10:
            System.out.println("High");
            break;
        default:
            System.out.println("Out of range");
    }*/

    /*Opgave 3.13: Days in month
    int month = 7;
    int days;

    switch (month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            days = 31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        case 2:
            days = 28;
            break;
        default:
            days = 0;
            System.out.println("invalid month");
    }
    System.out.println("Days: " + days);
     */

    /*Opgave 3.14: When to use switch
    Check if age > 18: if-else (range check, ikke equality)
    Menu choice 1-5: switch (simple equality checks)
    Day of week 1-7: switch (simple equality checks)
    Check if (age > 18 && hasLicense): if-else (complex condition, multiple variables)
    Regel:

    Switch: simple equality checks på én variabel
    if-else: ranges, complex conditions, forskellige variabler
            */

    /*Opgave 15: Rewrite if-else as swith
    int choice = 2;

    switch (choice){
        case 1:
            System.out.println("Option 1");
            break;
        case 2:
            System.out.println("Option 2");
            break;
        case 3:
            System.out.println("Option 3");
            break;
        default:
            System.out.println("Invalid");
    }*/

    /*Opgave 3.16: Why NOT swith?
    int age = 25;
    if (age >= 18 && age < 65) {
        System.out.println("Working age");
    }
    //// Kan IKKE laves til switch fordi:
    //// 1. Vi checker et RANGE (18-64), ikke specifikke værdier
    //// 2. Vi bruger && (complex condition)
    //// 3. Switch kan kun check equality (==), ikke >= eller <
    */

    /*Opgave 3.17: Best choice
    int age = 15;
    int price;

    if (age >= 1 && age <=12) {
        price = 50;
    } else if (age >= 13 && age <= 17) {
        price = 75;
    } else if (age >= 18 && age <= 64) {
        price = 100;
    } else {
        price = 60;
    }
    System.out.println("Price: " + price + " kr.");
     */

    //Opgave 3.18: Complex Swith logic
    int month = 5;
    String quarter;

    switch (month){
        case 1:
        case 2:
        case 3:
            quarter = "Q1";
            break;
        case 4:
        case 5:
        case 6:
            quarter = "Q2";
            break;
        case 7:
        case 8:
        case 9:
            quarter = "Q3";
            break;
        case 10:
        case 11:
        case 12:
            quarter = "Q4";
            break;
        default:
            quarter = "Invalid";
    }
    System.out.println("Quarter: " + quarter);

    //Opgave 3.19: Grade points
    char grade = 'B';
    int points;

    switch (grade){
        case 'A':
            points = 12;
            break;
        case 'B':
            points = 10;
            break;
        case 'C':
            points = 7;
            break;
        case 'D':
            points = 4;
            break;
        case 'F':
            points = 0;
            break;
        default:
            points = -1;
            System.out.println("Invalid grade");
    }
    System.out.println("Points: " + points);

    //Opgave 3.20:
    String category = "fruit";
    String item = "apple";
    String description;

    switch (category){
        case "fruit":
            if (item.equals ("apple")){
                description = "Red apple";
            }  else if (item.equals ("banana")){
                description = "Yellow banana";
            }  else {
                description = "Unknown fruit";
            }
            break;
        case "Vegetable":
            if (item.equals ("carrot")){
                description = "Orange carrot";
            }  else {
                description = "Unknown fruit";
            }
            break;
        default:
            description = "Unknown category";
    }
    System.out.println(description);

    /*Opgave 3.21:   (IKKE LØØØØØØØØØØØØØØØØØØØST)
    int a = 15;
    int b = 3;
    String operation = "divide";
    double result;
    boolean validOperation = true;

    switch (operation) {
        case "add":
            result = a + b;
            break;
        case "subtract":
            result = a-b;
            break;
        case "multiply":
            result = a * b;
             break;
        case "divide":
            result = a / b;
            break;
            if (b != 0) {
                result = (double) a / b;
            } else {
                result = 0;
                System.out.println("Error: Division by zero");
                validOperation = false;
            }
            break;
        default:
            result = 0;
            System.out.println("Unknown operation");
            validOperation = false;
    }
    if (validOperation) {
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }   */

    //Opgave 3.22: Work schedule
    int day = 3;
    int workHours;

    switch (day){
        case 1:
        case 2:
        case 3:
        case 4:
            workHours = 8;
            break;
        case 5:
            workHours = 6;
            break;
        case 6:
        case 7:
            workHours = 0;
            break;
        default:
            workHours = 0;
            System.out.println("Invalid day");
    }
    System.out.println("Work hours: " + workHours);
}
