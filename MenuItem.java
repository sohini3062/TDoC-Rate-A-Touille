/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rat.models;

/**
 *
 * @author pakhe
 */
public class MenuItem {
    private int id;
    private String name;
    private double price;
    public MenuItem(int id, String name, double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void setName(String name)
    {
        this.name=name;
        
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void DisplayDetails()
    {
          System.out.println(id+" "+name+" "+price);
    }
    
}
