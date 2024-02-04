import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void shouldAddMoviesAndGetAllReversed() {
        MovieManager manager = new MovieManager();
        manager.add("Джентельмены");
        manager.add("Шрек");
        String[] expected = {"Шрек", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultLimit() {
        MovieManager manager = new MovieManager();
        manager.add("Джентельмены");
        manager.add("Шрек");
        manager.add("Шрек 2");
        manager.add("Шрек 3");
        manager.add("Шрек 4");
        manager.add("Кот в сапогах");

        String[] expected = {"Кот в сапогах", "Шрек 4", "Шрек 3", "Шрек 2", "Шрек"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitAndGetArrLessThanLimit() {
        MovieManager manager = new MovieManager(8);
        manager.add("Джентельмены");
        manager.add("Шрек");
        manager.add("Шрек 2");
        manager.add("Шрек 3");
        manager.add("Шрек 4");
        manager.add("Кот в сапогах");

        String[] expected = {"Кот в сапогах", "Шрек 4", "Шрек 3", "Шрек 2", "Шрек", "Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
