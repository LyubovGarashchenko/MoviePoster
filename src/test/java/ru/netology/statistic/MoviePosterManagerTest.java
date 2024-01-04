package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {

    @Test
    public void shouldTestAddMoviePoster1() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestAddMoviePoster2() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestAddMoviePoster3() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");

        String[] expected = {"Movie 1", "Movie 2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestAddMoviePoster4() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster1() {
        MoviePosterManager manager = new MoviePosterManager(4);

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster2() {
        MoviePosterManager manager = new MoviePosterManager(5);

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");
        manager.addMoviePoster("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster3() {
        MoviePosterManager manager = new MoviePosterManager(6);

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");
        manager.addMoviePoster("Movie 5");
        manager.addMoviePoster("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster4() {
        MoviePosterManager manager = new MoviePosterManager(2);

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");

        String[] expected = {"Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster5() {
        MoviePosterManager manager = new MoviePosterManager(1);

        manager.addMoviePoster("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster6() {
        MoviePosterManager manager = new MoviePosterManager(0);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster7() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");
        manager.addMoviePoster("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLastMoviePoster8() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");
        manager.addMoviePoster("Movie 5");
        manager.addMoviePoster("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldTestFindLast() {
        MoviePosterManager manager = new MoviePosterManager(5);

        manager.addMoviePoster("Movie 1");
        manager.addMoviePoster("Movie 2");
        manager.addMoviePoster("Movie 3");
        manager.addMoviePoster("Movie 4");


        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
