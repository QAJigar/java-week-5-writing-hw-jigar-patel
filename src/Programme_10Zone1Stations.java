import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10Zone1Stations {

    /**
     * Write a programme that tells you which line passes through particular stations.
     * Just use Zone 1 stations name.
     */

    public static void main(String[] args) {
        Map<String, String[]> stationLines = new HashMap<>();
        stationLines.put("Angel", new String[]{"Northern"});
        stationLines.put("angel", new String[]{"Northern"});
        stationLines.put("Bank", new String[]{"Northern", "Jubilee", "Northern", "Waterloo & City", "London Overground", "Central"});
        stationLines.put("bank", new String[]{"Northern", "Jubilee", "Northern", "Waterloo & City", "London Overground", "Central"});
        stationLines.put("Baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"});
        stationLines.put("baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"});
        stationLines.put("King's Cross St. Pancras", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"});
        stationLines.put("king's Cross St. Pancras", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"});
        stationLines.put("Liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"});
        stationLines.put("liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"});
        stationLines.put("Waterloo", new String[]{"Bakerloo", "Jubilee", "Northern", "Waterloo & City"});
        stationLines.put("waterloo", new String[]{"Bakerloo", "Jubilee", "Northern", "Waterloo & City"});
        stationLines.put("Pimlico", new String[]{"Victoria"});
        stationLines.put("pimlico", new String[]{"Victoria"});
        stationLines.put("Oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});
        stationLines.put("oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});
        stationLines.put("Piccadilly Circus", new String[]{"Bakerloo", "Piccadilly"});
        stationLines.put("piccadilly Circus", new String[]{"Bakerloo", "Piccadilly"});
        stationLines.put("Charing Cross", new String[]{"Bakerloo", "Northern"});
        stationLines.put("charing Cross", new String[]{"Bakerloo", "Northern"});
        stationLines.put("Embankment", new String[]{"Bakerloo", "Northern", "Circle","District"});
        stationLines.put("embankment", new String[]{"Bakerloo", "Northern", "Circle","District"});
        stationLines.put("Leicester Square", new String[]{"Northern", "Piccadilly"});
        stationLines.put("leicester Square", new String[]{"Northern", "Piccadilly"});
        stationLines.put("Euston Square", new String[]{"Circle", "Metropolitan", "Hammersmith & City"});
        stationLines.put("euston Square", new String[]{"Circle", "Metropolitan", "Hammersmith & City"});
        stationLines.put("Euston", new String[]{"Circle", "Metropolitan", "Hammersmith & City"});
        stationLines.put("euston", new String[]{"Northern", "London Overground"});
        // we are able to add more stations as per require.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 Station Name: ");
        String stationName = scanner.nextLine();

        if (stationLines.containsKey(stationName)) {
            System.out.println("Lines Passing Through " + stationName + ":");
            String[] lines = stationLines.get(stationName);
            for (String line : lines) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("Station not found or not in Zone 1 ");
        }
        scanner.close();
    }
}
