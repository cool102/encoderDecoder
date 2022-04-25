import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.lines().map(s->new StringBuilder(s).reverse()).forEach(System.out::println);


    }
}