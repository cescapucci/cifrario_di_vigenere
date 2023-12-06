import java.util.Scanner;

public class Cifrario {

    private char matrice[][] = new char[26][26];
    public static char[] alfabeto = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Cifrario (){
        popolaMatrice();
    }

    /**
     * metodo per  popolare la  matrice
     */
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

    /**
     * metodo che converte  dato il testo e la chiave  in input
     * @param msg
     * @param k
     * @return
     */
    public String decifra(String msg, String k){
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

    /**
     * restituisce il carattere nella posizione i,j della matrice, il carattere in chiaro
     * @param i
     * @param j
     * @return
     */
    public char carattereConvertito(char i, char j){
        return matrice[trovai(i)][trovaj(j)];
    }

    //codice ascii A = &#65;

    /**
     * dalla lettera ricava l'inidce dell'array sottraendo il numero del codice ascii
     * @param c
     * @return
     */
    public int trovai(char c){
        c = Character.toUpperCase(c);
        return (int)c-65;
    }

    /**
     * dalla lettera ricava l'inidce dell'array sottraendo il numero del codice ascii
     * @param c
     * @return
     */
    public int trovaj(char c){
        c = Character.toUpperCase(c);
        return (int)c-65;
    }

    /**
     * metodo che converte la stringa in chiaro da to testo e chiave in input
     * @return
     */
    public String decifraInput(){

        //chiedo la stringa testo
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("inserire il testo");
        String msg = scanner.nextLine();  // Read user input
        System.out.println("il testo è: " + msg);  // Output user input

        //chiedo la chiave
        String k ="";
        System.out.println("inserire la chiave");
        k = scanner.nextLine();  // Read user input
        System.out.println("la  chiave è: " + k);  // Output user input

        String convertito ="";

        int indexK=0;
        for (int p=0; p < msg.length(); p++){
                char i = msg.charAt(p); //prendo un carattere per entrmabi
                char j = k.charAt(indexK);
                char aggiungi = carattereConvertito(i, j);
                convertito = convertito + aggiungi;

            if(indexK < k.length()-1) {indexK++;}
                else indexK = 0;
        }
        System.out.println("il messaggio in chiaro è: " + convertito);
        return convertito;
    }

    public String cifra(String chiaro, String k){

return null;
    }

    public String cifraInput(){

        //chiedo la stringa in chiaro
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("inserire il testo in chiaro");
        String msg = scanner.nextLine();  // Read user input
        System.out.println("il testo in chiaro è: " + msg);  // Output user input

        //chiedo la chiave
        String k ="";

        System.out.println("inserire la chiave");
        k = scanner.nextLine();  // Read user input
        System.out.println("la  chiave è: " + k);  // Output user input

        String cifrato ="";

        for (int i=0; i<msg.length(); i++) {

            char c = msg.charAt(i);      //il carattere  dentro la  matrice
            char indice = k.charAt(i);
            int j = trovaj(indice);     //ho l'indice j della chiave da usare

            for  (int p = 0; p < alfabeto.length; p++){
                if (matrice[p][j] == c){
                    cifrato = cifrato + matrice[p][j];
                    break;
                }
            }
            System.out.println("cifrato " + cifrato);
        }

        System.out.println(cifrato);
        return cifrato;
    }
}
