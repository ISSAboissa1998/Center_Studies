/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package research_center;


public class Research_Center {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         login LoginFrame = new login();
         LoginFrame.setVisible(true);
         LoginFrame.pack();
         LoginFrame.setLocationRelativeTo(null);
        ///TODO code application logic here
       // java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }
    
}
