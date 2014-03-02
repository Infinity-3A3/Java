


import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import tn.mariages.dao.CommentaireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.panierProduitDAO;
import tn.mariages.entities.PanierProduit;
import tn.mariages.entities.Produit;


public class PieChartComs extends JFrame{
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    public PieChartComs() {
        dataset = new DefaultPieDataset();

        
        CommentaireDAO cDAO = new CommentaireDAO();
        HashMap<Integer, Integer> top10Coms = cDAO.getTop10Coms();
        Produit p = new Produit();
        ProduitDAO pDAO = new ProduitDAO();
     Iterator<Integer> i = top10Coms.keySet().iterator();

   while(i.hasNext()){
  Integer key = i.next();
  System.out.println("key: " + key + " value: " + top10Coms.get(key));
            Produit DisplayProdByID = pDAO.DisplayProdByID(key);
            
   dataset.setValue(""+DisplayProdByID.getNomProd(),new Double(top10Coms.get(key)));
    
    }
      
graphe = ChartFactory.createPieChart("Top Commentaires", dataset);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
	 public static void main (String args[]){
        PieChartComs pchart = new PieChartComs();
        pchart.setVisible(true);

    }
}

