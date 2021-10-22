package challenge;

public class CriptografiaCesariana implements Criptografia {

    private static void checkText(String text) {
        if (text.isEmpty()) throw new IllegalArgumentException();
        if (text == null) throw new NullPointerException();
    }

    public static String Criptografia(String phrase, boolean mod) {
        checkText(phrase);
        String frase = phrase.toLowerCase();
        int size = frase.length();
        String result = "";

        for (int i = 0; i < size; i++) {
            char charFrase = frase.charAt(i);

            if (charFrase >= 'a' && charFrase <= 'z') {
                if (mod == true && charFrase == 'x') {
                    result += 'a';
                } else if (mod == true && charFrase == 'y') {
                    result += 'b';
                } else if (mod == true && charFrase == 'z') {
                    System.out.println(charFrase);
                    result += 'c';
                }else{
                    int operator = mod == true ? charFrase + 3 : charFrase - 3;
                    System.out.println(result);
                    result += (char) operator;
                }
            }
            else {
                result += charFrase;
            }
        }
        return result;
    }

    @Override
    public String criptografar(String texto) {
        return Criptografia(texto, true);
    }

    @Override
    public String descriptografar(String texto) {
        return Criptografia(texto, false);
    }
}
