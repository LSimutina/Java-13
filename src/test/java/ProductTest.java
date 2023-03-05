import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void shouldSetBookWithAuthor() {
        Book book = new Book(1, "Моя Весна", 100, "Александр Шубкин");
        book.setId(1);
        book.setName("Моя Весна");
        book.setPrice(100);
        book.setAuthor("Александр Шубкин");

        int expectedId = 1;
        int actualId = book.getId();
        String expectedName = "Моя Весна";
        String actualName = book.getName();
        int expectedPrice = 100;
        int actualPrice = book.getPrice();
        String expectedAuthor = "Александр Шубкин";
        String actualAuthor = book.getAuthor();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedAuthor, actualAuthor);
    }

    @Test
    public void shouldSetBook() {
        Product book = new Product();
        book.setId(1);
        book.setName("Моя Весна");
        book.setPrice(100);

        int expectedId = 1;
        int actualId = book.getId();
        String expectedName = "Моя Весна";
        String actualName = book.getName();
        int expectedPrice = 100;
        int actualPrice = book.getPrice();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void shouldSetSmartphoneWithManufacturer() {
        Smartphone smartphone = new Smartphone(1, "Phone", 40_000, "Samsung");
        smartphone.setId(1);
        smartphone.setName("Phone");
        smartphone.setPrice(40_000);
        smartphone.setManufacturer("Samsung");

        int expectedId = 1;
        int actualId = smartphone.getId();
        String expectedName = "Phone";
        String actualName = smartphone.getName();
        int expectedPrice = 40_000;
        int actualPrice = smartphone.getPrice();
        String expectedAuthor = "Samsung";
        String actualAuthor = smartphone.getManufacturer();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedAuthor, actualAuthor);
    }

    @Test
    public void shouldSetSmartphone() {
        Product smartphone = new Product();
        smartphone.setId(1);
        smartphone.setName("Phone");
        smartphone.setPrice(40_000);

        int expectedId = 1;
        int actualId = smartphone.getId();
        String expectedName = "Phone";
        String actualName = smartphone.getName();
        int expectedPrice = 40_000;
        int actualPrice = smartphone.getPrice();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}