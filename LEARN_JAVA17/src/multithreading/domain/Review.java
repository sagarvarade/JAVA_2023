package multithreading.domain;

public class Review {
    private int noOfReviews;
    private double overallRating;
    
	public Review() {
		super();
	}
	public Review(int noOfReviews, double overallRating) {
		super();
		this.noOfReviews = noOfReviews;
		this.overallRating = overallRating;
	}
	public int getNoOfReviews() {
		return noOfReviews;
	}
	public void setNoOfReviews(int noOfReviews) {
		this.noOfReviews = noOfReviews;
	}
	public double getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
	}
    
    
}
