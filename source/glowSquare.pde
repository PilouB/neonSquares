float cyan = 0;
float indigo = 0;
float magenta = 0;
float blue = 0;
float pink = 0;
float red = 0;
boolean right = true;

void setup() {
  size(400,400);
}

void draw() {
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
    blue += 0.2;
    cyan += 0.2;
    magenta += 0.2;
    pink += 0.2;
    red += 0.2;
  }
  else {
    indigo -= 2;
    blue -= 0.2;
    cyan -= 0.2;
    magenta -= 0.2;
    pink -= 0.2;
    red -= 0.2;
  }
}
