/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package election_singleton;

/**
 *
 * @author DELL
 */
public class bt4_SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User s1 = new User("huy");
        s1.Vote(Canadidate.Donaltrum);
        System.out.println("thang trum"+ Election.getIntance().getDol());
        System.out.println("thang joe"+ Election.getIntance().getJoe());
    }
    
}
