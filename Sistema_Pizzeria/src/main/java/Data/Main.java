/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Data;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author 50683
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean salir1 = false;
        // TODO code application logic here
        int opciones;
        
        Articulos miArti = new Articulos();
        
        Ordenes miOrden[] = new Ordenes[10];
        
        for (int i=0;i<miOrden.length;i++){
            miOrden[i]= new Ordenes("","",0,"",0);    
        }
        
        int miArticulo[][] = new int[10][20];
        
        for( int i = 0;i<10;i++){
            for(int j=0;j<20;j++){
                miArticulo[i][j]= 0;
            }
        }
        int posicion = 0;
        
        while (!salir1){
            
            opciones = Integer.parseInt(JOptionPane.showInputDialog
            ("""
             Menu
             
             1- Agregar nueva orden
             2- Ver orden existente
             3- Imprimir factura
             4- Salir
             
             Ingrese el numero de la accion que desea realizar"""));
            if(opciones == 1){
                        
                    
                     if (posicion != 10){
//                        
                        String nombre_C=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                        String apellido_C =JOptionPane.showInputDialog("Ingrese el apellido del cliente");
                        int telefono_C=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente"));
                        String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
                        int numero_O=(int)(Math.random()*100);
                        
                        String nombre_E=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                        String apellido_E=JOptionPane.showInputDialog("Ingrese el apellido del empleado");
                        int cedula_E =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado"));
                        String horario=JOptionPane.showInputDialog("Ingrese el horario del empleado");
                        
//                        miOrden[posicion] = new Ordenes();
                        miOrden[posicion].setNombre_C(nombre_C);
                        miOrden[posicion].setApellido_C(apellido_C);
                        miOrden[posicion].setTelefono_C(telefono_C);
                        miOrden[posicion].setDireccion(direccion);
                        miOrden[posicion].setNumero_O(numero_O);
                        miOrden[posicion].miEmpleado.setNombre(nombre_E);
                        miOrden[posicion].miEmpleado.setApellido(apellido_E);
                        miOrden[posicion].miEmpleado.setCedula(cedula_E);
                        miOrden[posicion].miEmpleado.setHorario(horario);
                        
                        posicion =posicion +1;
                     }else {
                          JOptionPane.showMessageDialog(null,"Limite de ordenes"
                                  + " alcanzado");
                     }
//                     
                }
                if(opciones == 2) {
                  boolean salida2 = false;
                    
                    while(!salida2){
                        
                            int eleccion = Integer.parseInt(JOptionPane.showInputDialog
                                   (
                                   "Ordenes por mesa"+"\n"+"\n"+
                                   "1-"+ miOrden[0].getNumero_O()+" "+miOrden[0].getNombre_C()+" "+miOrden[0].getApellido_C()+" "+miOrden[0].getDireccion()+"\n"+
                                   "2-"+ miOrden[1].getNumero_O()+" "+miOrden[1].getNombre_C()+" "+miOrden[1].getApellido_C()+" "+miOrden[1].getDireccion()+"\n"+
                                   "3-"+ miOrden[2].getNumero_O()+" "+miOrden[2].getNombre_C()+" "+miOrden[2].getApellido_C()+" "+miOrden[2].getDireccion()+"\n"+
                                   "4-"+ miOrden[3].getNumero_O()+" "+miOrden[3].getNombre_C()+" "+miOrden[3].getApellido_C()+" "+miOrden[3].getDireccion()+"\n"+
                                   "5-"+ miOrden[4].getNumero_O()+" "+miOrden[4].getNombre_C()+" "+miOrden[4].getApellido_C()+" "+miOrden[4].getDireccion()+"\n"+
                                   "6-"+ miOrden[5].getNumero_O()+" "+miOrden[5].getNombre_C()+" "+miOrden[5].getApellido_C()+" "+miOrden[5].getDireccion()+"\n"+
                                   "7-"+ miOrden[6].getNumero_O()+" "+miOrden[6].getNombre_C()+" "+miOrden[6].getApellido_C()+" "+miOrden[6].getDireccion()+"\n"+
                                   "8-"+ miOrden[7].getNumero_O()+" "+miOrden[7].getNombre_C()+" "+miOrden[7].getApellido_C()+" "+miOrden[7].getDireccion()+"\n"+
                                   "9-"+ miOrden[8].getNumero_O()+" "+miOrden[8].getNombre_C()+" "+miOrden[8].getApellido_C()+" "+miOrden[8].getDireccion()+"\n"+
                                   "10-"+ miOrden[9].getNumero_O()+" "+miOrden[9].getNombre_C()+" "+miOrden[9].getApellido_C()+" "+miOrden[9].getDireccion()+"\n"+"\n"+
                                   "11- Salir \n"+ "12- Agregar productos"
                                   
                                   ));
                            
                    
                    if (eleccion == 11){
                        salida2=true;
                    }
                    if (eleccion == 12){
                        int eleccion2 = Integer.parseInt(JOptionPane.showInputDialog
                                   (
                                   "Escriba el numero de la orden que desea agregar el producto"+"\n"+"\n"+
                                   "1-"+ miOrden[0].getNumero_O()+" "+miOrden[0].getNombre_C()+" "+miOrden[0].getApellido_C()+" "+miOrden[0].getDireccion()+"\n"+
                                   "2-"+ miOrden[1].getNumero_O()+" "+miOrden[1].getNombre_C()+" "+miOrden[1].getApellido_C()+" "+miOrden[1].getDireccion()+"\n"+
                                   "3-"+ miOrden[2].getNumero_O()+" "+miOrden[2].getNombre_C()+" "+miOrden[2].getApellido_C()+" "+miOrden[2].getDireccion()+"\n"+
                                   "4-"+ miOrden[3].getNumero_O()+" "+miOrden[3].getNombre_C()+" "+miOrden[3].getApellido_C()+" "+miOrden[3].getDireccion()+"\n"+
                                   "5-"+ miOrden[4].getNumero_O()+" "+miOrden[4].getNombre_C()+" "+miOrden[4].getApellido_C()+" "+miOrden[4].getDireccion()+"\n"+
                                   "6-"+ miOrden[5].getNumero_O()+" "+miOrden[5].getNombre_C()+" "+miOrden[5].getApellido_C()+" "+miOrden[5].getDireccion()+"\n"+
                                   "7-"+ miOrden[6].getNumero_O()+" "+miOrden[6].getNombre_C()+" "+miOrden[6].getApellido_C()+" "+miOrden[6].getDireccion()+"\n"+
                                   "8-"+ miOrden[7].getNumero_O()+" "+miOrden[7].getNombre_C()+" "+miOrden[7].getApellido_C()+" "+miOrden[7].getDireccion()+"\n"+
                                   "9-"+ miOrden[8].getNumero_O()+" "+miOrden[8].getNombre_C()+" "+miOrden[8].getApellido_C()+" "+miOrden[8].getDireccion()+"\n"+
                                   "10-"+ miOrden[9].getNumero_O()+" "+miOrden[9].getNombre_C()+" "+miOrden[9].getApellido_C()+" "+miOrden[9].getDireccion()+"\n"
                
                                   ));
                        if (true){
                            
                            boolean salida3 = false;
                            
                            while(!salida3){
                                 int eleccion3 = Integer.parseInt(JOptionPane.showInputDialog
                                   (
                                   "Lista de productos "+"\n"+"\n"+
                                   "1 - Cocacola"+"\n"+
                                   "2 - Gingerel"+"\n"+
                                   "3 - Papas fritas"+"\n"+
                                   "4 - Pasta"+"\n"+
                                   "5 - Nachos"+"\n"+
                                   "6 - Ensalada"+"\n"+
                                   "7 - Pizza"+"\n"+
                                   "8 - Bebidas Naturales"+"\n"
                                    ));
                                switch(eleccion3){
                                      case(1):
                                           int coca = Integer.parseInt(JOptionPane.showInputDialog
                                            (
                                              "ingrese la cantidad"
                                             ));
                                            int cocacola = miArti.getCoca();
                                
                                            int operacion = coca *cocacola;
                                            int N_orden = eleccion2 - 1;
                                            JOptionPane.showMessageDialog(null,N_orden);
//                                            System.out.print(N_orden);
                                            boolean comprovacion1 = false;
                                            int conteo = 0;
                                            while(!comprovacion1){
                                                if(miArticulo[N_orden][conteo] == 0){
                                                    miArticulo[N_orden][conteo] = operacion ;
                                                    comprovacion1 = true;
                                                }
                                                conteo++;
                                            }
                                            break;
                                      case(2):
                                      case(3):
                                      case(4):
                                      case(5):
                                      case(6):
                                      case(7):
                                      case(8):
                                      case(9):
                                      case(10):
                                      case(11):
                                      case(12):
                                      
                                      default:
//                                             System.out.print("listo");
                                            salida3 = true;
                          
                                }
//                                System.out.print("listo");
                            }
                        }
                    }
                   }
                    
                }
                if(opciones ==3){ 
                    JTextArea theText = new JTextArea(5,25); //create the text area
                    for( int i = 0;i<10;i++){
                        for(int j=0;j<20;j++){
                            theText.append(miArticulo[i][j]+"\n");
                        }
                         final JFrame theFrame = new JFrame();
            theFrame.setTitle("Stack exchange help");
            theFrame.setSize(500, 500);
            theFrame.setLocation(550, 400);

            JPanel mainPanel = new JPanel();

            mainPanel.add(theText); //add the text area to the panel

            theFrame.getContentPane().add(mainPanel); //add the panel to the frame
            theFrame.pack();
            theFrame.setVisible(true);
                    }
                }
                if(opciones ==4) {
                    JOptionPane.showMessageDialog(null," 4");
                    salir1= true;
                }
        }
    }   
}