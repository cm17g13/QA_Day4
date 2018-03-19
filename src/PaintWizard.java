import java.util.ArrayList;

public class PaintWizard {

	private ArrayList<Paint> paints;
	private int roomArea;
	
	public PaintWizard(int area) {
		paints = new ArrayList<Paint>();
		this.roomArea = area;
	}
	
	public Paint bestPaint() {
		Double bestPrice = null;
		Paint bestPaint = null;
		for(Paint paint : paints) {
			//int paintArea = paint.getCoverage()*paint.getSize();
			int cans = cansRequired(paint);
			if(bestPrice == null || cans*paint.getCost() < bestPrice) {
				bestPrice = cans*paint.getCost();
				bestPaint = paint;
			}
			
		}
		return bestPaint;
		
	}
	
	public int cansRequired(Paint paint) {
		return (Math.floorDiv(roomArea, (paint.getCoverage()*paint.getSize())) + 1);
	}
	
	public int getRoomArea() {
		return this.roomArea;
	}
	
	public void setRoomArea(int i) {
		this.roomArea = i;
	}
		
	
	public void addPaint(Paint p) {
		paints.add(p);
	}
	
	public void removePaint(Paint p) {
		paints.remove(p);
	}
}
