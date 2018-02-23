/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanomina;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class validaciones {
    public void SoloLetras(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"No introducir numeros");
                }
            }
        });
    
}

public void SoloNumeros(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                int aux=-1;
                char c=e.getKeyChar();
                if(c=='.'){
                        aux++;
                    }
                if((!Character.isDigit(c) && c!='.')  ||(c=='.'&& cam.getText().contains("."))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"No introducir letras");
                    
                }
            }
        });
    }
    
   public void longitud(JTextField cam,int lim){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                int can=cam.getText().length();
                if(can>lim){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Excedio el Limite de longitud");
                }
            }
        });
    } 
}
