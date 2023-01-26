import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String[][] baza_danych = przeczytacData("src/data.txt");
        Odczytywanie(baza_danych);
    }
    public static String[] splitBy(String line, String separator) {
        return line.split(separator);
    }
    public static void Odczytywanie(String[][] baza_danych) {
        for (String[] row : baza_danych) {
            for (String array : row) {
                System.out.print(array + " ");
            }
            System.out.println();
        }
    }
    public static String[][] przeczytacData(String filePath) {
        String[][] data = new String[10][];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String wiersz;
            int i = 0;
            while ((wiersz = br.readLine()) != null) {
                data[i++] = splitBy(wiersz, ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}