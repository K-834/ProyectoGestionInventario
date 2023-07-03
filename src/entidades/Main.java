/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades;


import util.Memoria;
import vista.Login;

public class Main {

    public static void main(String[] args) {
        Memoria.put("E0001", "src\\imagenes\\PerfilC0001.png");
        Memoria.put("E0002", "src\\imagenes\\PerfilC0002.png");
        
//        String[][] datos = {
//    {"0", "Papa", "15", "12/05/2023", "1"},
//    {"1", "Camote", "30", "21/10/2023", "0"},
//    {"2", "Carne", "05", "08/09/2023", "1"},
//    {"3", "Manzana", "10", "15/06/2023", "1"},
//    {"4", "Cebolla", "20", "10/09/2023", "0"},
//    {"5", "Pollo", "03", "17/07/2023", "1"},
//    {"6", "Plátano", "25", "25/08/2023", "0"},
//    {"7", "Res", "07", "05/11/2023", "1"},
//    {"8", "Naranja", "12", "29/06/2023", "1"},
//    {"9", "Lechuga", "18", "14/10/2023", "0"},
//    {"10", "Cerdo", "04", "21/09/2023", "1"},
//    {"11", "Tomate", "30", "18/08/2023", "0"},
//    {"12", "Pera", "10", "02/12/2023", "1"},
//    {"13", "Zanahoria", "22", "30/07/2023", "1"},
//    {"14", "Atún", "02", "24/11/2023", "0"},
//    {"15", "Sandía", "05", "06/10/2023", "1"},
//    {"16", "Mango", "15", "12/07/2023", "0"},
//    {"17", "Camote", "08", "19/09/2023", "1"},
//    {"18", "Papa", "20", "28/12/2023", "1"},
//    {"19", "Papa", "10", "16/08/2023", "0"}
//}; 


//         inventario.setTablaComunicadas(datos);
//        System.out.println("Datos ingresados:");
//        for (int i = 0; i < datos.length; i++) {
//            for (int j = 0; j < datos[i].length; j++) {
//                System.out.print(datos[i][j] + " ");
//            }
//            System.out.println();
//        }
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }
}




