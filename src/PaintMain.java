
public class PaintMain {

	public static void main(String[] args) {
		
		int roomArea = 200;
		
		Paint cheapo = new Paint("CheapoMax", 20, 19.99, 10);
		Paint avgjo = new Paint("AverageJoes", 15, 17.99, 11);
		Paint Dulux = new Paint("DuluxourousPaints", 10, 25.00, 20);
		
		PaintWizard pw = new PaintWizard(roomArea);
		pw.addPaint(cheapo);
		pw.addPaint(avgjo);
		pw.addPaint(Dulux);
		System.out.println(pw.bestPaint().getName());

	}

}
