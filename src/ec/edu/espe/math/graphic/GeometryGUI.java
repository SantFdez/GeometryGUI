/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.graphic;

import ec.edu.espe.math.graphic.forms.LoginScreen;
import ec.edu.espe.math.graphic.forms.shapes.MenuShape;
/**
 *
 * @author SONY
 */
public class GeometryGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // LoginScreen menu=new LoginScreen();
       MenuShape menu=new MenuShape(); 
       menu.setLocationRelativeTo(null);
        menu.setVisible(true);
       
    }
    
}
