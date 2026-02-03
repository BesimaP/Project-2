void main (){
    //Opgave fra undervisning mandag d. 2/2.
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

    //Øvelse
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
}
