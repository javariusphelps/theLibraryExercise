import java.util.ArrayList;

public class OverdueList<D extends libraryItem> {

    ArrayList<D> overdueItems;

    public OverdueList() {
        overdueItems = new ArrayList<>();

    }

    public void addOverdueItem(D item) {
        overdueItems.add(item);
    }

    public void removeOverdueItem(D item) {
        overdueItems.remove(item);

    }

}