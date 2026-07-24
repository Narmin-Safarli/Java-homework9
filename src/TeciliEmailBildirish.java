public class TeciliEmailBildirish extends EmailBildirish {
    @Override
    public void gonder() {
        super.gonder();
        System.out.println("TƏCİLİ: Yüksək prioritetlə göndərildi!");
    }

    public static void main(String[] args) {
        System.out.println("1.Səviyyə");
        Bildirish b = new Bildirish();
        b.gonder();

        System.out.println("2.Səviyyə");
        EmailBildirish eb = new EmailBildirish();
        eb.gonder();

        System.out.println("3.Səviyyə");
        TeciliEmailBildirish teb = new TeciliEmailBildirish();
        teb.gonder();
    }
}