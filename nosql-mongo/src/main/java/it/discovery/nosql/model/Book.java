package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Book in a library
 */
@Getter
@Setter
public class Book extends BaseEntity {
	private List<Translation> names;

	private Complexity complexity;

	private PersonInfo person;

	private int publisherId;

	/**
	 * Publishing year
	 */
	private int year;

	/**
	 * Total number of pages
	 */
	private int pages;

	private List<Review> reviews;

	public void addReview(Review review) {
		if (reviews == null) {
			reviews = new ArrayList<>();
		}
		reviews.add(review);
	}
}