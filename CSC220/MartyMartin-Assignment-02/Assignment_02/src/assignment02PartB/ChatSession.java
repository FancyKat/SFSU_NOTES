/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Marty Martin
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class ChatSession {

    //
    //  Static Data Fields
    //

    private static String userName;
    private static String firstName;
    private static String email;
    private static int numberOfCards;
    private static ArrayList<String> recipient = new ArrayList<String>();
    private static ArrayList<Character> artSymbol = new ArrayList<Character>();
    private static ArrayList<String> messageToReci = new ArrayList<String>();
    private static Player player;

    //
    // Instance Data Fields
    //

    private Club club;
    private University university;

    //
    // Constructors
    //

    public ChatSession() {
    }

    public ChatSession(Club club, University university) {
        this.club = club;
        this.university = university;
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() {

        // Chat Session Starting Statement
        System.out.println(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - " + Language.getGreetingPhrase(6) );
        System.out.println("");
        System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + Language.getGreetingPhrase(3) + Language.getGreetingPhrase(4) + Language.getGreetingPhrase(5));
        System.out.println(Language.getGreetingPhrase(0));

        // Club Section
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(1), this.sfGiants.getname());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(2), this.sfGiants.getshortName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(3), this.sfGiants.getestablishedIn());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(4), Language.getGreetingPhrase(29) + Language.getGreetingPhrase(30) + Language.getGreetingPhrase(31) + Language.getGreetingPhrase(32));
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(5), this.sfGiants.getballPark());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(6), this.sfGiants.getworldSeriesTitles());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(7), this.sfGiants.getnlPennants());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(8), this.sfGiants.getdivisionTitles());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(9), this.sfGiants.getwildCardBerths());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(10), this.owner.getowners());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(11), this.president.getfirstName() + " "  + this.president.getlastName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(12), this.generalManager.getfirstName() + " "  + this.generalManager.getlastName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(13), this.manager.getfirstName() + " "  + this.manager.getlastName());
        System.out.println(Language.getClubPhrase(14));

        // User Information Section
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print(this.sfGiants.getshortName() + Language.getGreetingPhrase(7) + Language.getGreetingPhrase(9));
        String userName = input.nextLine();
        this.userName = userName;
        System.out.print(this.sfGiants.getshortName() + Language.getGreetingPhrase(8) + Language.getGreetingPhrase(9));
        String userSchoolEmail = input.nextLine();
        this.email = userSchoolEmail;
        System.out.print(Color.changeColor(userName) + ": "+Language.getGreetingPhrase(12));

        // University Section
        System.out.println("");
        System.out.println(Language.getUniversityPhrase(12));
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(1), this.sfsu.getname());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(2), this.sfsu.getmottoLatin());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(3), this.sfsu.getmottoEnglish());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(4), this.sfsu.gettype());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(5), this.sfsu.getestablishmentYr());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(6), this.sfsu.getlocation());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(7), this.sfsu.getaddress());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(8), Language.getGreetingPhrase(33) + Language.getGreetingPhrase(34));
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(9), this.sfsu.getnickname());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(10), this.sfsu.getmascot());
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(11), this.sfsu.getwebsite());
        System.out.println(Language.getUniversityPhrase(12));

        // CHOOSE A PLAYER (EXTRA CREDIT)
        System.out.println("Please Choose a Player (Enter the corresponding number): ");
        System.out.println("[1] - Jordan Hicks       [10] - Randy Rodríguez    [19] - Tyler Fitzgerald");
        System.out.println("[2] - Spencer Howard     [11] - Taylor Rogers      [20] - Brett Wisely");
        System.out.println("[3] - Logan Webb         [12] - Tyler Rogers       [21] - Trenton Brooks");
        System.out.println("[4] - Keaton Winn        [13] - Ryan Walker        [22] - Michael Conforto");
        System.out.println("[5] - Spencer Bivens     [14] - Camilo Doval       [23] - Heliot Ramos");
        System.out.println("[6] - Sean Hjelle        [15] - Patrick Bailey     [24] - Austin Slater");
        System.out.println("[7] - Luke Jackson       [16] - Curt Casali        [25] - Mike Yastrzemski");
        System.out.println("[8] - Erik Miller        [17] - Nick Ahmed         [26] - Jorge Soler");
        System.out.println("[9] - Randy Rodríguez    [18] - Matt Chapman       [27] - Thairo Estrada");
        System.out.print(Color.changeColor(userName) + ": ");
        int chosenPlayer = input.nextInt();
        if (chosenPlayer == 1) { this.player = this.jordanHicks; }
        else if (chosenPlayer == 2) { this.player = this.spencerHoward; }
        else if (chosenPlayer == 3) { this.player = this.loganWebb; }
        else if (chosenPlayer == 4) { this.player = this.keatonWinn; }
        else if (chosenPlayer == 5) { this.player = this.spencerBivens; }
        else if (chosenPlayer == 6) { this.player = this.seanHjelle; }
        else if (chosenPlayer == 7) { this.player = this.lukeJackson; }
        else if (chosenPlayer == 8) { this.player = this.erikMiller; }
        else if (chosenPlayer == 9) { this.player = this.randyRodríguez; }
        else if (chosenPlayer == 10) { this.player = this.taylorRogers; }
        else if (chosenPlayer == 11) { this.player = this.tylerRogers; }
        else if (chosenPlayer == 12) { this.player = this.ryanWalker; }
        else if (chosenPlayer == 13) { this.player = this.camiloDoval; }
        else if (chosenPlayer == 14) { this.player = this.patrickBailey; }
        else if (chosenPlayer == 15) { this.player = this.curtCasali; }
        else if (chosenPlayer == 16) { this.player = this.nickAhmed; }
        else if (chosenPlayer == 17) { this.player = this.mattChapman; }
        else if (chosenPlayer == 18) { this.player = this.thairoEstrada; }
        else if (chosenPlayer == 19) { this.player = this.tylerFitzgerald; }
        else if (chosenPlayer == 20) { this.player = this.wilmerFlores; }
        else if (chosenPlayer == 21) { this.player = this.brettWisely; }
        else if (chosenPlayer == 22) { this.player = this.trentonBrooks; }
        else if (chosenPlayer == 23) { this.player = this.michaelConforto; }
        else if (chosenPlayer == 24) { this.player = this.heliotRamos; }
        else if (chosenPlayer == 25) { this.player = this.austinSlater; }
        else if (chosenPlayer == 26) { this.player = this.mikeYastrzemski; }
        else if (chosenPlayer == 27) { this.player = this.jorgeSoler; }
        else{this.player = this.jorgeSoler; }

        this.connectChatters();

        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(0), this.player.getfirstName() + " " + this.player.getlastName());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(1), this.player.getclub());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(2), this.player.getposition());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(3), this.player.getnumber());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(4), this.player.getbats());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(5), this.player.getthrowS());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(6), this.player.getmlbDebut());
        System.out.println(Language.getPlayerPhrase(7));

        this.sleep(5);

        this.chat();

    }

    // Dialing section
    private static void sleep(int seconds) {
        for (int i = 0; i < seconds; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".  ");
        }
    }

    private void connectChatters() {
        // Connecting Chatters Section
        System.out.println("");
        System.out.println(this.sfGiants.getshortName() + Language.getGreetingPhrase(13) +  Language.getGreetingPhrase(14));
        this.sleep(5);
        System.out.println("");
        System.out.println(Language.getUniversityPhrase(12));
    }

    private void chat() {

        Scanner input = new Scanner(System.in);
        System.out.println("");

//      Buster Posey, 28: Hello Duc. C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!
        int index = userName.indexOf(" ");
        String firstName = userName.substring(0, index);
        this.firstName = firstName;
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": "
                +  Language.getGreetingPhrase(10) + firstName + ". " + Language.getGreetingPhrase(11) );

