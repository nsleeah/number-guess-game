import java.util.Scanner;

public class WeatherClothes {
    public static void main(String[] args) {
        // Prompt user.
        // Receive user input.
        System.out.println("What are the weather conditions like today? Please choose from: Raining, Sunshine, Cloudy or Snowing.)");
        Scanner reader = new Scanner(System.in);
        String weatherConditions = reader.nextLine();
        System.out.println("What is the temperature today? (in degrees)");
        int temperatureConditions = reader.nextInt();

        //Logic
        if (weatherConditions.equals("Raining") && temperatureConditions < 12) {
            System.out.println("Make sure your wearing a waterproof coat.");
        } else if (weatherConditions.equals("Sunshine") && temperatureConditions >= 22) {
            System.out.println("Suns out, its t-shirt and dress vibes.");
        } else if (weatherConditions.equals("Cloudy") && temperatureConditions >= 16) {
            System.out.println("Wear something light, but don't forget your coat.");
        } else if (weatherConditions.equals("Snowing") && temperatureConditions < 2) {
            System.out.println("Wrap up, its freezing outside, wear a thick coat and boots.");
        } else {
            System.out.println("Wear something comfortable.");
        }
    }
}
