



import java.io.IOException;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*;
import tn.mariages.dao.panierProduitDAO;

public class BarChart extends ApplicationFrame {
    public BarChart(final String title) throws IOException {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }
    
public CategoryDataset createDataset() throws IOException {
        // 0. Création d'un diagramme.
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       //Valeurs statiques
     
        panierProduitDAO ppDAO = new panierProduitDAO();
        int[] sellsByMonth = ppDAO.getSellsByMonth();
        String mois;
        for (int i = 0; i < 12; i++) {
           switch (i)
            {
     
          case 0:
    mois="Janvier"; break;
          case 1:
    mois="Février"; break;      
          case 2:
    mois="Mars"; break;      
          case 3:
    mois="Avril"; break;      
          case 4:
    mois="Mai"; break;      
          case 5:
    mois="Juin"; break;      
          case 6:
    mois="Juillet"; break;
            case 7:
    mois="Août"; break;
           case 8:
    mois="Septembre"; break;
           case 9:
    mois="Octobre"; break;
           case 10:
    mois="Novembre"; break;
          case 11:
    mois="Décembre"; break;
            
  default:
   mois="";             
                }
            
        dataset.addValue(sellsByMonth[i], mois, " ");
    }
       /* dataset.addValue(10, "Taux de défaut de couverture", " ");
        dataset.addValue(12, " Taux de couverture Outdoor", " ");
        dataset.addValue(25, "Taux de couverture Indoor", " ");
        dataset.addValue(19, "Taux de couverture Incar", " ");*/
       return dataset;
    }
	public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart(
                " Ventes par mois ", // chart title
                " ", // domain axis label
                "  Le nombre de produit ", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

 final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    
        
        public static void main(final String[] args) throws IOException {
        final BarChart demo = new BarChart("Ventes par mois");
        
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setSize(700, 350);
        demo.setVisible(true);

    }
}
