package com.company.Builders;
import com.company.Builders.HouseBuilder;
import com.company.Product.House;
public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Done");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carving");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
