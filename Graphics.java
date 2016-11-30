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
        
    String arr[] = new String[]{"/javaapplication1/images/image1.png",
                                    "/javaapplication1/images/image2.png",
                                    "/javaapplication1/images/image3.png",
                                    "/javaapplication1/images/image4.png",
                                    "/javaapplication1/images/image5.png",
                                    "/javaapplication1/images/image6.png",
                                    "/javaapplication1/images/image7.png",
                                    "/javaapplication1/images/image8.png"};
    String hangimg(int count) {
        return arr[count-1];
    }
    
}
