package com.design.pattern.Factory.creator;

import com.design.pattern.Factory.product.ConcreteProductB;
import com.design.pattern.Factory.product.Product;

public class ConcreteCreatorB implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
