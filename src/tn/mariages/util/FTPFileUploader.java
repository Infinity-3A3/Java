package tn.mariages.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPConnectionClosedException;
import org.apache.commons.net.ftp.FTPFile;

public class FTPFileUploader  {
   
    public static FTPFileUploader instance;
    FTPClient client = new FTPClient();
    FileInputStream fis = null;
    boolean result;
    private String ftpServerAddress="FTP.mariages.tn"; 
    private String userName="user@mariages.tn"; 
    private String password="infinityFTP3A3"; // a rajouter 
     /*
                Changer le pwd puis right click > Git > Ignore > Exclude from commit
            */
                
   public static FTPFileUploader getInstance() { //sing
        if(instance==null)
        {
            instance = new FTPFileUploader();
        }
        return instance;
    }
                
        public boolean UploadPic(String picLocalLink, String Dir) throws IOException  {
             try {
                client.connect(ftpServerAddress);
                result = client.login(userName, password);

                if (result == true) {
                        System.out.println("Successfully logged in!");
                } else {
                        System.out.println("Login Fail!");
                        return false;
                }
                       client.setFileType(FTP.BINARY_FILE_TYPE);

                       client.changeWorkingDirectory(Dir); //img for imgs ... expl 
                       // profilepic ... etc / to be fixed 


                File file = new File(picLocalLink);
                String testName = file.getName();
                fis = new FileInputStream(file);

                // Upload file to the ftp server
                result = client.storeFile(testName, fis);

                if (result == true) {
                        System.out.println("File is uploaded successfully");
                } else {
                        System.out.println("File uploading failed");

                }
                client.logout();
        } catch (FTPConnectionClosedException e) {
                        System.out.println(e);
        } finally {
                try {
                        client.disconnect();
                } catch (FTPConnectionClosedException e) {
                }
             }
                        return result;
        }

    public boolean GetAllRemotePic() throws IOException  {

try {
                client.connect(ftpServerAddress);
                result = client.login(userName, password);

                if (result == true) {
                        System.out.println("Successfully logged in!");
                } else {
                        System.out.println("Login Fail!");
                        return false;
                }
                       client.setFileType(FTP.BINARY_FILE_TYPE);
                       client.enterLocalPassiveMode();
                       client.changeWorkingDirectory("/img");


                //get list of filenames
            FTPFile[] ftpFiles = client.listFiles();

            if (ftpFiles != null && ftpFiles.length > 0) {
                //loop thru files
                for (FTPFile file : ftpFiles) {
                    if (!file.isFile()) {
                        continue;
                    }
                    System.out.println("File is " + file.getName());
                    //get output stream
                    OutputStream output;
                    output = new FileOutputStream("FtpFiles" + "/" + file.getName());
                    //get the file from the remote system
                   result = client.retrieveFile(file.getName(), output);
                    //close output stream
                    output.close();

                    //delete the file
                    // ftp.deleteFile(file.getName());

                }
            }

                if (result == true) {
                        System.out.println("File retrived successfully");
                } else {
                        System.out.println("File failed to get");

                }
                client.logout();
        } catch (FTPConnectionClosedException e) {
                        System.out.println(e);
        } finally {
                try {
                        client.disconnect();
                } catch (FTPConnectionClosedException e) {
                }
             }
                        return result;
    }

    
   
}