class Rectangle {

private int length;
private int breadth;

public Rectangle(int length, int breadth) {
this.length = length;
this.breadth = breadth;
}

public int getLength() {
return length;
}

public void setLength(int length) {
this.length = length;
}

public int getBreadth() {
return breadth;
}

public void setBreadth(int breadth) {
this.breadth = breadth;
}

public int getArea() {
return length * breadth;
}

public int getPerimeter() {
return 2 * (length + breadth);
}

}

//Square class extending Rectangle
class Square extends Rectangle {

public Square(int side) {
super(side, side);
}

}