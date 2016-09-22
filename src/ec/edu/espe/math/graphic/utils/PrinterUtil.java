/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.graphic.utils;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author SONY
 */
public class PrinterUtil {
    public static void printResults(JTextField first, JTextField second,Float a, Float b){
        first.setText(a.toString());
        second.setText(b.toString());
    }
    public static void setLabels(JLabel lbl1, JLabel lbl2, JLabel lbl3,String s1, String s2, String s3){
        lbl1.setText(s1);
        lbl2.setText(s2);
        lbl3.setText(s3);
    }
}
