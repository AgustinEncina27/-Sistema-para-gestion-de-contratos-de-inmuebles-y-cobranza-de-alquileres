/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Agustin
 */
public class Controlador {
    FileInputStream entrada;
	FileOutputStream salida;
	File archivo;
	
	public byte[]AbrirAImagen(File archivo ){
		byte[] bytesImg= new byte[1024*1000];
		try {
			entrada = new FileInputStream(archivo);
			entrada.read(bytesImg);
		} catch (Exception e) {
			
		}
		return bytesImg;
	}
}
