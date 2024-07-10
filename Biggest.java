public class Biggest
{
    public static void main(String[] args) {
        // Check if there are exactly three command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide exactly three integers.");
            return; // Exit the program
        }

        // Parse integers from command-line arguments
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        // Find the biggest number
        int biggest = n1;
        if (n2 > biggest) {
            biggest = n2;
        }
        if (n3 > biggest) {
            biggest = n3;
        }

        // Print the result
        System.out.println("Biggest is " + biggest);
    }
}
		
