import edu.fcps.Digit;

public class Seven extends Digit {

	public Seven(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		segment1_On();
		segment2_Off();
		segment3_On();
		segment4_Off();
		segment5_Off();
		segment6_On();
		segment7_Off();

	}

}