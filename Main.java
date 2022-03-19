public class Main {
    public static void main(String[] args) {
        RandomCharacter r = new RandomCharacter();

        for (int i = 0; i < 15; i++) {
            System.out.print(r.getRandomLowerCaseLetter());
        }
        System.out.println("");
        for (int i = 0; i < 15; i++) {
            System.out.print(r.getRandomCharacter());
        }
        System.out.println("");
        for (int i = 0; i < 15; i++) {
            System.out.print(r.getRandomUpperCaseLetter());
        }
        System.out.println("");
        for (int i = 0; i < 15; i++) {
            System.out.print(r.getRandomDigitCharacter());
        }
        System.out.println("");

    }
}
