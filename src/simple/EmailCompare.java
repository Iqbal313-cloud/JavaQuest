package simple;

public class EmailCompare {
    public static void main(String[] args) {

        String email = "iqbal@email.com";

        String loginEmail = "  Iqbal@Email.com\n";

        String normalizedEmail = loginEmail.toLowerCase().trim();
        System.out.println(normalizedEmail);
        boolean isSame = email.equals(normalizedEmail);
        System.out.println(isSame);


    }
}
