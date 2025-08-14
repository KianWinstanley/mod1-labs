package lab14extension;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MoviesStream {

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Inception", "Sci-Fi", 8.8, 2010),
				new Movie("Interstellar", "Sci-Fi", 8.6, 2014),
				new Movie("The Dark Knight", "Action", 9.0, 2008),
				new Movie("Tenet", "Sci-Fi", 7.5, 2020),
				new Movie("The Prestige", "Drama", 8.5, 2006),
				new Movie("Memento", "Thriller", 8.4, 2000),
				new Movie("Dunkirk", "War", 7.9, 2017)
				);
		
		System.out.println("Sci-Fi by rating: ");
		movies.stream().filter(movie -> movie.getGenre().equalsIgnoreCase("Sci-Fi"))
		.sorted(Comparator.comparingDouble(Movie::getRating)
				.reversed()).forEach(System.out::println);
		
		System.out.println("Average rating for movies after 2010: ");
		double average = movies.stream().filter(movie -> movie.getYear() > 2010).collect(Collectors.averagingDouble(Movie::getRating));
		System.out.println(average);
		
		System.out.println("Movies grouped by genre: ");
		Map<String, List<String>> genres = movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.toList())));
		genres.forEach((genre, title) -> System.out.println(genre + ": " + title));
		
		System.out.println("Highest rated in each genre: ");
		Map<String, Optional<Movie>> genreRatings = movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.maxBy(Comparator.comparingDouble(Movie::getRating)))); 
		genreRatings.forEach((genre, movie) -> System.out.println(genre + ": " + movie));
		
		System.out.println("Movies with rating about 8.0: ");
		System.out.println(movies.stream().filter(movie -> movie.getRating() > 8.0).count());
		
		System.out.println("Titles in alphabetical order: ");
		String alphabetical = movies.stream().map(Movie::getTitle).sorted().collect(Collectors.joining(","));
		System.out.println(alphabetical);
		
		System.out.println("Movie statistics by release year");
		IntSummaryStatistics byYear = movies.stream().mapToInt(Movie::getYear).summaryStatistics();
		System.out.println(byYear);
	}

}
