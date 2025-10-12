package simple;

public class FlightFormatter {

    public static void main(String[] args) {
        String flights =
                "_Delayed_Departure;fao93766109;txl2133758440;11:25+_Arrival;bru0943384722;fao93766109;11:45+_Delayed_Arrival;hel7439299980;fao93766109;12:05+_Departure;fao93766109;lis2323639855;12:30";

        String[] flightArray = flights.split("\\+");

        for (String flight : flightArray) {
            String[] details = flight.split(";");

            String type = details[0];
            String from = details[1];
            String to = details[2];
            String time = details[3];

            String output = (type.startsWith("_Delayed") ? "🔴 " : "")
                    + type.replace("_", " ")
                    + " "
                    + getCode(from)
                    + " "
                    + getCode(to)
                    + " ("
                    + time.replace(":", "h")
                    + ")";

            System.out.printf("%36s%n", output);
        }
    }

    private static String getCode(String str) {
        return str.substring(0, 3).toUpperCase();
    }
}

