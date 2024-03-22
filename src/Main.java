import java.util.AbstractCollection;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Type type = null;
        Scanner scanner = new Scanner(System.in);
        int aircraftTypeChoice = 0;
        IAircraft aircraft = null;

        while(type==null) {
            System.out.println("Choose an type of aircraft:\n1 - Commercial\n2 - Military\n3 - Luxury");
            aircraftTypeChoice = scanner.nextInt();
            switch (aircraftTypeChoice) {
                case 1:
                    System.out.println("You chose commercial");
                    type = Type.commercial;
                    break;
                case 2:
                    System.out.println("You chose military");
                    type = Type.military;
                    break;
                case 3:
                    System.out.println("You chose luxury");
                    type = Type.luxury;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }

        while(aircraft==null) {
            System.out.println("Choose the type of aircraft to fly:\n1 - Airplane\n2 - Helicopter");
            aircraftTypeChoice = scanner.nextInt();
            switch (aircraftTypeChoice) {
                case 1:
                    System.out.println("You chose airplane");
                    aircraft = AircraftFactory.factory(type).createAirplane();
                    break;
                case 2:
                    System.out.println("You chose helicopter");
                    aircraft = AircraftFactory.factory(type).createHelicopter();
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }

        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Start\t\t\t\t2 - Stop");
            System.out.println("3 - Enter landing mode\t4 - Take off");
            System.out.println("5 - Increase altitude\t6 - Decrease altitude");
            System.out.println("7 - Repair\t\t\t\t8 - Exit");
            System.out.println("Choose an action:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    aircraft.startEngine();
                    break;
                case 2:
                    aircraft.stopEngine();
                    break;
                case 3:
                    aircraft.landingMode();
                    break;
                case 4:
                    aircraft.takeOff();
                    break;
                case 5:
                    if (aircraft.getAircraftState() == aircraft.getFlyingState()) {
                        System.out.print("Enter altitude increase amount (enter 0 to keep default): ");
                        int increaseAmount = scanner.nextInt();
                        if (increaseAmount == 0) {
                            aircraft.increaseAltitude();
                        } else {
                            aircraft.increaseAltitude(increaseAmount);
                        }
                        break;
                    }
                    System.out.println("Aircraft must be flying to increase altitude");
                    break;
                case 6:
                    if (aircraft.getAircraftState() == aircraft.getFlyingState() || aircraft.getAircraftState() == aircraft.getLandingState()) {
                        System.out.print("Enter altitude decrease amount (enter 0 to keep default): ");
                        int decreaseAmount = scanner.nextInt();
                        if (decreaseAmount == 0) {
                            aircraft.decreaseAltitude();
                        } else {
                            aircraft.decreaseAltitude(decreaseAmount);
                        }
                        break;
                    }
                    System.out.println("Aircraft must be flying or landing to decrease altitude");
                    break;
                case 7:
                    aircraft.repair();
                    break;
                case 8:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}