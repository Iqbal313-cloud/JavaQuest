package simple;

public class PriceConverter {
    public static void main(String[] args) {
        String priceGB = "288,97£";

        String priceUS = priceGB.replace("£", " $").replace(",", ".");
        System.out.println(priceUS);
    }
}
