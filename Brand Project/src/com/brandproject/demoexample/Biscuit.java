package com.brandproject.demoexample;

public class Biscuit {
	
	int bstock;
    String bname;
    int bprice;



    public Biscuit(int bstock, String bname, int bprice) {
        this.bstock = bstock;
        this.bname = bname;
        this.bprice = bprice;

    }

    public int getStock() {
        return bstock;
    }

    public String getName() {
        return bname;
    }

    public int getPrice() {
        return bprice;
    }


    @Override
    public String toString() {
        return bstock+" "+bname+" "+bprice;
    }

}
