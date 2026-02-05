import java.util.*;
public class ToDoList{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> tasks=new ArrayList<>();
        int choice;
        do{
            System.out.println("************************");
            System.out.println("---- ToDo List Menu ----");
            System.out.println("************************");
            System.out.println("1.Add Task");
            System.out.println("2.View Tasks");
            System.out.println("3.Edit Task");
            System.out.println("4.Remove Task");
            System.out.println("5.Exit");
            System.out.println("************************");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter task description:");
                    String task=sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added to List!");
                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("---- Your TODO tasks ----");
                    System.out.println("=========================");
                    if(tasks.isEmpty()){
                        System.out.println("No tasks yet.");
                    } 
                    else{
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+". "+tasks.get(i));
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("No tasks to edit!");
                    } 
                    else{
                        System.out.println("-------------------------");
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+". "+tasks.get(i));
                            System.out.println("-------------------------");
                        }
                        System.out.println("Enter the task number to edit:");
                        int editIndex=sc.nextInt();
                        sc.nextLine();
                        if(editIndex>0 && editIndex<=tasks.size()){
                            System.out.print("Enter Updated task description: ");
                            String updatedTask=sc.nextLine();
                            tasks.set(editIndex-1,updatedTask);
                            System.out.println("Task updated successfully!");
                        } 
                        else{
                            System.out.println("Invalid task number to update!");
                        }
                    }
                    break;
                case 4:
                    if(tasks.isEmpty()){
                        System.out.println("No tasks Here!");
                    } 
                    else{
                        System.out.println("-------------------------");
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+". "+tasks.get(i));
                            System.out.println("-------------------------");
                        }
                        System.out.println("Enter the task number to remove:");
                        int removeIndex=sc.nextInt();
                        sc.nextLine();
                        if(removeIndex>0 && removeIndex<=tasks.size()){
                            tasks.remove(removeIndex-1);
                            System.out.println("Task removed from List.");
                        } 
                        else{
                            System.out.println("Invalid task number to remove!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank You for Using ToDo!");
                    break;
                default:
                    System.out.println("Invalid choice Entered!");
            }
        }while(choice!=5);
    }
}
