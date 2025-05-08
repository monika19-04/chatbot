import java.util.Scanner;
import java.time.LocalTime;
import java.util.Random;

public class SmartChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("SmartBot: Hello! Ask me something. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("SmartBot: Goodbye! Take care.");
                break;
            } else if (input.contains("hello") || input.contains("hi")) {
                String[] greetings = {
                    "Hey there!",
                    "Hello! How can I help?",
                    "Hi! What's up?"
                };
                System.out.println("SmartBot: " + greetings[random.nextInt(greetings.length)]);
            } else if (input.contains("your name")) {
                System.out.println("SmartBot: I'm SmartBot, your Java companion.");
            } else if (input.contains("time")) {
                LocalTime now = LocalTime.now();
                System.out.println("SmartBot: The current time is " + now.getHour() + ":" + String.format("%02d", now.getMinute()));
            } else if (input.contains("thank")) {
                System.out.println("SmartBot: You're welcome!");
            } else if (input.matches(".*\\d+\\s*[+\\-*/]\\s*\\d+.*")) {
                // Handle simple math expressions like "5 + 3"
                String[] parts = input.split(" ");
                try {
                    int num1 = Integer.parseInt(parts[0]);
                    String operator = parts[1];
                    int num2 = Integer.parseInt(parts[2]);
                    int result = switch (operator) {
                        case "+" -> num1 + num2;
                        case "-" -> num1 - num2;
                        case "*" -> num1 * num2;
                        case "/" -> num2 != 0 ? num1 / num2 : 0;
                        default -> 0;
                    };
                    System.out.println("SmartBot: The result is " + result);
                } catch (Exception e) {
                    System.out.println("SmartBot: I couldn't solve that math problem.");
                }
            } else {
                System.out.println("SmartBot: Sorry, I don't understand that yet.");
            }
        }

        scanner.close();
    }
}
