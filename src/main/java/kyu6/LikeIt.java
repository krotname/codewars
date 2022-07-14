package kyu6;

import org.junit.Test;

public class LikeIt {

    //6

    /**You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

     Implement the function likes which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

     likes {} // must be "no one likes this"
     likes {"Peter"} // must be "Peter likes this"
     likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
     likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
     likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"*/


    @Test
    public void test() {
        System.out.println(whoLikesIt()); // "no one likes this"
        System.out.println(whoLikesIt("Peter")); // "Peter likes this"
        System.out.println(whoLikesIt("Jacob", "Alex")); //"Jacob and Alex like this"
        System.out.println(whoLikesIt("Max", "John", "Mark")); // "Max, John and Mark like this"
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max")); //"Alex, Jacob and 2 others like this"
    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0) return "no one likes this";
        if (names.length == 1) return names[0] + " likes this";
        if (names.length == 2) return names[0] + " and " + names[1] + " like this";
        if (names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        int otherNum = names.length - 2;
        return names[0] + ", " + names[1] + " and " + otherNum + " others like this";

    }
}