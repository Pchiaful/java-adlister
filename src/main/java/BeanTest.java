import model.Album;
import model.Author;
import model.Quote;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album(
                1,
                "Post Malone",
                "Stoney",
                2016,
                "Hip-Hop/Rap",
                22
        );
        Quote quote = new Quote(
                2,
                "George Strait",
                2
        );
        Author author = new Author(
                3,
                "Suzanne",
                "Collins",
                new String[] {"The Hunger Games", "Catching Fire"},
                "Dystopian"
        );

//        System.out.println(album);
//        System.out.println(quote);
        System.out.println(author);
    }
}