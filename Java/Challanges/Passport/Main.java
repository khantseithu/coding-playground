import java.time.LocalDate;
class Main{
    public static void main(String[] args){
        Passport passport = new Passport("0072371", "Myanmar", "Khant Sithu", LocalDate.of(2025, 12, 31));
        System.out.printf("Passport Number: %s %nCountry: %s %nName: %s %nExpiration Date: %s %n", passport.number, passport.country, passport.name, passport.expirationDate);

        Passport uspassport = new Passport("39423472", "United States", "John Doe", LocalDate.of(2028, 12, 31));
        System.out.printf("Passport Number: %s %nCountry: %s %nName: %s %nExpiration Date: %s %n", uspassport.number, uspassport.country, uspassport.name, uspassport.expirationDate);
    }

    static class Passport{
        String number;
        String country;
        String name;
        LocalDate expirationDate;

        public Passport(String number, String country, String name, LocalDate expirationDate){
            this.number = number;
            this.country = country;
            this.name = name;
            this.expirationDate = expirationDate;
        }
    }
}
