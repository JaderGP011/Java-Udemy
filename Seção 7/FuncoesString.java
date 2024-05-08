public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ACB acb DEFG  ";

        String s01 = original.toLowerCase(); // tudo caixa baixa
        String s02 = original.toUpperCase(); //TUDO CAIXA ALTA 
        String s03 = original.trim();// Remove espaços nos cantos
        String s04 = original.substring(2); //nesse exemplo ele só mostra da 2° letra pra frente
        String s05 = original.substring(2, 9); // aq ele só exibe entre a 2° e a 9° letra
        String s06 = original.replace("a", "x"); // Substitui elementos da String por outros
        String s07 = original.replace("abc", "xy"); // Substitui elementos da String por outros
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("Lower case -" + s01 + "-");
        System.out.println("upper case -" + s02 + "-");
        System.out.println("trim -" + s03 + "-");
        System.out.println("subString(2) -" + s04 + "-");
        System.out.println("subString(2, 9) -" + s05 + "-");
        System.out.println("replace('a', 'x') -" + s06 + "-");
        System.out.println("replace('abc', 'xy') -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
   
        //SPLIT

        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");
        
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
   
    }


}