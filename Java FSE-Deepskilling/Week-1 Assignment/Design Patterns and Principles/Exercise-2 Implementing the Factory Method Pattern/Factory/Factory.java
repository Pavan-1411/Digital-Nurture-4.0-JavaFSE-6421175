package Factory;

import Documents.DocumentFactory;
import Documents.WordDocument;
import Documents.PdfDocument;
import Documents.ExcelDocument;


public class Factory {
    public static DocumentFactory getInstance(String type)
    {
        if(type.equalsIgnoreCase("Word"))
        {
            return new WordDocument();
        }
        else if(type.equalsIgnoreCase("Pdf"))
        {
            return new PdfDocument();
        }
        else
        {
            return new ExcelDocument();
        }
    }
}

