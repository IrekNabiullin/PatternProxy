public class ProxyTest {//тест

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
    }
}
