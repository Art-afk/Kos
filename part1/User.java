package part1;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static int countId = 0;
    private static Map<Integer, User> allUsers;


    public static void main(String[] args) {
        new User("Евгений", 35, sex.MALE);
        new User("Марина", 34, Sex.FEMALE);
        new User("Алина", 7, Sex.FEMALE);
        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех пользователей: " + User.getHowManyUsers());
        System.out.println("  всех пользователей MALE: " + User.getHowManyUsers(Sex.MALE));
        System.out.println("всех пользователей FEMALE: " + User.getHowManyUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("  общий возраст всех пользователей MALE: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("общий возраст всех пользователей FEMALE: " + User.getAllAgeUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("  средний возраст всех пользователей MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("средний возраст всех пользователей FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("================================================");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age, sex);
    }

    public User(String name, int age, Sex sex) {
        if (allUsers == null) {
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.sex = sex;
        if (!hashUser()) {
            countId++; //почему без this.countID?
            this.id = countId; //почему без this.countID?
            allUsers.put(id, this);
        }

    }

    private boolean hashUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) { //не понял что такое this
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>((getAllUsers());
    }

    public static List<User> getAllUsers(Sex sex) {
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.sex == sex) {
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    public static int getHowManyUsers() {
        return getAllUsers().size();
    }

    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers(){
        int countAge = 0;
        for(User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }
    public static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
