/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreriajava;

import ec.edu.ups.controlador.ControladorPersonadb;
import ec.edu.ups.modelo.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
    * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
     int cont=0;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int conp1=0;
        int conp2=0;
        int conp3=0;
        int conp4=0;
        int conp5=0;
        int conp6=0;
        int conp7=0;
        int conp8=0;
        Double suma1=0.00;
        Double suma2=0.00;
        Double suma3=0.00;
        Double suma4=0.00;
        Double suma5=0.00;
        Double suma6=0.00;
        Double suma7=0.00;
        Double suma8=0.00;
    public VentanaPrincipal() throws Exception {
        initComponents();
         String url="jdbc:postgresql://localhost:5432/MiBaseDeDatos";
        String user="postgres";
        String password="Flako031996";
        ControladorPersonadb controlador=new ControladorPersonadb(url, user, password);
        Set <Persona> listaPersonas=controlador.listaPersonas();
        
        for (Persona persona : listaPersonas) {
            if(persona.getEdad()>=16 && persona.getEdad()<=20){
               // System.out.println(persona.toString());
                if(persona.getGenero().equals("Masculino")){
                    conp1++;
                    suma1=suma1+persona.getSalario();
                }
                 if(persona.getGenero().equals("Femenino")){
                    conp2++;
                    suma2=suma2+persona.getSalario();
                }
                cont1++;
                
            }
            if(persona.getEdad()>=21 && persona.getEdad()<=30){
                //System.out.println(persona.toString());
                
                if(persona.getGenero().equals("Masculino")){
                    conp3++;
                    suma3=suma3+persona.getSalario();
                }
                 if(persona.getGenero().equals("Femenino")){
                    conp4++;
                    suma4=suma4+persona.getSalario();
                }
                 cont2++;
                
            }
             if(persona.getEdad()>=31 && persona.getEdad()<=40){
                //System.out.println(persona.toString());
                 if(persona.getGenero().equals("Masculino")){
                    conp5++;
                    suma5=suma5+persona.getSalario();
                }
                 if(persona.getGenero().equals("Femenino")){
                    conp6++;
                    suma6=suma6+persona.getSalario();
                }
                cont3++;
                
            }
              if(persona.getEdad()>=41 ){
                //System.out.println(persona.toString());
                   if(persona.getGenero().equals("Masculino")){
                    conp7++;
                    suma7=suma7+persona.getSalario();
                }
                 if(persona.getGenero().equals("Femenino")){
                    conp8++;
                    suma8=suma8+persona.getSalario();
                }
                cont4++;
                
            }
               cont++;   
        }
        System.out.println("Entre 16-20: "+cont1);
        System.out.println("Entre 21-30: "+cont2);
        System.out.println("Entre 31-40: "+cont3);
        System.out.println("Mayores 40: "+cont4);
        System.out.println("Personas totales: "+cont);
        //Promedio Salario por edades y Genero
        System.out.println("Promedio Hombres 16-20 Salario: "+(suma1/conp1));
        System.out.println("Promedio Mujeres 16-20 Salario: "+(suma2/conp2));
        System.out.println("Promedio Hombres 21-30 Salario: "+(suma3/conp3));
        System.out.println("Promedio Mujeres 21-30 Salario: "+(suma4/conp4));
        System.out.println("Promedio Hombres 31-40 Salario: "+(suma5/conp5));
        System.out.println("Promedio Mujeres 31-40 Salario: "+(suma6/conp6));
        System.out.println("Promedio Hombres mayores 40 Salario: "+(suma7/conp7));
        System.out.println("Promedio Mujeres mayores 40 Salario: "+(suma8/conp8));
        grafico1();
        grafico2();
        
    }
    public void grafico1(){
      DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Entre 16-20", cont1);
        data.setValue("Entre 21-30", cont2);
        data.setValue("Entre 31-40", cont3);
        data.setValue("Mayores a 40", cont4);
        
        
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Promedio por Edades", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartPanel frame = new ChartPanel(chart);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(frame,BorderLayout.CENTER);
        jPanel1.validate();
        
}
    public void grafico2(){
         // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue((suma2/conp2), "Mujeres", "16-20");
        dataset.setValue((suma1/conp1), "Hombres", "16-20");
        dataset.setValue((suma4/conp4), "Mujeres", "21-30");
        dataset.setValue((suma3/conp3), "Hombres", "21-30");
        dataset.setValue((suma6/conp6), "Mujeres", "31-40");
        dataset.setValue((suma5/conp5), "Hombres", "31-40");
        dataset.setValue(0, "Mujeres", "Mayores 40");
        dataset.setValue((suma7/conp7), "Hombres", "Mayores 40");

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Promedio Salario por Genero","Genero", "Salario", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(chartPanel,BorderLayout.CENTER);
        jPanel2.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficos De Estadisticas");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}