
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Polygon p = new Polygon();
		c.draw();
		r.draw();
		p.draw();
		
		Shape shape[] = new Shape[3];
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[2] = new Polygon();
		
		for(int i=0;i<3;i++) {
			shape[i].draw();
		}
	}

}
