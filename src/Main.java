import cpabe.Cpabe;

public class Main {

    public static void main(String[] args) {

        String PUB_FILE = args[0];
        String policy = args[1];
        String inputfile = args[2];

        Cpabe encryptor = new Cpabe();

        try {
            encryptor.enc(PUB_FILE, policy, inputfile, inputfile);
        } catch(Exception e) {
            System.err.println(e);
        }

    }
}
