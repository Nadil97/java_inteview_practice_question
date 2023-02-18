public class wovel {
    public static void main(String[] args) {
        System.out.println(isVowel("Hello"));
        System.out.println(isVowel("Tv"));
        
    }
    // checking method is wovel or not
    public static boolean isVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");

    }
}
