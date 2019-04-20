int x = 10; 
int y = 50; 
int speedx = 20; 
int speedy = 10; 
void setup() {
  size(500, 500); 
  background(5, 5, 5);
}
void draw() {
  ellipse(x, y, 50, 50);
  fill(12, 5, 255); 
  stroke(255, 3, 7);
  x+= speedx;
  if (x > 500||x < 0) {
    speedx = -speedx;
  }
  y += speedy;
  if (y > 500||y < 0) {
    speedy = -speedy;
  }
  rect(10,10,10,100);
}
