package day27;

import java.util.regex.Pattern;

public class Main {
    //Java Regular Expressions

    public static void main(String[] args){

        System.out.println("Extra trial: " + Pattern.matches("[ac]", "a")); //only appears true for single characters

        System.out.println("? quantifier");
        System.out.println(Pattern.matches("[ayz]?", "astrryy")); //false bc y appears more than once
        System.out.println(Pattern.matches("[abc]?", "arteeac")); // false bc a appears more than once
        System.out.println(Pattern.matches("[abc]?", "abcddhdh")); // true bc abc appears once...sike appears false when there is more than one of the characters
        System.out.println(Pattern.matches("[abc]?", "a")); //true bc a appears only once
        System.out.println(Pattern.matches("[abc]?", "buy")); //false because there are extra characters 
        System.out.println(Pattern.matches("[abc]?", "gfhfghc")); //false again
        System.out.println("? quant is only true if theres one character in the string and it appears to be one of those in the '[]'");
        System.out.println();
        System.out.println("+ quantifiers(specifies if the pattern occurs once or more)");
        System.out.println(Pattern.matches("[abc]+", "acdddbaaa")); //false bc c and d are not matching patterns
        System.out.println(Pattern.matches("[abc]+", "aaaabbbbcccabababccac"));// true bc all are matching patterns 
        System.out.println(Pattern.matches("[abc]+", "abcabcabcd")); //false bc d is not a matching pattern
        System.out.println(Pattern.matches("[abc]", "a")); //true
        System.out.println(Pattern.matches("[abc]+", "aab")); // true
        System.out.println(Pattern.matches("[abc]+", "vaa")); //false v is not a matching pattern
        
    }
}    
