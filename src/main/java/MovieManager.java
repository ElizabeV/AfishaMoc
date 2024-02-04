public class MovieManager {
    private String[] movies = new String[0]; //все фильмы должны храниться внутри массива в поле самого менеджера
    private int amount;

    public MovieManager() { //constr
        this.amount = 5;
    }

    public MovieManager(int amount) {
        this.amount = amount;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie; //заполнить последнюю ячейку
        movies = tmp;
    }//добавляет фильм в массив

    public String[] findAll() {
        String[] reversed = new String[movies.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }//выведет массив в порядке добавления

    public String[] findLast() {
        int resultLength;
        if (movies.length < amount) {
            resultLength = movies.length;
        } else {
            resultLength = amount;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }//последние фильмы в массиве
}
