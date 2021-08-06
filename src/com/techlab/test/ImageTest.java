package com.techlab.test;

import com.techlab.model.Image;
import com.techlab.model.ProxyImage;
import com.techlab.model.RealImage;

public class ImageTest {

	public static void main(String[] args) {
		//long startTime = System.currentTimeMillis();
		Image img1 = new RealImage("abc.jpeg");
		Image img2 = new RealImage("xyz.jpeg");
		Image img3 = new RealImage("def.jpeg");
		img3.display();
		//long stopTime = System.currentTimeMillis();
		//System.out.println("Total time required for creating Real Image Object: "+(startTime + stopTime));
		
		//startTime = System.currentTimeMillis();
		Image img4 = new ProxyImage("1.jpeg");
		Image img5 = new ProxyImage("2.jpeg");
		Image img6 = new ProxyImage("3.jpeg");
		img6.display();
		img6.display();
		//stopTime = System.currentTimeMillis();
		//System.out.println("Total time required for creating Proxy Image Object: "+(startTime + stopTime));
	}

}
