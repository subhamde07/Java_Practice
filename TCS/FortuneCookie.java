import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {
        String[] fortunes = {
                "You will find a thing. It may be important.",
                "You will live long enough to open many fortune cookies.",
                "Ignore all previous fortunes.",
                "The fortune you seek is in another cookie.",
                "You will be hungry again in one hour.",
                "If you think nobody cares if you’re alive, try missing a couple of car payments.",
                "He who laughs last is laughing at you.",
                "A closed mouth gathers no feet.",
                "An alien of some sort will be appearing to you shortly.",
                "You have rice in your teeth."
        };

        Random random = new Random();
        int index = random.nextInt(fortunes.length);

        System.out.println("Your Fortune Cookie says: " + fortunes[index]);

        // Bonus laugh: Simulating a broken cookie machine
        if (random.nextBoolean()) {
            System.out
                    .println("Oops! The fortune cookie machine is out of order. Here's a motivational quote instead:");
            System.out.println("Keep going, you're doing great!");
        }
    }
}
