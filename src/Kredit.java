public class Kredit extends Hesab {
    @Override
    public void faizHesabla() {
        System.out.println("Kredit hesabı üçün borc faizi hesablandı.");
    }

    public static void main(String[] args) {
        Depozit depozit = new Depozit();
        depozit.balansGoster();
        depozit.faizHesabla();

        System.out.println("---");

        Kredit kredit = new Kredit();
        kredit.balansGoster();
        kredit.faizHesabla();

    }
}