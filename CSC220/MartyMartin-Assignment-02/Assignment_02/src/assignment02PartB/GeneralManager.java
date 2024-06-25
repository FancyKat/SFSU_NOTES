/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: GeneralManager.java
 * Author: Duc Ta
 * Author: Marty Martin
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class GeneralManager extends Person {

    //
    // Instance Data Fields
    //

    private String firstName;
    private String lastName;

    //
    // Constructors
    //

    public GeneralManager() {
    }

    public GeneralManager(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //

    //
    // Instance Methods
    //

    public String getfirstName(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String firstName = this.firstName;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            firstName = language.getTranslation(firstName);
        }
        return firstName;
    }
    public String getlastName(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String lastName = this.lastName;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            lastName = language.getTranslation(lastName);
        }
        return lastName;
    }
    public void setfirstName(String firstNm){
        this.firstName = firstNm;
    }
    public void setlastName(String lastNm){
        this.lastName = lastNm;
    }

    //
    // Language
    //

    //
    // Override
    //

    public String toString(){
        return "General Manager: " + firstName + " " + lastName;
    }
    public void sayGreeting(String string){

    }
}