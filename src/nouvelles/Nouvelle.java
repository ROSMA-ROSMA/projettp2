package nouvelles;

import observer.Observer;
import observer.Sujetnotifier;

import java.util.ArrayList;
import java.util.List;

public class Nouvelle implements Sujetnotifier {
    private final List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }


    @Override
    public void notifyObservers() {

    }
}
