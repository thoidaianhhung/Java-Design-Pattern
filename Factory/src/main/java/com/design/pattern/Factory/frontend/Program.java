package com.design.pattern.Factory.frontend;

import com.design.pattern.Factory.creator.ConcreteCreatorA;
import com.design.pattern.Factory.creator.ConcreteCreatorB;
import com.design.pattern.Factory.creator.Creator;
import com.design.pattern.Factory.product.Product;

public class Program {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.display();
    }
}
