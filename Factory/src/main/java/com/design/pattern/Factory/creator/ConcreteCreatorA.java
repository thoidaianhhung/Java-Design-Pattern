package com.design.pattern.Factory.creator;

import com.design.pattern.Factory.product.ConcreteProductA;
import com.design.pattern.Factory.product.Product;

public class ConcreteCreatorA implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
