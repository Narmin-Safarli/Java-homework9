public class Menecer extends Ishci {
    int komandaSayi;

    public Menecer(String ad, int komandaSayi) {
        super(ad);
        this.komandaSayi = komandaSayi;
    }

    public void melumatlariGoster() {
        System.out.println("Menecerin adı: " + ad);
        System.out.println("Komanda sayı: " + komandaSayi);
    }
}