package ocr_study1;

import com.java4less.ocr.tess3.OCRFacade;

public class Ocr_study {

    public static void main(String[] args) {

        // create the facade object:
        OCRFacade facade = new OCRFacade();

        //run the OCR by providing an input file and language
        String text = facade.recognizeFile("C:\\Users\\masato\\Downloads\\j4locr_eval\\order.png", "eng");
        System.out.println("光学的文字認識結果は" + text + "です。");

    }
}