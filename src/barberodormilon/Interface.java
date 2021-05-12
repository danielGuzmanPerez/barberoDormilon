/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.and;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author vdgp_
 */
public class Interface extends javax.swing.JFrame  {

    /**
     * Creates new form Interface
     */
    public cliente clientes= new cliente(); //clase de los clientes
    public agregarCliente nuevoCliente = new agregarCliente();//clase que agrega nuevos clientes cada x tiempo
    public barbero Barbero = new barbero();
    public boolean[] arraySillasDesocupadas;//falso ocupada/ verdadero Desocupadas
    public int contadorSillasOcupadas;
    public boolean barberoOcupado;
    public Interface() {
        initComponents();
        Espera1.setVisible(false);
        Espera2.setVisible(false);
        Espera3.setVisible(false);
        clienteAtendiendo.setVisible(false);
        arraySillasDesocupadas= new boolean[3];
        arraySillasDesocupadas[0]=true;
        arraySillasDesocupadas[1]=true;
        arraySillasDesocupadas[2]=true;
        contadorSillasOcupadas=0;
        barberoOcupado=false;
        
        clientes.start();
        Barbero.start();
        nuevoCliente.start();
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        Espera1 = new javax.swing.JLabel();
        Espera2 = new javax.swing.JLabel();
        Espera3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clienteAtendiendo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/barbero.png"))); // NOI18N

        Espera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/pensando.png"))); // NOI18N

        Espera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/pensando.png"))); // NOI18N

        Espera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/pensando.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/dormido.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clienteAtendiendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barberodormilon/imagen/persona.png"))); // NOI18N
        clienteAtendiendo.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Tiempo: ");

        labelTiempo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTiempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Espera1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Espera2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Espera3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteAtendiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espera1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(Espera2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Espera3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(172, 172, 172)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(clienteAtendiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public class cliente extends Thread {
    @Override
    public void run(){
       
        while(true){
             System.out.println("hilo clientes");
            if(contadorSillasOcupadas>0){
                
                if(!barberoOcupado){
                    desocuparSilla();
                }
                
            }
        }
        
    }
    public void clienteNuevo(){ // se agrega un cliente a las sillas
        if(barberoOcupado==false){//si el barbero esta desocupado
            barberoOcupado=true;
            jLabel1.setText("ClienteNuevo");
            try {
                    Thread.sleep(2000);
                    jLabel1.setText(" ");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }

        }else{
            if(contadorSillasOcupadas<3 && barberoOcupado==true){
              ocuparSilla();
//                switch(contadorSillasOcupadas){
//                    case(0): 
//                        Espera1.setVisible(true); 
//                        arraySillasDesocupadas[0]=false;
//                        break;
//                    case(1): 
//                        Espera2.setVisible (true);
//                        arraySillasDesocupadas[1]=false;
//                        break;
//                    case(2): 
//                        Espera3.setVisible(true);
//                        arraySillasDesocupadas[2]=false;
//                        break;
//                }
//                contadorSillasOcupadas++;
//                jLabel1.setText("ClienteNuevo");
                try {
                    Thread.sleep(2000);
                    jLabel1.setText(" ");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                jLabel1.setText("Un cliente se fue");
                 try {
                    Thread.sleep(2000);
                    jLabel1.setText(" ");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void desocuparSilla(){//despinta el mono en una silla ocupada
                for (int i = 0; i < 3; i++) {
                                if(!arraySillasDesocupadas[i]){
                                   if(i==0){
                                       Espera1.setVisible(false); 
                                        arraySillasDesocupadas[0]=true;
                                        break;
                                   }
                                   if(i==1){
                                       Espera2.setVisible(false); 
                                        arraySillasDesocupadas[1]=true;
                                        break;
                                   }
                                   if(i==2){
                                       Espera3.setVisible(false); 
                                        arraySillasDesocupadas[2]=true;
                                        break;
                                   }
                                }
                            }
                            contadorSillasOcupadas--;
                            barberoOcupado=true;
            }
    }
void ocuparSilla(){//pinta el mono en una silla desocupada
             for (int i = 0; i < 3; i++) {
                        if(arraySillasDesocupadas[i]){
                           if(i==0){
                               System.out.println("1");
                               Espera1.setVisible(true); 
                                arraySillasDesocupadas[0]=false;
                                break;
                           }
                           if(i==1){
                               System.out.println("2");
                               Espera2.setVisible(true); 
                                arraySillasDesocupadas[1]=false;
                                break;
                           }
                           if(i==2){
                               System.out.println("3");
                               Espera3.setVisible(true); 
                                arraySillasDesocupadas[2]=false;
                                break;
                           }
                        }
                    }
                    contadorSillasOcupadas++;
                jLabel1.setText("ClienteNuevo");
}
public class barbero extends Thread{
    @Override
    public void run(){
        
         Icon icono;
        while(true){ //se atiende a los clientes y se duerme el barbero
             System.out.println("hilo barbero");
            if(barberoOcupado){
                icono = new ImageIcon(getClass().getResource("/barberodormilon/imagen/peluquero.png"));
              jLabel5.setIcon(icono);
              clienteAtendiendo.setVisible(true);
                tiempoEspera();
                clienteAtendiendo.setVisible(false);
                try {
                     Thread.sleep(800);//animación silla barbero desocupada
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                 }
                barberoOcupado=false;
                
                if(contadorSillasOcupadas==0){
                    icono = new ImageIcon(getClass().getResource("/barberodormilon/imagen/dormido.png"));
                    jLabel5.setIcon(icono);
                     try {
                     Thread.sleep(1000);//animación de barbero dormido
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   
                }
                
                
            }
        }
    }
    void tiempoEspera(){
        int tiempo=  (int) (Math.random()*9 + 3) ;
        for (int i = tiempo; i >= 0; i--) {
            try {
                Thread.sleep(1000);
                labelTiempo.setText(Integer.toString(i));
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class agregarCliente extends Thread{
    @Override
    public void run(){
       
        while(true){
             System.out.println("hilo agregar clientes");
            try {
                Thread.sleep(4000);
                clientes.clienteNuevo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

               
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espera1;
    private javax.swing.JLabel Espera2;
    private javax.swing.JLabel Espera3;
    private javax.swing.JLabel clienteAtendiendo;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelTiempo;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
