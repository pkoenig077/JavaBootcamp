import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Phil
 *
 *
 *         Stores a list of movies and displays them by category users can enter
 *         a category eg (Animated, Drama, Horror, Sci-fi) prompt for another
 *         search
 * @SPECS each movie should be represented by an object of category movie. movie
 *        class must provide 2 private fields Title and Category. movie class
 *        should provide a constructor that accepts Title and Category. when a
 *        user enters a category program should read through all of the movies
 *        in the Map/list and display a line for all movies that match the
 *        category entered. Validate user inputs. Display movies sorted
 *        alphabetically
 *
 */
public class MainMovieList {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			movieList.add(MovieIO.getMovie(i + 1));
			Collections.sort(movieList);// sorts the array of Movie objects by
										// comparing titles. sorts
										// alphabetically
		}
		boolean restart = true;
		while (restart == true) {
			String genre = Validate.getCatInput("Enter a genre: ");

			for (int i = 0; i < movieList.size(); i++) {
				if (genre.equalsIgnoreCase(movieList.get(i).getCategory())) {
					System.out.println(movieList.get(i).getTitle());
				}
			}
			restart = Validate.getRestart();
		}
		System.out.println("Good Bye");
	}
}
