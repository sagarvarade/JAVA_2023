package multithreading.service;

import static multithreading.util.CommonUtil.delay;

import multithreading.domain.Review;

public class ReviewService {

	public Review retrieveReviews(String productId) {
		delay(1000);
		return new Review(200, 4.5);
	}
}
