import java.util.Random;

public class RandomCharacter {
    char getRandomLowerCaseLetter() {
        final String lettersForUse = "abcdefghiklmnopqrstuvwxyz";
        final int letterLength = lettersForUse.length();
        Random r = new Random();

//        System.out.print(lettersForUse.charAt(r.nextInt(letterLength)));
        return lettersForUse.charAt(r.nextInt(letterLength));
    }

    char getRandomUpperCaseLetter(){
        final String lettersForUse = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        final int letterLength = lettersForUse.length();
        Random r = new Random();

//        System.out.print(lettersForUse.charAt(r.nextInt(letterLength)));
        return lettersForUse.charAt(r.nextInt(letterLength));
    }

    char getRandomDigitCharacter(){
        final String lettersForUse = "1234567890";
        final int letterLength = lettersForUse.length();
        Random r = new Random();

//        System.out.print(lettersForUse.charAt(r.nextInt(letterLength)));
        return lettersForUse.charAt(r.nextInt(letterLength));
    }

    char getRandomCharacter(){
        final String lettersForUse = "`~!@#$%^&*()-_=+[]\\{}|;':\",./<>?";
        final int letterLength = lettersForUse.length();
        Random r = new Random();

//        System.out.print(lettersForUse.charAt(r.nextInt(letterLength)));
        return lettersForUse.charAt(r.nextInt(letterLength));
    }
}
