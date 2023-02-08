package com.utad.inso2.practica2;

import java.util.ArrayList;
import java.util.List;

public class Lampara {
	public static final Integer MAX_LAMPARAS = 5;
    private static Integer numLamparas;
    
	static {
		Lampara.numLamparas = 0;
	}
    
    public Lampara() {
    	Lampara.numLamparas++;
    }
    public int getNumLamparas() {
        return Lampara.numLamparas;
    }
  
	public static void main(String[] args) {
		List<Lampara> lamps = new ArrayList<Lampara>();
		for(Integer i = 0; i<(Lampara.MAX_LAMPARAS); i++) {
			lamps.add(new Lampara());
		}

		System.out.println ("Cantidad: " + Lampara.numLamparas);
	}
}