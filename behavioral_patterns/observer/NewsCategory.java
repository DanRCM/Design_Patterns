package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

class NewsCategory implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    private String categoryName;

    public NewsCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public String getCategoryName() {
        return categoryName;
    }
}