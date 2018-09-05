import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class glowSquare extends PApplet {

float cyan = 0;
float indigo = 0;
float magenta = 0;
float blue = 0;
float pink = 0;
float red = 0;
boolean right = true;

public void setup() {
  
}

public void draw() {
  background(0);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(0,30,255);
  translate(indigo, 0);
  rect(75, height/2 ,100,100);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(0, 102, 204);
  translate(blue, 0);
  rect(75, height/2 ,100,100);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(77, 238, 234);
  translate(cyan, 0);
  rect(75, height/2 ,100,100);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(240,0,255);
  translate(magenta, 0);
  rect(75, height/2 ,100,100);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(255,102,255);
  translate(pink, 0);
  rect(75, height/2 ,100,100);
  
  rectMode(CENTER);
  noFill();
  strokeWeight(2);
  stroke(255,0,0);
  translate(red, 0);
  rect(75, height/2 ,100,100);
  
  
  
  if(indigo >= 175){
    right = false;
  }
  else if(indigo <= 0){
    right = true;
  }
  
  if(right) {
    indigo += 2;
    blue += 0.2f;
    cyan += 0.2f;
    magenta += 0.2f;
    pink += 0.2f;
    red += 0.2f;
  }
  else {
    indigo -= 2;
    blue -= 0.2f;
    cyan -= 0.2f;
    magenta -= 0.2f;
    pink -= 0.2f;
    red -= 0.2f;
  }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "glowSquare" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
