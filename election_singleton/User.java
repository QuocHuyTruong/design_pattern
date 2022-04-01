/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package election_singleton;

/**
 *
 * @author DELL
 */
public class User {
    String name;
    public  User(String name){
        this.name=name;
    }
    public void Vote(Canadidate canadidate){
        Election election = Election.getIntance();
        election.Vote(canadidate, this);
    }
}
