package lab7_2;

public final class Square extends ClosedCurve  implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4* side;
	}


}
