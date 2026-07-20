import java.util.Scanner ;
import java.util.ArrayList ;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        ArrayList<String> taskArray = new ArrayList<>();

        //Variables :
        String task ;
        int choice ;
        boolean running = true ;

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
            choice = scanner.nextInt();
            scanner.nextLine() ;

            switch (choice) {

                case 1 :
                // show the tasks
                    if(taskArray.isEmpty()){
                        System.out.println("Nothing has been added yet!");
                    }
                    else {
                        int i = 1 ;
                        for (String A : taskArray) {
                            System.out.println(i + " " + A);
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
                    objectTask.taskAdded();
                    taskArray.add(task);
                    break;
                }
                case 3 :
                    //remove will be added later
                    break ;

                case 4 :
                    //Exit :
                    System.out.println("GoodBye !!!");
                    running = false ;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose from 1 to 4.");
            }

        }
        scanner.close();

    }

}