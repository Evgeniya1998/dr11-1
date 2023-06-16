package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void testAddOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        String[] actual = manager.FindAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddZeroMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Zero");
        String[] actual = manager.FindAll();
        String[] expected = {"Zero"};
        Assertions.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void TestAddAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.FindAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindLastMovies() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.FindLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testfindLastMoviesIfNotFive() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.FindLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
