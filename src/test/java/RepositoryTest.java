import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    Repository repo = new Repository();

    Product product1 = new Product(1, "Book 1", 800);
    Product product2 = new Product(2, "Book 2", 500);
    Product product3 = new Product(3, "Book 3", 200);
    Product product4 = new Product(4, "Book 4", 1_000);
    Product product5 = new Product(5, "Book 5", 2_500);

    @Test // Проверка добавления товаров и вывод массива
    public void shouldSaveProduct() {
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.getProduct();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // Проверка добавления товаров и вывод массива
    public void shouldAddFilmNull() {
        Product[] expected = {};
        Product[] actual = repo.getProduct();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // Проверка удаления товара по ИД
    public void shouldRemoveById() {
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);
        repo.removeById(product2.getId());

        Product[] expected = {product1, product3, product4, product5};
        Product[] actual = repo.getProduct();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdNotFoundException() {
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(5);
        });

    }
}
