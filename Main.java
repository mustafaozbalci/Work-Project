
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome To Project");
        
        String steps = "Steps...\n"
                          + "1. Software Developer \n"
                          + "2. Employer\n"
                          + "Press 'q' for exit";
        System.out.println("**********************************");
        System.out.println(steps);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("Select : ");
            String step = scanner.nextLine();
            
            if (step.equals("q")){
                
                System.out.println("Exit...");
                break;
                
            }
            else if (step.equals("1")){
                Developer yazilimci = new Developer("Mustafa ","Ozbalci", 767,"Python,C,Java");
                String yazilimci_step = "1. Restart\n"
                                         +"2. ShowInfo\n"
                                         + "Press 'q' for exit";
                System.out.println(yazilimci_step);
                
                while (true) {
                    System.out.print("Select Option : ");
                    String y_step = scanner.nextLine();
                    
                    if (y_step.equals("q")) {
                        System.out.println("Exit...");
                        break;
                    }
                    else if (y_step.equals("1")){
                        
                        System.out.print("Platform : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.Restart(isletim_sistemi);
                        
                    }
                    else if (y_step.equals("2")){
                        
                        yazilimci.ShowInfo();
                    }
                    else {
                        System.out.println("Invalid...");
                    }
                    
                }
                
            }
            else if (step.equals("2")) {
                Employer yonetici = new Employer("Mehmet","Ata", 1453, 12);
                
                String yonetici_step = "Employer Options\n"
                                        + "1. Upgrade Price\n"
                                        + "2. Show Info\n"
                                        + "Press 'q' for exit";
                System.out.println(yonetici_step);
                
                while (true) {
                    System.out.println("Select Option: ");
                    String y_step = scanner.nextLine();
                    
                    if (y_step.equals("q")){
                        System.out.println("Exit...");
                        break;
                        
                    }
                    else if (y_step.equals("1")) {
                        System.out.print("How much is the addition of the salary ?: ");
                        int UpPrice = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.UpPrice(UpPrice);
                        
                    }
                    else if (y_step.equals("2")){
                        yonetici.ShowInfo();
                        
                    }
                    else {
                        System.out.println("Invalid Employer....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Invalid Option....");
            }
            
            
        }
        
        
    }
}
