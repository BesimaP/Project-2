import java.sql.SQLOutput;

void main (){
    /*Opgave fra undervisning mandag d. 2/2.
    int day = 5;
    String preText = "That's it for today. ";
    String greeting1 = " Have a nice weekend. ";
    String greeting2 = " See you tomorrow. ";
    String postText = " And always remember: Code, Test, Reflect";

    String message = preText;

    if (day == 5){
    message += greeting1;
    } else {
    message += greeting2;
    }
    message += postText;

    System.out.println(message);

    int x = 6;
    if (x>0 && x<10){
    System.out.println("positive single digit number");
    }
    */

    /*Øvelse
    int timeInSecond = 45 ; // tid brugt (f.eks. 45, 95, 200...)
    boolean escaped = true; //true hvis man kom ud, false hvis tiden løb ud / gav op
    int treasures = 3; //antal skattekister samlet
    int kittens = 4; // antal killinger reddet
    int score = 0; // det endelige resultat vi skal beregne

    if (!escaped) {
        score = kittens + treasures;   //Straf hvis man ikke slap ud
        } else {
        // Tid-bonus hvis man slap ud
        if (timeInSecond < 30){
            score = 100;
        } else if (timeInSecond < 60) {
            score = 80;
        } else if (timeInSecond < 90){
            score = 50;
        } else if (timeInSecond < 120) {
            score = 10;
        }
        // hvis ≥ 120 -> score forbliver 0

        // Bonus for killinger * skatte - gælder kun hvis man slap ud
        score += kittens * treasures;
        }
    System.out.println("Din score bliver: " + score);
    */

    //Noter fra undervisningen onsdag 4.2.26

    // opret sum = 0
    // for 1-50
    // tjek om 'i' er lige: i%2==0
    //boolean isEven = i%2==0;
    //if isEven == true;
    // hvis det er lige, læg det oveni værdien af sum

    /* int sum = 0;
    for (int i = 0; i <= 50; i+=2){
        sum += i;
    }
    System.out.println("Sum of even numbers: " + sum);

    int sum1 = 0;
    for (int i = 0; i <=50; i++){
        boolean isEven = i%2==0;
        if (isEven == true) {
            sum1 += i;
        }
    }
    System.out.println(sum1);

   // Eksempel;
    for (int i = 0; i <= 10; i++) {
        System.out.println(i%2==0);
        }
    */

    Scanner scan = new Scanner (System.in);
    System.out.println("Type your age: ");
    int input = scan.nextInt ();
    System.out.println("User age: " + input);

    scan.nextLine();//springer ned på næste linje

    System.out.println("Type your name: ");
    String name = scan.nextLine();
    System.out.println("User name: " + name);

    //hvis alderen er højere end eller lige med 18
    //så fortæl brugeren at han er voksen
    // ellers fortæl brugeren at han er et barn(eller for ung)


    String [] alcoholDrinks = {"Mojito", "Gin hass", "Espresso Martini", "Aperol"};
    String [] nonAlcoholDrinks = {"Pepsi max", "Orange juice", "Water", "Apple juice"};

    if (input>=18) {
        System.out.println(name + ", du er voksen. Du får drinksmenu!");
        for (int i = 0; i < alcoholDrinks.length; i++ ) {
                System.out.println((i+1) + ". " + alcoholDrinks[i]);
         }
    } else {
        System.out.println(name + ", du er for ung. Du får børnemenu!");
        int i = 1;
        for(String item : nonAlcoholDrinks) {
            System.out.println((i++) +". " +item);
        }
    }
}
