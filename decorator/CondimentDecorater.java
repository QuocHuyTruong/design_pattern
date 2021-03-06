/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author DELL
 */
public abstract class CondimentDecorater extends Beverage{
    Beverage beverage;


    public CondimentDecorater(Beverage beverage,String description) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " " + this.description;
    }
    
    
}
