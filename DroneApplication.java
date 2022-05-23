package week1;

import java.util.Scanner;
//Lonnise Downing
// 05/15/2022
//program name:Downing_Drone
//Purpose:simulation using button drone movement in location x,y,z

public class DroneApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int z = 0;
	int x = 0;
	int y = 0;
	Drone1 drone = new Drone1(x,y,z);
	Scanner scanner = new Scanner (System.in);
	

 System.out.println("Select the direction what you would like the drone to move");
 System.out.println("Option 1: Move UP");
 System.out.println("Option 2: Move Down");
 System.out.println("Option 3: Move Forward");
 System.out.println("Option 4: Move Backward");
 System.out.println("Option 5: Turn Left");
 System.out.println("Option 6: Turn Right");
 System.out.println("Option 7: Display Position");
 System.out.println("Option 8: Exit Navigation");
 int choice = scanner.nextInt();

 switch(choice) {
 case 1://Move up
	
	 System.out.println("The drone moved up");
	 System.out.print(MoveUp());
	 break;
 case 2://Move down
	 z--;
	 System.out.println("The drone moved down");
	 System.out.println("The new position is:");
	 break;
 case 3: //move forward
	 x++;
	 System.out.println("The drone moved forward");
	 System.out.println("The new position is:");
	 break;
 case 4: // Move backward
	 x--;
	 System.out.println("The drone moved backward");
	 System.out.println("The new position is:");
	 break;
 case 5: //Move to the left
	 y++;
	 System.out.println("The drone moved to the left");
	 System.out.println("The new position is:");
	 break;
 case 6: // Move to the right
	 y--;
	 System.out.println("The drone moved to the right");
	 System.out.println("The new position is:");
	 break;
 case 7:
	 System.out.println("Exiting application");
	 scanner.close();
	 break;
	 default:
		 System.out.println("Invalid Choice!");
 }
	}
		
}
	

