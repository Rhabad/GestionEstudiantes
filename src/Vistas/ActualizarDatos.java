/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Conexiones.Conexion;
import Main.CambiarInterfaz;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLAS
 */
public class ActualizarDatos extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarDatos
     */
    public ActualizarDatos() {
        initComponents();
        setLayout(null);
        setTitle("Actualizar Datos del Alumno");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboElegir = new javax.swing.JComboBox<>();
        lblCombo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblRut2 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblDia = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblCarrera = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel10.setText("Carrera");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neurobiologia", "Informatica", "Medicina", "Matematicas" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRut.setText("Rut(Obligatorio)");

        jLabel2.setText("Ingrese el rut del alumno para poder identificarlo:");

        comboElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actualizar", "Eliminar", "Mostrar Alumno" }));
        comboElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboElegirActionPerformed(evt);
            }
        });

        lblCombo.setText("Elija que funcion desea:");

        lblNombres.setText("Nombres");

        lblRut2.setText("Fecha Nacimiento:");

        lblDia.setText("Dia");

        lblApellidoM.setText("Apellido M.");

        lblMes.setText("Mes");

        lblApellidoP.setText("Apellido P.");

        lblAnio.setText("Año");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblCarrera.setText("Carrera");

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Psicologia", "Informatica", "Medicina" }));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCombo)
                                    .addComponent(lblRut))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboElegir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addComponent(btnRegresar)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblRut2)
                                .addGap(123, 123, 123)))
                        .addGap(21, 21, 21)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres)
                            .addComponent(lblApellidoP))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoP)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblApellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblCarrera)
                                .addGap(30, 30, 30)
                                .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCombo)
                            .addComponent(comboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoM)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoP)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarrera)
                            .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRut2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMes)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnio)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDia))
                        .addGap(19, 19, 19))
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboElegirActionPerformed
        //aqui al elegir eliminar o mostrar alumno
        //las casillas para agregar se deshabilitaran
        if (comboElegir.getSelectedItem() == "Eliminar" || comboElegir.getSelectedItem() == "Mostrar Alumno") {
            txtNombres.setEnabled(false);
            txtApellidoP.setEnabled(false);
            txtApellidoM.setEnabled(false);
            comboCarrera.setEnabled(false);
            txtDia.setEnabled(false);
            txtMes.setEnabled(false);
            txtAnio.setEnabled(false);
        }
        //aca sucede lo contrario de arriba, se habilitaran.
        if (comboElegir.getSelectedItem() == "Actualizar") {
            txtNombres.setEnabled(true);
            txtApellidoP.setEnabled(true);
            txtApellidoM.setEnabled(true);
            comboCarrera.setEnabled(true);
            txtDia.setEnabled(true);
            txtMes.setEnabled(true);
            txtAnio.setEnabled(true);
        }
    }//GEN-LAST:event_comboElegirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        CambiarInterfaz cam = new CambiarInterfaz();
        cam.regresarMenu();
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String rut = "";
        String nombres = "";
        String apellidoP = "";
        String apellidoM = "";
        String carrera = "...";
        String anio = "", mes = "", dia = "";
        
        //obtener lo que queremos del combobox, comboElegir
        String laEleccion = (String)comboElegir.getSelectedItem();
        
        //si preciona el boton...
        
        rut = txtRut.getText();
        nombres = txtNombres.getText();
        apellidoP = txtApellidoP.getText();
        apellidoM =  txtApellidoM.getText();
        carrera = comboCarrera.getSelectedItem().toString();
        anio = txtAnio.getText();
        mes = txtMes.getText();
        dia = txtDia.getText();
        
        int laCarrera = 0;
        String fechaNacimiento = anio+"-"+mes+"-"+dia;
        
        if (carrera.equals("Psicologia")) {
            laCarrera = 1;
        }
        if (carrera.equals("Informatica")) {
            laCarrera = 2;
        }
        if (carrera.equals("Medicina")) {
            laCarrera = 3;
        }
        
        
       
        
        //si marcamos actualizar, hacemos esto
        if (laEleccion.equals("Actualizar")) {
            //si minimo un campo esta vacio... debera completarlo
            if (rut.equals("") ||nombres.equals("") || apellidoP.equals("") || apellidoM.equals("")
                    || carrera.equals("...") || anio.equals("") || mes.equals("") || dia.equals("")) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos");

            } else { //si tiene todos los campo rellenos, los muestra en pantalla
                
                //actualizar en bd
                Conexion con = new Conexion();
                
                int elnumero = Integer.parseInt(rut);
        
                con.actualizarAlumno(elnumero, nombres, apellidoP, apellidoM, fechaNacimiento, laCarrera);
                
                JOptionPane.showMessageDialog(null, "======= ALUMNO AGREGADO ======="
                        + "\nRut: "+rut+""
                        + "\nNombres: "+nombres+""
                        + "\nApellidos: "+apellidoP+" "+apellidoM+""
                        + "\nCarrera: "+carrera+ ""
                        + "\nFecha Nacimiento: "+anio+"-"+mes+"-"+dia);
            }
        }
        
        //si marcamos mostrar alumnos, realizamos esto
        if (laEleccion.equals("Mostrar Alumno")) {
            if (rut.equals("")) {
                JOptionPane.showMessageDialog(null, "Complete campo: Rut Obligatorio");
            } else {
                Conexion con = new Conexion();
                //mostramos al alumno en base a su rut
                //muestra, el rut, nombres, apellidos, fechanac, idcarrera, carrera

                int elnumero = Integer.parseInt(rut);

                con.mostrarAlumno(elnumero);
            }
        }
        
        
        //ahora con eliminar alumno
        if (laEleccion.equals("Eliminar")) {
            if (rut.equals("")) {
                JOptionPane.showMessageDialog(null, "Complete campo: Rut Obligatorio");
            } else {
                Conexion con = new Conexion();
                //mostramos al alumno en base a su rut
                //muestra, el rut, nombres, apellidos, fechanac, idcarrera, carrera

                int elnumero = Integer.parseInt(rut);

                con.eliminarAlumno(elnumero);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboCarrera;
    private javax.swing.JComboBox<String> comboElegir;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCombo;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblRut2;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
