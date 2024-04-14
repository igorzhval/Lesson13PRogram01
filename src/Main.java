public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids("Samsung Galaxy a55");
        Smartphones iPhone = new iPhones("iPhone 15");

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        ((Androids) androidPhone).linuxOS();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        ((iPhones) iPhone).iOS();
    }
}