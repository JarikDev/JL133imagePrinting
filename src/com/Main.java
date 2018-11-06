package com;

import javax.print.*;
import java.awt.print.PrinterException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,PrintException,PrinterException{
        DocFlavor flavor=DocFlavor.INPUT_STREAM.JPEG;
        PrintService[] service= PrintServiceLookup.lookupPrintServices(flavor ,null);
        InputStream inputStream=new FileInputStream("smile.jpg");
        Doc doc=new SimpleDoc(inputStream,flavor,null);
        if(service.length>0){
            DocPrintJob job=service[0].createPrintJob();
            job.print(doc,null);
        }
    }
}



























