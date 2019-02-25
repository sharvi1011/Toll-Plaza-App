package com.toll;

class Bus extends Vehicle{
    Bus()
    {
        cost=80; //cost variable of super class is overriden
        ++count;
        totcost+=cost;
    }
}
