import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp_ans = 0;
        int temp_id = 0;
        double temp_weight = 0;
        double temp_age = 0;
        List<User> users = new ArrayList<User>();

        while (true) {
            System.out.println("Register new user Press 1");
            System.out.println("Get info Press 2 ");
            System.out.println("Exit Press 0");

            while (true) {
                temp_ans = sc.nextInt();
                if ((temp_ans == 0 || temp_ans == 1 || temp_ans == 2)) {
                    break;
                }
                System.out.println("Register new user Press 1");
                System.out.println("Get info Press 2 ");
                System.out.println("Exit Press 0");
            }

            if (temp_ans == 1) {
                System.out.println("Please enter your informations :");
                System.out.println("What is your age? :");
                while (true) {
                    temp_age = sc.nextDouble();
                    if (temp_age > 0)
                        break;
                    System.out.println("Please enter the valid age");
                }
                System.out.println("What is your weight? :");
                while (true) {
                    temp_weight = sc.nextDouble();
                    if (temp_weight > 0)
                        break;
                    System.out.println("Please enter the valid weight");
                }
                users.add(new User(users.size(), temp_age, temp_weight));
                System.out.println("Your information has been recorded successfully!");
            } else if (temp_ans == 2) {
                // Output
                int users_amount = users.size();
                double average_age = 0;
                double average_weight = 0;
                double age_sum = 0;
                double weight_sum = 0;


                System.out.println("=========================================");
                
                System.out.println("There're " + users_amount + " users");

                System.out.println();

                for (User user : users) {
                    System.out.println("Weight of USER_ID:" + user.getUser_id() + " age of " + user.getAge() + " is "
                            + user.getWeight() + " KG ");
                    age_sum += user.getAge();
                    weight_sum += user.getWeight();
                }
                average_age = age_sum / (double) users_amount;
                average_age = Math.round(average_age * 100) / 100.0;
                average_weight = weight_sum / (double) users_amount;
                average_weight = Math.round(average_weight * 100) / 100.0;
                System.out.println();
                System.out.println("Average age of all users is : " + average_age);
                System.out.println("Average weight of all users is : " + average_weight);
                System.out.println("=========================================");

            } else if (temp_ans == 0)
                break;
        }

    }
}