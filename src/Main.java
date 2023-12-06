public class Main {
    public static void main(String[] args) {

        Cifrario cifrario = new Cifrario();
        System.out.println(cifrario.convertiStringa("ciaoguardamammacomemidiverto",
                "kaoekcujakaoekcujakaoekcujakao"));

        System.out.println(cifrario.convertiStringa("aaaaaaaaa",
                "abcdefghi"));


        //con le stringhe in input
        cifrario.convertiStringaInput();
    }
}