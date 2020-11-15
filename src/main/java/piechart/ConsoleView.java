
package piechart;


public class ConsoleView implements PercentageView {

    @Override
    public void notify(PercentageModel model) {
        System.out.printf("Nouvelle valeur : %.2f %n", model.getValue());
    }
    
}
