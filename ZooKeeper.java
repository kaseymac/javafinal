
import java.io.IOException;

import java.util.Scanner;

public class ZooKeeper {

    public static void main(String[] args) {

        int zookeeper;

        while (true) {

            // Prompt user to select option
            System.out.println("Select Your Option:");

            System.out.println("1. Animal\n2. Habitat\n3. Exit");

            Scanner scnr = new Scanner(System.in);

            zookeeper = scnr.nextInt();

            switch (zookeeper) {
                case 1:
                    // Prompt user to select the animal they want to monitor
                    System.out.println("Select which animal you would like to monitor: ");
                    System.out.println("1. Lions\n2. Tigers\n3. Bears\n4. Giraffes");
                    int animalOption = scnr.nextInt();
                    if (animalOption == 1) {
                        
                        System.out.println("Animal: Lion");
                        
                        System.out.println("Name: Nala");
                        
                        System.out.println("Age: 2");
                        
                        System.out.println("**** Health Concerns: Excellent");
                        
                        System.out.println("Feeding Schedule: 2 times per day");
                        
                    } else if (animalOption == 2) {
                        
                        System.out.println("Animal: Tiger");
                        
                        System.out.println("Name: Tony");
                        
                        System.out.println("Age: 9");
                        
                        System.out.println("**** Health Concerns: Good");
                        
                        System.out.println("Feeding Schedule: 2 times per day");
                        
                        
                    } else if (animalOption == 3) {
                        
                        System.out.println("Animal: Bears");
                        
                        System.out.println("Name: Baloo");
                        
                        System.out.println("Age: 6");
                        
                        System.out.println("**** Health Concerns: Excellent");
                        
                        System.out.println("Feeding Schedule: Once a day");
                        
                        
                    } else if (animalOption ==4) {
                        
                        System.out.println("Animal: Giraffes");
                        
                        System.out.println("Name: Tang");
                        
                        System.out.println("Age: 13");
                        
                        System.out.println("**** Health Concerns: Average");
                        
                        System.out.println("Feeding Schedule: Graze often");
                    }   System.out.println();
                    break;
                    
                    //Prompt user to select which habitat they would like to monitor
                case 2:
                    System.out.println("Choose which habitat would you like to monitor?: ");
                    System.out.println("1. Ice Land\n2. Bird House\n3. Aquarium\n4. Den");
                    int habitatOption = scnr.nextInt();
                    int habitatCare, healthConcerns, foodSource;
                    double tempRange;
                    System.out.println("1. Good\n 2. Bad");
                    System.out.println("Habitat: ");
                    System.out.println("Temperature: ");
                    tempRange = scnr.nextDouble();
                    if (tempRange > 30) {
                        System.out.println("Habitat temperature is unstable");
                    }   System.out.println("1. normal Range\n2. out of range");
                    System.out.println("***** Food Source: ");
                    foodSource = scnr.nextInt();
                    if (foodSource == 2) {
                        System.out.println("Food source needs attention");
                    }   System.out.println("Cleanliness option display");
                    System.out.println("Cleanliness: ");
                    healthConcerns = scnr.nextInt();
                    System.out.println();
                    break;
                default:
                    System.exit(1);
            }

        }

    }

}
