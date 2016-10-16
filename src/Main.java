import cpabe.Cpabe;

public class Main {

    public static void main(String[] args) {

        String PUB_FILE = args[0];
        String policy = args[1];
        String inputfile = args[2];
        String encfile = args[3];

        Cpabe encryptor = new Cpabe();

        try {
            encryptor.enc(PUB_FILE, policy, inputfile, encfile);
        } catch(Exception e) {
            System.err.println(e);
        }

    }
}
