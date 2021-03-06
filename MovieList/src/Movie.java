/**
 * 
 * @author Phil
 * 
 */
public class Movie implements Comparable {
	private String Title, Category;

	@Override
	/**
	 * overrides the compareTo method that is used for comparing objects. Uses
	 * the title of movie for comparison, sorts alphabetically
	 */
	public int compareTo(Object comparestu) {
		int x = -((Movie) comparestu).getTitle().compareTo(Title);
		// return 0 if equal
		// returns 1 if greater than
		// returns -1 otherwise
		return x;
	}

	public Movie(String title, String category) {
		setTitle(title);
		setCategory(category);// in order to use enum do Category.valueof(String
								// category);
	}

	/**
	 * @return title of movie
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @param title
	 *            of movie to be set
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * @return category of movie
	 */
	public String getCategory() {
		return Category;
	}

	/**
	 * @param set
	 *            movie category
	 */
	public void setCategory(String category) {
		Category = category;
	}

}
