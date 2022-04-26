package Data;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        boolean salir1 = false;
        int opciones = 0;

        Articulos miArti = new Articulos();

        Ordenes miOrden[] = new Ordenes[10];
        int Pagar[][]= new int [10][15];

        for (int i = 0; i < miOrden.length; i++) {
            miOrden[i] = new Ordenes();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                Pagar[i][j] = 0;
            }
        }

        int miArticulo[][] = new int[10][20];



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                miArticulo[i][j] = 0;
            }
        }
        int posicion = 0;
        int numero_O = 1;
        while (!salir1) {


            opciones = Integer.parseInt(JOptionPane.showInputDialog
                    ("""
                            Menu
                                         
                            1- Agregar nueva orden
                            2- Ver orden existente
                            3- Imprimir factura
                            4- Salir
                                         
                            Ingrese el numero de la accion que desea realizar"""));

            if (opciones == 1) {
                boolean limite = false;

                while(!limite) {

                    String nombre_C = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
                    String apellido_C = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
                    int telefono_C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente: "));
                    String direccion = JOptionPane.showInputDialog("Ingrese la direccion electronica del cliente: ");

                    String nombre_E = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                    String apellido_E = JOptionPane.showInputDialog("Ingrese el apellido del empleado: ");
                    int cedula_E = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado: "));
                    String horario = JOptionPane.showInputDialog("Ingrese el horario del empleado: ");

                    miOrden[posicion].setNombre_C(nombre_C);
                    miOrden[posicion].setApellido_C(apellido_C);
                    miOrden[posicion].setTelefono_C(telefono_C);
                    miOrden[posicion].setDireccion(direccion);
                    miOrden[posicion].setNumero_O(numero_O);
                    miOrden[posicion].miEmpleado.setNombre(nombre_E);
                    miOrden[posicion].miEmpleado.setApellido(apellido_E);
                    miOrden[posicion].miEmpleado.setCedula(cedula_E);
                    miOrden[posicion].miEmpleado.setHorario(horario);

                    numero_O = numero_O + 1;
                    posicion++;

                    if (numero_O == 11) {
                        JOptionPane.showMessageDialog(null, "Limite de ordenes alcanzado.");
                        posicion = 0;
                        JOptionPane.showMessageDialog(null, "Se han reiniciado con exito las ordenes.");
                        break;
                    }

                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada." + "\n" + "1-Seguir elaboracion de orden." + "\n" + "2- Finalizar orden"));

                    if (opcion == 1) {
                        JOptionPane.showMessageDialog(null, "Siguiente orden #" + numero_O);
                    }
                    if (opcion == 2) {
                        limite = true;
                    }
                }
            }


            if (opciones == 2) {
                boolean salida2 = false;

                while (!salida2) {

                    int eleccion = Integer.parseInt(JOptionPane.showInputDialog
                            (
                                    "Ordenes por mesa" + "\n" + "\n" +
                                            "*-" + miOrden[0].getNumero_O() + " " + miOrden[0].getNombre_C() + " " + miOrden[0].getApellido_C() + " " + miOrden[0].getDireccion() + "\n" +
                                            "*-" + miOrden[1].getNumero_O() + " " + miOrden[1].getNombre_C() + " " + miOrden[1].getApellido_C() + " " + miOrden[1].getDireccion() + "\n" +
                                            "*-" + miOrden[2].getNumero_O() + " " + miOrden[2].getNombre_C() + " " + miOrden[2].getApellido_C() + " " + miOrden[2].getDireccion() + "\n" +
                                            "*-" + miOrden[3].getNumero_O() + " " + miOrden[3].getNombre_C() + " " + miOrden[3].getApellido_C() + " " + miOrden[3].getDireccion() + "\n" +
                                            "*-" + miOrden[4].getNumero_O() + " " + miOrden[4].getNombre_C() + " " + miOrden[4].getApellido_C() + " " + miOrden[4].getDireccion() + "\n" +
                                            "*-" + miOrden[5].getNumero_O() + " " + miOrden[5].getNombre_C() + " " + miOrden[5].getApellido_C() + " " + miOrden[5].getDireccion() + "\n" +
                                            "*-" + miOrden[6].getNumero_O() + " " + miOrden[6].getNombre_C() + " " + miOrden[6].getApellido_C() + " " + miOrden[6].getDireccion() + "\n" +
                                            "*-" + miOrden[7].getNumero_O() + " " + miOrden[7].getNombre_C() + " " + miOrden[7].getApellido_C() + " " + miOrden[7].getDireccion() + "\n" +
                                            "*-" + miOrden[8].getNumero_O() + " " + miOrden[8].getNombre_C() + " " + miOrden[8].getApellido_C() + " " + miOrden[8].getDireccion() + "\n" +
                                            "*-" + miOrden[9].getNumero_O() + " " + miOrden[9].getNombre_C() + " " + miOrden[9].getApellido_C() + " " + miOrden[9].getDireccion() + "\n" + "\n" +
                                            "1- Salir \n" + "2- Agregar productos"

                            ));


                    if (eleccion == 1) {
                        salida2 = true;
                    }
                    if (eleccion == 2) {
                        int eleccion2 = Integer.parseInt(JOptionPane.showInputDialog
                                (
                                        "Escriba el numero de la orden que desea agregar el producto" + "\n" + "\n" +
                                                "1-" + miOrden[0].getNumero_O() + " " + miOrden[0].getNombre_C() + " " + miOrden[0].getApellido_C() + " " + miOrden[0].getDireccion() + "\n" +
                                                "2-" + miOrden[1].getNumero_O() + " " + miOrden[1].getNombre_C() + " " + miOrden[1].getApellido_C() + " " + miOrden[1].getDireccion() + "\n" +
                                                "3-" + miOrden[2].getNumero_O() + " " + miOrden[2].getNombre_C() + " " + miOrden[2].getApellido_C() + " " + miOrden[2].getDireccion() + "\n" +
                                                "4-" + miOrden[3].getNumero_O() + " " + miOrden[3].getNombre_C() + " " + miOrden[3].getApellido_C() + " " + miOrden[3].getDireccion() + "\n" +
                                                "5-" + miOrden[4].getNumero_O() + " " + miOrden[4].getNombre_C() + " " + miOrden[4].getApellido_C() + " " + miOrden[4].getDireccion() + "\n" +
                                                "6-" + miOrden[5].getNumero_O() + " " + miOrden[5].getNombre_C() + " " + miOrden[5].getApellido_C() + " " + miOrden[5].getDireccion() + "\n" +
                                                "7-" + miOrden[6].getNumero_O() + " " + miOrden[6].getNombre_C() + " " + miOrden[6].getApellido_C() + " " + miOrden[6].getDireccion() + "\n" +
                                                "8-" + miOrden[7].getNumero_O() + " " + miOrden[7].getNombre_C() + " " + miOrden[7].getApellido_C() + " " + miOrden[7].getDireccion() + "\n" +
                                                "9-" + miOrden[8].getNumero_O() + " " + miOrden[8].getNombre_C() + " " + miOrden[8].getApellido_C() + " " + miOrden[8].getDireccion() + "\n" +
                                                "10-" + miOrden[9].getNumero_O() + " " + miOrden[9].getNombre_C() + " " + miOrden[9].getApellido_C() + " " + miOrden[9].getDireccion() + "\n"

                                ));
                        if (eleccion2 < 11) {
                            boolean salida3 = false;

                            while (!salida3) {
                                int eleccion3 = Integer.parseInt(JOptionPane.showInputDialog
                                        (
                                                "Lista de productos " + "\n" + "\n" +
                                                        "1 - Coca Cola" + "\n" +
                                                        "2 - Ginger el" + "\n" +
                                                        "3 - Papas fritas" + "\n" +
                                                        "4 - Pasta" + "\n" +
                                                        "5 - Nachos" + "\n" +
                                                        "6 - Ensalada" + "\n" +
                                                        "7 - Pizza" + "\n" +
                                                        "8 - Bebidas Naturales" + "\n" +
                                                        "9 - Salir"
                                        ));
                                boolean comprobacion1 = false;
                                int conteo = 0;
                                switch (eleccion3) {
                                    case (1):
                                        int coca = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int cocacola = miArti.getCoca();

                                        int operacion = coca * cocacola;
                                        int N_orden = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden][conteo] == 0) {
                                                miArticulo[N_orden][conteo] = operacion;
                                                Pagar[N_orden][0] = operacion;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (2):
                                        int ginger = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int gingerel = miArti.getGingerel();

                                        int operacion2 = ginger * gingerel;
                                        int N_orden2 = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden2][conteo] == 0) {
                                                miArticulo[N_orden2][conteo] = operacion2;
                                                Pagar[N_orden2][1] = operacion2;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (3):
                                        int Papas = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int Papas_fritas = miArti.getPapas_fritas();

                                        int operacion3 = Papas * Papas_fritas;
                                        int N_orden3 = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden3][conteo] == 0) {
                                                miArticulo[N_orden3][conteo] = operacion3;
                                                Pagar[N_orden3][2] = operacion3;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (4):
                                        int Pas = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int Pasta = miArti.getPasta();

                                        int operacion4 = Pas * Pasta;
                                        int N_orden4 = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden4][conteo] == 0) {
                                                miArticulo[N_orden4][conteo] = operacion4;
                                                Pagar[N_orden4][3] = operacion4;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (5):
                                        int Nacho = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int Nachos = miArti.getNachos();

                                        int operacion5 = Nacho * Nachos;
                                        int N_orden5 = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden5][conteo] == 0) {
                                                miArticulo[N_orden5][conteo] = operacion5;
                                                Pagar[N_orden5][4] = operacion5;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (6):
                                        int Ensala = Integer.parseInt(JOptionPane.showInputDialog
                                                (
                                                        "Ingrese la cantidad deseada: "
                                                ));
                                        int Ensalada = miArti.getNachos();

                                        int operacion6 = Ensala * Ensalada;
                                        int N_orden6 = eleccion2 - 1;
                                        JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                            System.out.print(N_orden);

                                        while (!comprobacion1) {
                                            if (miArticulo[N_orden6][conteo] == 0) {
                                                miArticulo[N_orden6][conteo] = operacion6;
                                                Pagar[N_orden6][5] = operacion6;
                                                comprobacion1 = true;
                                            }
                                            conteo++;
                                        }
                                        break;
                                    case (7):
                                        boolean salida_Pizza = false;
                                        while (!salida_Pizza) {
                                            int eleccion_Pizza = Integer.parseInt(JOptionPane.showInputDialog
                                                    (
                                                            "Lista de sabores de Pizzas " + "\n" + "\n" +
                                                                    "1 - Suprema" + "\n" +
                                                                    "2 - Pepperoni" + "\n" +
                                                                    "3 - Vegetariana" + "\n" +
                                                                    "4 - Con papas" + "\n" +
                                                                    "5 - Salir"
                                                    ));

                                            switch (eleccion_Pizza) {
                                                case (1):
                                                    int Pizza_Supre = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Pizza_Suprema = miArti.miPizza.getSuprema();

                                                    int operacion7_1 = Pizza_Supre * Pizza_Suprema;
                                                    int N_orden7_1 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden7_1][conteo] == 0) {
                                                            miArticulo[N_orden7_1][conteo] = operacion7_1;
                                                            Pagar[N_orden7_1][6] = operacion7_1;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (2):
                                                    int Pizza_Pepe = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Pizza_Peperoni = miArti.miPizza.getPeperoni();

                                                    int operacion7_2 = Pizza_Pepe * Pizza_Peperoni;
                                                    int N_orden7_2 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden7_2][conteo] == 0) {
                                                            miArticulo[N_orden7_2][conteo] = operacion7_2;
                                                            Pagar[N_orden7_2][7] = operacion7_2;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (3):
                                                    int Pizza_Vege = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Pizza_Vegetarinan = miArti.miPizza.getPeperoni();

                                                    int operacion7_3 = Pizza_Vege * Pizza_Vegetarinan;
                                                    int N_orden7_3 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden7_3][conteo] == 0) {
                                                            miArticulo[N_orden7_3][conteo] = operacion7_3;
                                                            Pagar[N_orden7_3][8] = operacion7_3;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (4):
                                                    int Pizza_Papas = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Pizza_Con_Papas = miArti.miPizza.getCon_papas();

                                                    int operacion7_4 = Pizza_Papas * Pizza_Con_Papas;
                                                    int N_orden7_4 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden7_4][conteo] == 0) {
                                                            miArticulo[N_orden7_4][conteo] = operacion7_4;
                                                            Pagar[N_orden7_4][9] = operacion7_4;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case(5):
                                                    salida_Pizza = true;
                                                    break;
                                                default:
                                                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion valida.");
                                            }
                                        }
                                        break;
                                    case (8):
                                        boolean salida_bebida = false;
                                        while (!salida_bebida) {
                                            int eleccion_Bebida = Integer.parseInt(JOptionPane.showInputDialog
                                                    (
                                                            "Lista de Bebidas " + "\n" + "\n" +
                                                                    "1 - Sandia" + "\n" +
                                                                    "2 - Piña" + "\n" +
                                                                    "3 - Mora" + "\n" +
                                                                    "4 - Tamarindo" + "\n" +
                                                                    "5 - Salir."
                                                    ));

                                            switch (eleccion_Bebida) {
                                                case (1):
                                                    int Bebida_Sandi = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Bebida_Sandia = miArti.miBebidaN.getSandia();

                                                    int operacion8_1 = Bebida_Sandi * Bebida_Sandia;
                                                    int N_orden8_1 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden8_1][conteo] == 0) {
                                                            miArticulo[N_orden8_1][conteo] = operacion8_1;
                                                            Pagar[N_orden8_1][10] = operacion8_1;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (2):
                                                    int Bebida_Pi = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Bebida_Pina = miArti.miBebidaN.getPina();

                                                    int operacion8_2 = Bebida_Pi * Bebida_Pina;
                                                    int N_orden8_2 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden8_2][conteo] == 0) {
                                                            miArticulo[N_orden8_2][conteo] = operacion8_2;
                                                            Pagar[N_orden8_2][11] = operacion8_2;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (3):
                                                    int Bebida_Mo = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Bebida_Mora = miArti.miBebidaN.getPina();

                                                    int operacion8_3 = Bebida_Mo * Bebida_Mora;
                                                    int N_orden8_3 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden8_3][conteo] == 0) {
                                                            miArticulo[N_orden8_3][conteo] = operacion8_3;
                                                            Pagar[N_orden8_3][12] = operacion8_3;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (4):
                                                    int Bebida_Tama = Integer.parseInt(JOptionPane.showInputDialog
                                                            (
                                                                    "Ingrese la cantidad deseada: "
                                                            ));
                                                    int Bebida_Tamarindo = miArti.miBebidaN.getPina();

                                                    int operacion8_4 = Bebida_Tama * Bebida_Tamarindo;
                                                    int N_orden8_4 = eleccion2 - 1;
                                                    JOptionPane.showMessageDialog(null, "¡Anotado!");
//                                                   System.out.print(N_orden);

                                                    while (!comprobacion1) {
                                                        if (miArticulo[N_orden8_4][conteo] == 0) {
                                                            miArticulo[N_orden8_4][conteo] = operacion8_4;
                                                            Pagar[N_orden8_4][13]= operacion8_4;
                                                            comprobacion1 = true;
                                                        }
                                                        conteo++;
                                                    }
                                                    break;
                                                case (5):
                                                    salida_bebida = true;
                                                    break;
                                                default:
                                                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion valida.");
                                            }

                                        }
                                        break;
                                    case(9):
                                        salida3 = true;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion valida.");
                                }
