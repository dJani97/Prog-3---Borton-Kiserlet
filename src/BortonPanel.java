
import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;
import javax.swing.ListModel;
import alaposztalyok.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author djani
 */
public class BortonPanel extends javax.swing.JPanel {
    
    private static final int GONOSZSAGI_HATAR = 5;
    private int MAX_AGRESSZIO_NOVEKEDES = 3;
    
    private static final int meret_x = 750;
    private static final int meret_y = 550;
    private static final String fajlEleres = "/adatok/szemelyek.txt";
    private static final String CHAR_SET = "UTF-8";
    
    private Random rand = new Random();
    
    private DefaultListModel<Bortonor> bortonorModel = new DefaultListModel<>();
    private DefaultListModel<Fogoly> fogolyModel = new DefaultListModel<>();
    private DefaultListModel<Bortonor> agresszivModel = new DefaultListModel<>();
    private List<Szemely> szemelyLista = new ArrayList<>();

    /**
     * Creates new form BortonPanel
     */
    public BortonPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bortonorList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fogolyList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        fogolyKijelzo = new javax.swing.JLabel();
        bortonorKijelzo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        naploTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        agresszivList = new javax.swing.JList<>();
        agresszivjLabel = new javax.swing.JLabel();
        kiserletjButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 520));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        bortonorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bortonorList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bortonorListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(bortonorList);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Börtönőr");

        fogolyList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fogolyList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fogolyListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(fogolyList);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fogoly");

        fogolyKijelzo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fogolyKijelzo.setText("Fásultság:");

        bortonorKijelzo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bortonorKijelzo.setText("Agressziószint:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Napló");

        naploTextArea.setColumns(20);
        naploTextArea.setRows(5);
        jScrollPane3.setViewportView(naploTextArea);

        agresszivList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(agresszivList);

        agresszivjLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        agresszivjLabel.setText("Legagresszívabbak:");

        kiserletjButton.setText("Kísérlet");
        kiserletjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiserletjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bortonorKijelzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agresszivjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fogolyKijelzo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kiserletjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kiserletjButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fogolyKijelzo)
                                    .addComponent(bortonorKijelzo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGap(24, 24, 24)
                        .addComponent(agresszivjLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        statikusBeallitas();
        setSize(meret_x, meret_y);
        if (beolvasas()) {
            fogolyList.setModel(fogolyModel);
            bortonorList.setModel(bortonorModel);
            agresszivList.setModel(agresszivModel);
        }

    }//GEN-LAST:event_formAncestorAdded
    
    private void statikusBeallitas() {
        Bortonor.setHatar(GONOSZSAGI_HATAR);
    }

    private void bortonorListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bortonorListValueChanged
        bortonorKijelzo.setText("Agressziószint: "
                + Integer.toString(bortonorList.getSelectedValue().getAgresszio()));
        naploMegjelenitese(bortonorList.getSelectedValue());
    }//GEN-LAST:event_bortonorListValueChanged

    private void fogolyListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fogolyListValueChanged
        fogolyKijelzo.setText("Fásultság: "
                + Integer.toString(fogolyList.getSelectedValue().getFasultsag()));
        naploMegjelenitese(fogolyList.getSelectedValue());
    }//GEN-LAST:event_fogolyListValueChanged
    
    private void naploMegjelenitese(Szemely valasztottSzemely) {
        naploTextArea.setText(valasztottSzemely.getNaploTartalom());
    }
    

    private void kiserletjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiserletjButtonActionPerformed
        szimulacio();
        maximumKereses();
    }//GEN-LAST:event_kiserletjButtonActionPerformed
    
    private void szimulacio() {
        int valasztott;
        int szimulacioSzam = rand.nextInt(bortonorModel.getSize());
        
        for (int i = 0; i < szimulacioSzam; i++) {
            valasztott = rand.nextInt(bortonorModel.getSize());
            bortonorModel.getElementAt(valasztott).agresszioNovekedes(rand.nextInt(MAX_AGRESSZIO_NOVEKEDES));
        }
        
        szimulacioSzam = rand.nextInt(fogolyModel.getSize());
        
        for (int i = 0; i < szimulacioSzam; i++) {
            valasztott = rand.nextInt(fogolyModel.getSize());
            if (Math.random() >= 0.5) {
                fogolyModel.getElementAt(valasztott).fasul();
            } else {
                fogolyModel.getElementAt(valasztott).lazad();
            }
            
        }
        
        for (Szemely szemely : szemelyLista) {
            szemely.ujabbNap();
        }
    }
    
    private void maximumKereses() {
        int max = 0;
        List<Bortonor> orok = Collections.list(bortonorModel.elements());
        
        for (Bortonor bortonor : orok) {
            if (bortonor.getAgresszio() > max) {
                max = bortonor.getAgresszio();
            }
        }
        
        agresszivModel.clear();
        for (Bortonor bortonor : orok) {
            if (bortonor.getAgresszio() == max) {
                agresszivModel.addElement(bortonor);
            }
        }
    }
    
    private boolean beolvasas() {
        try (
                InputStream ins = getClass().getResourceAsStream(fajlEleres);
                Scanner fajlScanner = new Scanner(ins, CHAR_SET)) {
            String sor;
            while (fajlScanner.hasNextLine()) {
                sor = fajlScanner.nextLine();
                feldolgoz(sor);
            }
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    private void feldolgoz(String sor) {
        if (Math.random() <= 0.4) {
            Bortonor or = new Bortonor(sor);
            bortonorModel.addElement(or);
            szemelyLista.add(or);
        } else {
            Fogoly fogoly = new Fogoly(sor);
            fogolyModel.addElement(fogoly);
            szemelyLista.add(fogoly);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Bortonor> agresszivList;
    private javax.swing.JLabel agresszivjLabel;
    private javax.swing.JLabel bortonorKijelzo;
    private javax.swing.JList<Bortonor> bortonorList;
    private javax.swing.JLabel fogolyKijelzo;
    private javax.swing.JList<Fogoly> fogolyList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton kiserletjButton;
    private javax.swing.JTextArea naploTextArea;
    // End of variables declaration//GEN-END:variables

}