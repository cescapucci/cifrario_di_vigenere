import java.util.Scanner;

public class Cifrario {

    private char matrice[][] = new char[26][26];
    public static char[] alfabeto = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Cifrario (){
        popolaMatrice();
    }


    public void popolaMatrice() {
        int k = 0;

        for (int i = 0; i < 26; i++) {
            k = i;
            for (int j = 0; j < 26; j++) {
                matrice[i][j] = alfabeto[k];
                if (k == 25)
                    k = 0;

                else k++;
            }
        }
/*
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print("[" + matrice[i][j] + "]");
            }
            System.out.println("");
        }

 */
    }


    public String convertiStringa(String msg, String k){
        String convertito ="";

        for (int i=0; i < msg.length(); i++){
            char l = msg.charAt(i); //prendo un carattere per entrmabi
            char s = k.charAt(i);
            char aggiungi = carattereConvertito(l,s);
            convertito = convertito + aggiungi;
            //System.out.println(convertito);
        }
        return convertito;
    }

    public char carattereConvertito(char i, char j){
        return matrice[trovai(i)][trovaj(j)];
    }

    //codice ascii A = &#65;
    public int trovai(char c){
        c = Character.toUpperCase(c);
        return (int)c-65;
    }

    public int trovaj(char c){
        c = Character.toUpperCase(c);
        return (int)c-65;
    }

    public String convertiStringaInput(){

        //chiedo la stringa testo
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("inserire il testo");
        String msg = scanner.nextLine();  // Read user input
        System.out.println("il testo è: " + msg);  // Output user input

        //chiedo la chiave
        String k ="";
        do {
            System.out.println("inserire la chiave (lunga quanto  il testo)");
            k = scanner.nextLine();  // Read user input
            System.out.println("la  chiave è: " + k);  // Output user input
            int aa = k.length();
        }  while (msg.length()!=k.length());

        String convertito ="";

        for (int i=0; i < msg.length(); i++){
            char l = msg.charAt(i); //prendo un carattere per entrmabi
            char s = k.charAt(i);
            char aggiungi = carattereConvertito(l,s);
            convertito = convertito + aggiungi;
            //System.out.println(convertito);
        }
        System.out.println("il messaggio in chiaro è: " + convertito);
        return convertito;
    }
}
