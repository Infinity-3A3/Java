package tn.mariages.util;


import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.panierProduitDAO;
import tn.mariages.entities.PanierProduit;
import tn.mariages.entities.Produit;


public class PieChart extends JFrame{
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    public PieChart() {
        dataset = new DefaultPieDataset();

        panierProduitDAO ppDAO = new panierProduitDAO();
     PanierProduit pp = new PanierProduit();
     HashMap<Integer, Integer> top10BestSeller = ppDAO.getTop10BestSeller();
        ProduitDAO pDAO = new ProduitDAO();
     Iterator<Integer> i = top10BestSeller.keySet().iterator();

   while(i.hasNext()){
  Integer key = i.next();
  System.out.println("key: " + key + " value: " + top10BestSeller.get(key));
            Produit DisplayProdByID = pDAO.DisplayProdByID(key);
            
    dataset.setValue(""+DisplayProdByID.getNomProd(),new Double(top10BestSeller.get(key)));
    
    }
      
graphe = ChartFactory.createPieChart("Top Ventes Produits", dataset);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
	 public static void main (String args[]){
        PieChart pchart = new PieChart();
        pchart.setVisible(true);

    }
}

