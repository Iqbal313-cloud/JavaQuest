package simple;

public class NameFormatter {

    public static void main(String[] args) {
        String passenger = "iqBAl";

        String passengerLower = passenger.toLowerCase();

        String passengerCorrect = passengerLower.substring(0, 1).toUpperCase() + passengerLower.substring(1);

        System.out.println(passengerCorrect);


    }
}
