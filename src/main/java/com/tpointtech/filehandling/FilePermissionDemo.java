package com.tpointtech.filehandling;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionDemo {
    static void main() {

        // D:\IO\-   -> all files inside with subdirectories
        // D:\IO\*   -> all files inside but excludes subdirectories

        String path = "src/main/java/com/tpointtech/filehandling/permissions/-";
        FilePermission filePermission = new FilePermission(path, "read");
        PermissionCollection pc = filePermission.newPermissionCollection();
        pc.add(filePermission);


    }
}
