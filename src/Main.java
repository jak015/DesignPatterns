import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Singleton - Logger (Class: Logger)
        Logger Logger1 = Logger.getinstance();
        Logger Logger2 = Logger.getinstance();
        Logger Logger3 = Logger.getinstance();

        Logger1.log("Besked fra logger1");
        Logger2.log("Besked fra logger2");
        Logger3.log("Besked fra logger3");

        if (Logger1 == Logger2 &&  Logger2 == Logger3) {
            System.out.println("Kun en instans eksister (Singleton virker)");
        } else  {
            System.out.println("Flere instanser eksister (Singleton virker ikke)");
        }

        // Singleton - WorldLeader (Class: WorldLeader)
        WorldLeader Worldleader1 = WorldLeader.getinstance();
        WorldLeader Worldleader2 = WorldLeader.getinstance();
        WorldLeader Worldleader3 = WorldLeader.getinstance();

        Worldleader1.makeSpeech("War speech");
        Worldleader2.makeSpeech("Social Speech");
        Worldleader3.makeSpeech("Accidental Speech");

        if (Worldleader1 == Worldleader2 &&  Worldleader2 == Worldleader3) {
            System.out.println("Kun en World Leader eksister (Singleton virker)");
        } else  {
            System.out.println("Flere World Leaders eksister (Singleton virker ikke)");
        }

        // Factory - MagicalCreature Factory (Classes: MagicalCreatureFactory, Unicorn, Dragon + Interface: MagicalCreature)
        Scanner input = new Scanner(System.in);
        List<MagicalCreature> creatures = new ArrayList<>();

        System.out.println("Enter Your creature (type '0' to exit): ");

        while (true) {
            String creatureType = input.next();

            if (creatureType.equals("0")) break;

            MagicalCreature creature = MagicalCreatureFactory.create(creatureType);

            if (creature != null) {
                creatures.add(creature);
            } else {
                System.out.println("Invalid tpe: " + creatureType);
            }

            for (MagicalCreature c : creatures) {
                c.performMagic();
            }
        }

        // Observer - Social Media Notifications (Classses: Follower, SocialMediaAccount, EmailFollower, SMSFollower)
        SocialMediaAccount socialMediaAccount = new SocialMediaAccount();
        Follower emailFollower = new EmailFollower("Bruger@email.com");
        Follower smsFollower = new SMSFollower("+451234568");

        socialMediaAccount.addFollower(emailFollower);
        socialMediaAccount.addFollower(smsFollower);
        socialMediaAccount.getLatestPost("Nyt opslag på profilen");
        socialMediaAccount.removeFollower(emailFollower);
        socialMediaAccount.getLatestPost("To nye opslag");
    }
}