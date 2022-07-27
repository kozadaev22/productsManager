import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository;
    ProductsManager manager = new ProductsManager(repository);

    Book book1 = new Book(1, "Название1", 100, "Автор1");
    Book book2 = new Book(2, "Название2", 200, "Автор2");
    Book book3 = new Book(3, "Название3", 300, "Автор3");

    @Test
    public void shouldFindText() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Автор");
        Product[] expected = { book1, book2, book3};
        Assertions.assertArrayEquals(actual, expected);
    }
}
