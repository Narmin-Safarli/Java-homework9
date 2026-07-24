public class EmailBildirish extends Bildirish {
    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Email vasitəsilə bildiriş çatdırıldı.");
    }
}