import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("ChatBot: Hi there! How can I help you?");
            } else if (input.contains("your name")) {
                System.out.println("ChatBot: I'm ChatBot 1.0, your virtual assistant.");
            } else if (input.contains("help")) {
                System.out.println("ChatBot: I'm here to help! Ask me anything.");
            } else if (input.equals("bye")) {
                System.out.println("ChatBot: Goodbye! Have a nice day.");
                break;
            } else {
                System.out.println("ChatBot: Sorry, I didn't understand that.");
            }
        }

        scanner.close();
    }
}
