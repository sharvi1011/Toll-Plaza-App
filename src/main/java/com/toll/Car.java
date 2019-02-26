package com.toll;

class Car extends Vehicle {
    Car() {
        cost = 40; //cost variable of super class is overriden
        ++count;
        totcost+=cost;
    }
}
