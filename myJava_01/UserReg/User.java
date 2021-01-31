public class User {
    // Field
    private int user_id = 0;
    private double age = 0;
    private double weight = 0;

    // Constructor
    public User() {
    }

    public User(int id) {
        this.user_id = id;
    }

    public User(int user_id, double age, double weight) {
        this.user_id = user_id;
        this.age = age;
        this.weight = weight;
    }

    // Encalsulation
    public double getAge() {
        return age;
    }
    public int getUser_id() {
        return user_id;
    }
    public double getWeight() {
        return weight;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

}