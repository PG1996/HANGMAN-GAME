/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Parth Goel
 */
public class Graphics {
        
    String arr[] = new String[]{"/images/image1.png",
                                    "/images/image2.png",
                                    "/images/image3.png",
                                    "/images/image4.png",
                                    "/images/image5.png",
                                    "/images/image6.png",
                                    "/images/image7.png",
                                    "/images/image8.png"};
    String hangimg(int count) {
        return arr[count-1];
    }
    
}
