public class Servis implements Loglana {
    @Override
    public void log() {
        System.out.println("Servis əməliyyatları uğurla loglandı.");
    }

    public static void main(String[] args) {
        Servis servis = new Servis();

        servis.log();
    }
}