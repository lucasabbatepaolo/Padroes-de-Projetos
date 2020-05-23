public class Main {

    public static void main(String[] args) {

        Dolly primeiraOvelha = new Dolly();
        Dolly segundaOvelha = null;
        try {
            segundaOvelha = (Dolly) primeiraOvelha.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(primeiraOvelha);
        System.out.println(segundaOvelha);
    }
}
