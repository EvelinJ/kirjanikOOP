package proov;

/**
 * Created by Evelin.Jogi on 3.02.2016.
 */
public class Kirjanik {
    public static void main(String[] args) {
        int tindiKogus = 60;
        Pastakas pastakas = new Pastakas(tindiKogus);
        pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle l�htekood.");
        pastakas.prindiPaljuTintiAlles();
        pastakas.kirjuta("�iged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");
    }
}
