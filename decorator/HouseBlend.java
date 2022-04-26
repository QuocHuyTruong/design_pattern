/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author DELL
 */
public class HouseBlend extends Beverage{

    public HouseBlend(String description) {
        super(description);
    }



    @Override
    public int cost() {
        return 100;
    }

}