//      Buster Posey, 28: SAN FRANCISCO STATE UNIVERSITY. Way to go!
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": " +
                Color.changeColor(Language.getGreetingPhrase(18)) + ". " + Language.getGreetingPhrase(19));

//      Duc Ta: Thank you, Posey! Nice to e-meet you here!
        System.out.print(Color.changeColor(userName) + ": ");
        String userAnswer = input.nextLine();

//      Buster Posey, 28: Likewise, Duc. Very nice chatting w/ you.
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": "
                +  Language.getGreetingPhrase(15) + Language.getGreetingPhrase(16) +  " " + firstName + "." + Language.getGreetingPhrase(17));

//      Buster Posey, 28: How many SF Giants Thank You cards would you like to order?
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": "
                + Language.getGreetingPhrase(20));

        // CARDS SECTION
        // NUMBER OF CARDS

        for(int i = 3 ; i >= 0 ;i--){
            try{
                System.out.print(Color.changeColor(userName) + ": ");
                int numberOfCards = input.nextInt();
                this.numberOfCards = numberOfCards;
                break;
            } catch(InputMismatchException ex){
                System.out.println("Please enter an INTEGER. "  + i + " tries left.");
                System.err.println(ex);
                System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": "
                        + Language.getGreetingPhrase(20));
                input.nextLine();
            }
        }

        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": " + Language.getGreetingPhrase(22));
        System.out.println(Language.getGreetingPhrase(23));

        input.nextLine();

        for(int i = 1; i <= numberOfCards; i++){
            System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " +  Language.getGreetingPhrase(24)  + i  + ": " );
            System.out.print(Color.changeColor(userName) + ": [1] ");
            String reci = input.nextLine();
            recipient.add(reci);

            System.out.print(Color.changeColor(userName) + ": [2] ");
            char symbol = input.nextLine().charAt(0);
            artSymbol.add(symbol);

            System.out.print(Color.changeColor(userName) + ": [3] ");
            String message = input.nextLine();
            messageToReci.add(message);
        }

        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": "+ Language.getGreetingPhrase(26) + Language.getGreetingPhrase(16) + " " + firstName + ". " + Language.getGreetingPhrase(25));
        System.out.println("");

        // THANK YOU SECTION
        Card card = new Card();
        card.printCard();

        // ENDING OF CHAT SESSION
        System.out.print(Color.changeColor(userName) + ": ");
        String endingInput = input.nextLine();
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " + Language.getGreetingPhrase(27) + Language.getGreetingPhrase(16) + " " + firstName + ". " +  Language.getGreetingPhrase(28));
        System.out.println("");

        // RUN QUIZ SECTION
        this.runQuiz();

        // END END
        this.stopChatSession();

        Receipt receipt = new Receipt();
        receipt.makeRecieptLog();

    }

    private void runQuiz() {
        System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + " " + Language.getGreetingPhrase(38));
        Quiz quiz = new Quiz();
        quiz.printQuiz();
    }

    private void stopChatSession() {
        // Chat Session Ending Statement
        System.out.println(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - " + Language.getGreetingPhrase(21) );

    }

    public void runChatSession() {
        this.startChatSession();
    }


    public  ArrayList<String> getRecipient(){
        return this.recipient;
    }
    public  ArrayList<Character> getArtSymbol(){
        return this.artSymbol;
    }
    public  ArrayList<String> getMessgeToReci(){
        return this.messageToReci;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getfirstName(){
        return this.firstName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getNumOfCards(){
        return this.numberOfCards;
    }
    public Player getPlayer(){
        return this.player;
    }

    //
    //  OBJECTS
    //

    Club sfGiants = new Club("San Francisco Giants", "SF Giants", 1883, "Orange, Black, Gold, Cream",
            "Oracle Park", 8, 23, 8, 3);
    University sfsu = new University("San Francisco State University", "1600 Holloway Avenue, San Francisco, CA 94132",
            "Experientia Docet", "Experience Teaches", "Public", 1899, "San Francisco, California, United States",
            "Purple, Gold", "Gators", "Gator", "www.sfsu.edu");
    OwnerGroup owner = new OwnerGroup("San Francisco Baseball Associates LLC");
    President president = new President("Farhan", "Zaidi");
    GeneralManager generalManager = new GeneralManager("Pete", "Putila");
    Manager manager = new Manager("Bob", "Melvin");

    Player jordanHicks = new Player("Jordan", "Hicks", "San Francisco Giants", "Starting Pitcher", 12, "Right", "Right", 2018);
    Player spencerHoward = new Player("Spencer", "Howard", "San Francisco Giants", "Starting Pitcher", 56, "Right", "Right", 2020);
    Player loganWebb = new Player("Logan", "Webb", "San Francisco Giants", "Starting Pitcher", 62, "Right", "Right", 2019);
    Player keatonWinn = new Player("Keaton", "Winn", "San Francisco Giants", "Starting Pitcher", 67, "Right", "Right", 2023);
    Player spencerBivens = new Player("Spencer", "Bivens", "San Francisco Giants", "Relief Pitcher", 76, "Right", "Right", 2024);
    Player seanHjelle = new Player("Sean", "Hjelle", "San Francisco Giants", "Relief Pitcher", 64, "Right", "Right", 2022);
    Player lukeJackson = new Player("Luke", "Jackson", "San Francisco Giants", "Relief Pitcher", 77, "Right", "Right", 2015);
    Player erikMiller = new Player("Erik", "Miller", "San Francisco Giants", "Relief Pitcher", 68, "Left", "Left", 2024);
    Player randyRodríguez = new Player("Randy", "Rodríguez", "San Francisco Giants", "Relief Pitcher", 73, "Right", "Right", 2024);
    Player taylorRogers = new Player("Taylor", "Rogers", "San Francisco Giants", "Relief Pitcher", 33, "Left", "Left", 2016);
    Player tylerRogers = new Player("Tyler", "Rogers", "San Francisco Giants", "Relief Pitcher", 71, "Right", "Right", 2019);
    Player ryanWalker = new Player("Ryan", "Walker", "San Francisco Giants", "Relief Pitcher", 74, "Right", "Right", 2023);
    Player camiloDoval = new Player("Camilo", "Doval", "San Francisco Giants", "Closer", 75, "Right", "Right", 2021);
    Player patrickBailey = new Player("Patrick", "Bailey", "San Francisco Giants", "Catcher", 14, "Right", "Right", 2023);
    Player curtCasali = new Player("Curt", "Casali", "San Francisco Giants", "Catcher", 18, "Right", "Right", 2014);
    Player nickAhmed = new Player("Nick", "Ahmed", "San Francisco Giants", "Infielder", 16, "Right", "Right", 2014);
    Player mattChapman = new Player("Matt", "Chapman", "San Francisco Giants", "Infielder", 26, "Right", "Right", 2017);
    Player thairoEstrada = new Player("Thairo", "Estrada", "San Francisco Giants", "Infielder", 39, "Right", "Right", 2019);
    Player tylerFitzgerald = new Player("Tyler", "Fitzgerald", "San Francisco Giants", "Infielder", 49, "Right", "Right", 2023);
    Player wilmerFlores = new Player("Wilmer", "Flores", "San Francisco Giants", "Infielder", 41, "Right", "Right", 2013);
    Player brettWisely = new Player("Brett", "Wisely", "San Francisco Giants", "Infielder", 0, "Right", "Right", 2023);
    Player trentonBrooks = new Player("Trenton", "Brooks", "San Francisco Giants", "Outfielder", 61, "Left", "Right", 2024);
    Player michaelConforto = new Player("Michael", "Conforto", "San Francisco Giants", "Outfielder", 8, "Left", "Right", 2015);
    Player heliotRamos = new Player("Heliot", "Ramos", "San Francisco Giants", "Outfielder", 17, "Right", "Right", 2022);
    Player austinSlater = new Player("Austin", "Slater", "San Francisco Giants", "Outfielder", 13, "Right", "Right", 2017);
    Player mikeYastrzemski = new Player("Mike", "Yastrzemski", "San Francisco Giants", "Outfielder", 5, "Left", "Right", 2019);
    Player jorgeSoler = new Player("Jorge", "Soler", "San Francisco Giants", "Designated Hitter", 2, "Right", "Right", 2014);



    //
    // Language
    //
}