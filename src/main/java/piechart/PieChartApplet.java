package piechart;

import javax.swing.JApplet;

public class PieChartApplet extends JApplet {

	public PieChartApplet() {
	}

	public void init() {
		getContentPane().add(new PercentagePanel());
	}
}
