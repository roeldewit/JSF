package runnable;

//</editor-fold>
import calculate.KochFractal;
import java.util.Observable;
import java.util.Observer;

/**
 * In this class you can find all properties and operations for LeftEdge. //CHECK
 *
 * @organization: Moridrin
 * @author J.B.A.J. Berkvens
 * @date 2014/03/23
 */
public class LeftEdge implements Runnable, Observer {

    //<editor-fold defaultstate="collapsed" desc="Declarations">
    private final KochFractal kochFractal;
    //</editor-fold>

    
    //<editor-fold desc="Operations">
    //<editor-fold defaultstate="collapsed" desc="Constructor(kochFractal, superClass, lvl)">
    /**
     * This is the constructor for BottomEdge.
     *
     * @param kochFractal
     * @param lvl
     */
    public LeftEdge(KochFractal kochFractal, int lvl) {
        this.kochFractal = kochFractal;
        this.kochFractal.setLevel(lvl);
        this.kochFractal.addObserver(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="run()">
    @Override
    public void run() {
        kochFractal.generateLeftEdge();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Update(o, arg)">
    @Override
    public void update(Observable o, Object arg) {
        
    }
    //</editor-fold>
    //</editor-fold>
}