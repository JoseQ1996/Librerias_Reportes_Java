/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import ec.edu.ups.controlador.BaseDeDatos;
import ec.edu.ups.controlador.ControladorDirecciondb;
import ec.edu.ups.controlador.ControladorPersonadb;
import ec.edu.ups.modelo.Direccion;
import ec.edu.ups.modelo.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.PopupMenu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
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
        double []sumas;
        int [] contadores;
        double [] acumulador;
         String url="jdbc:postgresql://localhost:5432/MiBaseDeDatos";
        String user="postgres";
        String password="Flako031996";
        Set <Persona> listaPersonas;
    public VentanaPrincipal() throws Exception {  
        initComponents();
        
        ControladorPersonadb controlador=new ControladorPersonadb(url, user, password);
   
        sumas=new double[38];
        contadores=new int[38];
        acumulador=new double[38];
        listaPersonas=controlador.listaPersonas();
        
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
        /*
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
        */
        int i=0;
        for (int ed=16;ed<=53;ed++){
            
        for (Persona persona : listaPersonas) {       
            if(persona.getEdad()==ed){
                sumas[i]=sumas[i]+persona.getSalario();
                contadores[i]++;
            }                    
        }
        if(contadores[i]==0){
           acumulador[i]=0; 
        }
        else{
        acumulador[i]=sumas[i]/contadores[i];
        }
            //System.out.println("Edad "+ ed +" promedio "+acumulador[i]+" con un total de :" +sumas[i]+" y de personas " +contadores[i]);
            i++;
        }       
       
        
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
    
    public void grafico3(){
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        
        int ed=16;
       for (int i = 0; i <sumas.length; i++) {
                 String edad=String.valueOf(ed);     
                 line_chart_dataset.addValue(acumulador[i], "salario", edad);
                 ed++;
            }
 
   
        // Creando el Grafico
        JFreeChart chart=ChartFactory.createLineChart("Promedio por Edad",
                "Edades","Salario",line_chart_dataset,PlotOrientation.VERTICAL,
                true,true,false);  
        
        // Mostrar Grafico
        ChartPanel chartPanel1 = new ChartPanel(chart);
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(chartPanel1,BorderLayout.CENTER);
        jPanel3.validate();
    }
    public void generaPDF() throws Exception{
        
        BaseDeDatos db=new BaseDeDatos(url, user, password);
        File reporteArchivo=new File("src/ec/edu/ups/reportes/personas.jasper");
        JasperReport reporte = (JasperReport) JRLoader.loadObject(reporteArchivo);
        db.conectar();
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null,db.getConexionDb());
        JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LibreriaJava\\src\\ec\\edu\\ups\\reportes\\reportePersonas.pdf");
        JasperViewer.viewReport(jasperPrint);
        db.desconectar();
    }
    public void generarDirecciones(String Nombre,String DIR_CEDULA_PER,String edad,String fecha,String celular,String salario,String genero) throws JRException, FileNotFoundException, IOException{
        
         BaseDeDatos db=new BaseDeDatos(url, user, password);
        Map  parametros = new HashMap();
        System.out.println(Nombre);
        System.out.println(DIR_CEDULA_PER);
        parametros.put("nombre", Nombre);
        parametros.put("cedula", DIR_CEDULA_PER);
        parametros.put("fecha", fecha);
        parametros.put("celular", celular);
        parametros.put("edad", edad);
        parametros.put("genero", genero);
        parametros.put("salario", salario);
         File reporteArchivo=new File("src/ec/edu/ups/reportes/direcciones.jasper");
        JasperReport reporte= (JasperReport) JRLoader.loadObject(reporteArchivo);
        db.conectar();
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros,db.getConexionDb());
        JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LibreriaJava\\src\\ec\\edu\\ups\\reportes\\reporteDirecciones.pdf");
        JasperViewer.viewReport(jasperPrint);
        db.desconectar();


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
        btnGraficas = new javax.swing.JButton();
        btnDirecciones = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficos De Estadisticas");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1286, 785));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(31, 30, 540, 335);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(624, 30, 612, 335);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(624, 383, 612, 343);

        btnGraficas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/Chart_icon-icons.com_51184.png"))); // NOI18N
        btnGraficas.setText("Generar Graficas");
        btnGraficas.setActionCommand("");
        btnGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficasActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraficas);
        btnGraficas.setBounds(157, 398, 293, 57);

        btnDirecciones.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/file_pdf_download_icon-icons.com_68954.png"))); // NOI18N
        btnDirecciones.setText("Generar Reporte De Direcciones");
        btnDirecciones.setActionCommand("");
        btnDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDirecciones);
        btnDirecciones.setBounds(157, 536, 293, 57);

        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/file_pdf_download_icon-icons.com_68954.png"))); // NOI18N
        btnReporte.setText("Generar Reporte");
        btnReporte.setActionCommand("");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte);
        btnReporte.setBounds(157, 468, 293, 55);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/fondo5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1645, 1220));
        jLabel1.setMinimumSize(new java.awt.Dimension(1645, 1220));
        jLabel1.setPreferredSize(new java.awt.Dimension(1645, 1220));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1290, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficasActionPerformed
        grafico1();
        grafico2();
        grafico3();
    }//GEN-LAST:event_btnGraficasActionPerformed

    private void btnDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireccionesActionPerformed
        // TODO add your handling code here:
        String Cedula=JOptionPane.showInputDialog("Ingrese el numero de cedula de la persona");
        ControladorPersonadb controladorPersonadb=new ControladorPersonadb(url, user, password);
        String nombre=null;
        String edad=null;
        String fecha=null;
        String celular=null;
        String salario=null;
        String genero=null;
        try{
        Persona p=controladorPersonadb.search(Cedula);
        nombre=p.getNombres()+" "+p.getApellidos();
        edad=String.valueOf(p.getEdad());
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        fecha=formatter.format(p.getFechaNacimiento());
        celular=p.getNumeroTelefono();
        salario=String.valueOf(p.getSalario());
        genero=p.getGenero();
        
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        /*
        ControladorDirecciondb controladorDirecciondb=new ControladorDirecciondb(url, user, password);
        Set<Direccion>direcciones=controladorDirecciondb.listaDirecciones();
        Set<Direccion> listaDirecciones=new HashSet<Direccion>();
        for (Direccion direccion : direcciones) {
            if(Cedula.equals(direccion.getCedula_per())){
                listaDirecciones.add(direccion);
            }
        }  
        */
        try{
        generarDirecciones(nombre,Cedula,edad,fecha,celular,salario,genero);
        }catch(Exception ex2){
                ex2.printStackTrace();
                }
        
       

        
    }//GEN-LAST:event_btnDireccionesActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
      try{
        generaPDF();
   }catch(Exception ex){
       ex.printStackTrace();
   }
    }//GEN-LAST:event_btnReporteActionPerformed

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
    private javax.swing.JButton btnDirecciones;
    private javax.swing.JButton btnGraficas;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