//
                            }
                        }

                    }

                }
            }



            if (opciones == 3) {
                boolean salirF = false;

                while (!salirF) {
                    int eleccionFac = Integer.parseInt(JOptionPane.showInputDialog
                            ("Ordenes por mesa" + "\n" + "\n" +
                                    "*-" + miOrden[0].getNumero_O() + " " + miOrden[0].getNombre_C() + " " + miOrden[0].getApellido_C() + "\n" +
                                    "*-" + miOrden[1].getNumero_O() + " " + miOrden[1].getNombre_C() + " " + miOrden[1].getApellido_C() + "\n" +
                                    "*-" + miOrden[2].getNumero_O() + " " + miOrden[2].getNombre_C() + " " + miOrden[2].getApellido_C() + "\n" +
                                    "*-" + miOrden[3].getNumero_O() + " " + miOrden[3].getNombre_C() + " " + miOrden[3].getApellido_C() + "\n" +
                                    "*-" + miOrden[4].getNumero_O() + " " + miOrden[4].getNombre_C() + " " + miOrden[4].getApellido_C() + "\n" +
                                    "*-" + miOrden[5].getNumero_O() + " " + miOrden[5].getNombre_C() + " " + miOrden[5].getApellido_C() + "\n" +
                                    "*-" + miOrden[6].getNumero_O() + " " + miOrden[6].getNombre_C() + " " + miOrden[6].getApellido_C() + "\n" +
                                    "*-" + miOrden[7].getNumero_O() + " " + miOrden[7].getNombre_C() + " " + miOrden[7].getApellido_C() + "\n" +
                                    "*-" + miOrden[8].getNumero_O() + " " + miOrden[8].getNombre_C() + " " + miOrden[8].getApellido_C() + "\n" +
                                    "*-" + miOrden[9].getNumero_O() + " " + miOrden[9].getNombre_C() + " " + miOrden[9].getApellido_C() + "\n" + "\n" +
                                    "1- Salir \n" + "2- Imprimir Factura."
                            ));
                    if (eleccionFac == 1) {
                        salirF = true;
                    }
                    if (eleccionFac == 2) {
                        int eleccionFac2 = Integer.parseInt(JOptionPane.showInputDialog
                                ("Ordenes por mesa" + "\n" + "\n" +
                                        "1-" + miOrden[0].getNumero_O() + " " + miOrden[0].getNombre_C() + " " + miOrden[0].getApellido_C() + "\n" +
                                        "2-" + miOrden[1].getNumero_O() + " " + miOrden[1].getNombre_C() + " " + miOrden[1].getApellido_C() + "\n" +
                                        "3-" + miOrden[2].getNumero_O() + " " + miOrden[2].getNombre_C() + " " + miOrden[2].getApellido_C() + "\n" +
                                        "4-" + miOrden[3].getNumero_O() + " " + miOrden[3].getNombre_C() + " " + miOrden[3].getApellido_C() + "\n" +
                                        "5-" + miOrden[4].getNumero_O() + " " + miOrden[4].getNombre_C() + " " + miOrden[4].getApellido_C() + "\n" +
                                        "6-" + miOrden[5].getNumero_O() + " " + miOrden[5].getNombre_C() + " " + miOrden[5].getApellido_C() + "\n" +
                                        "7-" + miOrden[6].getNumero_O() + " " + miOrden[6].getNombre_C() + " " + miOrden[6].getApellido_C() + "\n" +
                                        "8-" + miOrden[7].getNumero_O() + " " + miOrden[7].getNombre_C() + " " + miOrden[7].getApellido_C() + "\n" +
                                        "9-" + miOrden[8].getNumero_O() + " " + miOrden[8].getNombre_C() + " " + miOrden[8].getApellido_C() + "\n" +
                                        "10-" + miOrden[9].getNumero_O() + " " + miOrden[9].getNombre_C() + " " + miOrden[9].getApellido_C() + "\n" + "\n" +
                                        "Seleccione la orden a la que desea imprimir la factura."
                                ));

                        if (eleccionFac2 <11) {
                            int orden = eleccionFac2 - 1;
                            int Total = Pagar[orden][0] + Pagar[orden][1] + Pagar[orden][2] + Pagar[orden][3] + Pagar[orden][4] + Pagar[orden][5] + Pagar[orden][6] + Pagar[orden][7] + Pagar[orden][8] + Pagar[orden][9] + Pagar[orden][10] + Pagar[orden][11] + Pagar[orden][12] + Pagar[orden][13] ;

                            Date fecha = new Date();
                            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss", Locale.getDefault());

                            //El siguiente codigo debe ser llenado con la ruta en donde desea que se guarden las facturas y por ultimo el nombre del archivo. ¡¡¡No cambiar lo de /Factura " + formatoFecha.format(fecha) + ".txt" POR FAVOR !!!
                            PrintWriter writer = new PrintWriter("D:/Documentos varios/Fidelitas/Segundo cuatri/Introduccion a la Programacion/Facturas/Factura " + formatoFecha.format(fecha) + ".txt", "UTF-8");

                            JOptionPane.showMessageDialog(null, "" +"\n" +
                                    "--------------------------------------------------" +"\n" +
                                    "|       Factura #"+ Math.random()*1000 +"\n" +
                                    "|Nombre del cliente: " + miOrden[orden].getNombre_C() +"\n" +
                                    "|Apellido del cliente: " + miOrden[orden].getApellido_C() +"\n" +
                                    "|Telefono del cliente: " + miOrden[orden].getTelefono_C() +"\n" +
                                    "|Direccion electronica del cliente: " + miOrden[orden].getDireccion() +"\n" +
                                    "|" +"\n" +
                                    "|Nombre del trabajador: " + miOrden[orden].miEmpleado.getNombre() +"\n" +
                                    "|Apellido del trabajador: " + miOrden[orden].miEmpleado.getApellido() +"\n" +
                                    "|Cedula del trabajador: " + miOrden[orden].miEmpleado.getCedula() +"\n" +
                                    "|Total de dinero a pagar: " + Total +"\n" +
                                    "--------------------------------------------------");

                            writer.println("--------------------------------------------------");
                            writer.println("|     Factura #"+ Math.random()*1000 +"            ");
                            writer.println("|Nombre del cliente: " + miOrden[orden].getNombre_C());
                            writer.println("|Apellido del cliente: " + miOrden[orden].getApellido_C());
                            writer.println("|Telefono del cliente: " + miOrden[orden].getTelefono_C());
                            writer.println("|Direccion electronica del cliente: " + miOrden[orden].getDireccion());
                            writer.println("|  ");
                            writer.println("|Nombre del trabajador: " + miOrden[orden].miEmpleado.getNombre());
                            writer.println("|Apellido del trabajador: " + miOrden[orden].miEmpleado.getApellido());
                            writer.println("|Cedula del trabajador: " + miOrden[orden].miEmpleado.getCedula());
                            writer.println("|  ");
                            writer.println("|Total de dinero a pagar: " + Total);
                            writer.println("--------------------------------------------------");
                            writer.close();

                            break;
                        }

                    }

                }
            }


            if (opciones == 4) {
                JOptionPane.showMessageDialog(null, " ¡Gracias por usar el programa, vuelva pronto! ");
                salir1 = true;

            }

        }
    }
}
