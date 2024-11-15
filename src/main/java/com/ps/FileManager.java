package com.ps;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManager {
    public static void writeReceiptToFile(String receipt) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String fileName = "receipt" + timeStamp + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(receipt);
            System.out.println("Receipt has been written to " + fileName);

        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
}