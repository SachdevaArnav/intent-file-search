import java.awt.Desktop;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Query for file search");
        String query = input.nextLine();
        try {
            List<Path> searchResult = sending_query.file_search(query);
            if (searchResult == null || searchResult.isEmpty())
                System.out.println("no related file found");

            if (searchResult.size() == 1) {
                Path file = searchResult.get(0);
                System.out.println("Found a high confidence match:");
                try {
                    Desktop.getDesktop().open(file.toFile());
                } catch (Exception e) {
                    System.out.println("Direct File open failed, opening in File Explorer");
                    ProcessBuilder pb = new ProcessBuilder("explorer.exe", file.toString());
                    Process p = pb.start();
                    p.waitFor();
                }
            }
        } catch (Exception error) {
            System.out.println("ERROR: " + error);
        }
        input.close();
    }
}
