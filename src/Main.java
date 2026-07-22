import java.util.Scanner ;
import java.util.ArrayList ;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        ArrayList<String> taskArray = new ArrayList<>();

        //Variables :
        String task = "";
        int choice ;
        boolean running = true ;
        int j  ;

        //Welcome message :

        System.out.println("*****************************");
        System.out.println("Welcome to the to-do list app");
        System.out.println("*****************************");


        while(running) {
            System.out.println();
            System.out.println("***************");
            System.out.println("1. Show tasks");
            System.out.println("2. Add a task");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("please choose (1-4) :");

            while(!scanner.hasNextInt()) {
                System.out.println("Error , please enter a whole number");
                System.out.print("Try again : ");
                scanner.next() ;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 :
                // show the tasks
                    if(taskArray.isEmpty()){
                        System.out.println("Nothing has been added yet!");
                    }
                    else {
                        int i = 1 ;
                        Task objectTask1 = new Task(task);
                        for (String A : taskArray) {
                            System.out.println(i + " " + objectTask1.getTask() );
                            i++ ;

                        }
                    }
                break ;

                case 2 :
                //Ask the user for input :
                System.out.print("please enter a task : ");
                task = scanner.nextLine().trim();
                if(task.isEmpty()){
                    System.out.println("Invalid task");

                }
                else {
                    Task objectTask = new Task(task);
                    System.out.println("You added : " + objectTask.getTask());
                    taskArray.add(task);
                    break;
                }
                case 3 :
                    System.out.print("Please enter the number of the task u wanna delete : ");
                    while(!scanner.hasNextInt() || taskArray.isEmpty() ){
                        System.out.println("Error , please enter a whole number");
                        System.out.print("Try again : ");
                        scanner.next() ;
                    }


                    j = scanner.nextInt() ;
                    taskArray.remove( j - 1) ;
                    System.out.println("deleted successfully");
                    break ;

                case 4 :
                    //Exit :
                    System.out.println("GoodBye!!!");
                    running = false ;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose from 1 to 4.");
            }

        }
        scanner.close();

    }

}