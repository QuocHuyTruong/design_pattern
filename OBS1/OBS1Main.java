/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBS1;

/**
 *
 * @author DELL
 */
public class OBS1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Topic topic = new Topic();
        ThanhvienA thanhvienA = new ThanhvienA();
        ThanhvienB thanhvienB = new ThanhvienB();
        topic.attach(thanhvienA);
        topic.attach(thanhvienB);
        topic.taotin("tin gi day");
        topic.taotin("tin gi day");
        topic.taotin("tin gi day");
        topic.taotin("tin gi day");
        topic.taotin("tin gi day");
        topic.taotin("tin gi day");

        topic.capnhat();
    }
    
}
