import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.close();
        int current = reader.read();
        while (current != -1) {
            System.out.print((char) current);
            current = reader.read();
        }

    }
}