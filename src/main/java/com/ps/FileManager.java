package com.ps;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void writeReceiptToFile(String receipt) {
        String fileName = "receipt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(receipt);
            System.out.println("Receipt has been written to" + fileName);

        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
}