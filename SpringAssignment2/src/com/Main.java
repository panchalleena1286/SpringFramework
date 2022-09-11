package com;

public class Main {
	
	int movieId;
	String movieName;
	String movieActor;
	
	//methods
	public Main() {
		
	}

	public Main(int movieId, String movieName, String movieActor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActor = movieActor;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	
	public void initialize() {
		System.out.println("Using init method");
	}
	
	public void destroy() {
		System.out.println("using destroy method");
	}

	@Override
	public String toString() {
		return "MovieId = " + movieId + ",  MovieName = " + movieName + ", MovieActor = " + movieActor ;
	}

}
