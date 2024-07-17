package behavioral_patterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        // Crear categorías de noticias
        NewsCategory sports = new NewsCategory("Sports");
        NewsCategory technology = new NewsCategory("Technology");

        // Crear usuarios
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Suscribir usuarios a categorías de noticias
        sports.subscribe(user1);
        technology.subscribe(user1);
        technology.subscribe(user2);

        // Publicar noticias
        sports.setNews("New world record in 100m sprint!");
        technology.setNews("New breakthrough in quantum computing!");
    }
}