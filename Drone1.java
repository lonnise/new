package week1;
//Lonnise Downing
//05/15/2022
//program name:Downing_Drone
//Purpose:simulation using button drone movement in location x,y,z


public class Drone1 {
private int x = 0; //forward or backward
private int y = 0; // right or left
private int z = 0; // up or down

public Drone1(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
public int getx() {
		return x;
}
public void setX(int x) {
				this.x = x;
}
public int gety() {
	return y;
}
public void sety(int y) {
	this.y=y;
}
public int getz() {
	return z;
}
public void setz(int z) {
	this.z=z;
}
//Move the drone up
public int MoveUp() {
	return z++;
}
//Move the drone down
public int MoveDown() {
	return z--;
}
//Move the drone forward
public int Forward() {
	return y++;
}
//Move the drone backward
public int Backward() {
	return y--;
}
//Move the drone to the left
public int Left() {
	 return x++;
	}
//Move the drone to the right
public int Right() {
	return x--;
}
@Override
public String toString() {
	return "Drone1 [x=" + x + ", y=" + y + ", z=" + z + "]";
}
}
