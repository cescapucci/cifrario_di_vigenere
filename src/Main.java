public class Main {
    public static void main(String[] args) {

        Cifrario cifrario = new Cifrario();

        //decifra
        System.out.println(cifrario.decifra("ciaoguardamammacomemidiverto",
                "kaoekcujakaoekcujakaoekcujakao"));

        System.out.println(cifrario.decifra("aaaaaaaaa",
                "abcdefghi"));


        //con le stringhe in input
        //cifrario.decifraInput();
        cifrario.cifraInput();

    }
}