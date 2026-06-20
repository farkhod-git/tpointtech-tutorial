package com.tpointtech.filehandling.zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class CreateZIPDemo {
    static void main() {
        String path = "src/main/java/com/tpointtech/filehandling/zip/";

        try (FileOutputStream fos = new FileOutputStream(path + "zipandunzip/zip-text.zip");
             ZipOutputStream zos = new ZipOutputStream(fos)) {


            try (FileInputStream fis = new FileInputStream(path + "zip-text.txt");
                 BufferedInputStream bis = new BufferedInputStream(fis, 1024)) {

                ZipEntry ze = new ZipEntry(path + "zip-text.txt");
                //putting zipentry in zipoutputstream
                zos.putNextEntry(ze);
                byte[] data = new byte[1024];
                int count;
                while((count = bis.read(data, 0, 1024)) != -1)
                {
                    zos.write(data, 0, count);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // UnZip

        try (FileInputStream fis = new FileInputStream(path + "zipandunzip/zip-text.zip");
            ZipInputStream zis = new ZipInputStream(fis);
            FileOutputStream fos = new FileOutputStream(path + "zipandunzip/unzip-zip-text.txt");) {

            ZipEntry ze = zis.getNextEntry();
            System.out.println("ze.getName() = " + ze.getName());

            fos.write(zis.readAllBytes());

            zis.closeEntry();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
