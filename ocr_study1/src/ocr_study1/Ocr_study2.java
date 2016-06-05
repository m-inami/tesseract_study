package ocr_study1;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Ocr_study2 {

    public static void main(String[] args) {

    	File f = new File("C:\\Users\\masato\\Downloads\\j4locr_eval\\test.png");

    	ITesseract instance = new Tesseract();
    	instance.setLanguage("eng+jpn");

    	try {
    		String rt = instance.doOCR(f);
    		System.out.println(rt);
    	} catch (TesseractException e) {
    		System.err.println(e.getMessage());
    	}

    }
}