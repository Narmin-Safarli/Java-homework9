public class Chrome extends Brauzer {
    @Override
    public void ac() {
        System.out.println("Google Chrome brauzeri açıldı.");
    }

    public static void main(String[] args) {
        Brauzer b = new Chrome();


        b.ac();
    }
}