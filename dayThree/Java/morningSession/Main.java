//START
//We are to create system like facebook that detects when a user like a post
//we are to create a text that displayed the names of people if there is no user we have to return no user
//if there is user we have to get the lenght of the users and to get that we need array to store the user and index to point to the user
//END

public class Main {

    public static String likes(String[] names) {

        int names = names.length;
        
        if (names == 0) {
            return "no one likes this";
        } else if (names == 1) {
            return names[0] + " likes this";
        } else if (names == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names == 3) {
            return names[0] + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0]  + names[1] + " and " + names[2] + names[3] + " others like this";
        }
    }
    
    public static void main(String[] args) {
        
}

