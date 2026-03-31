/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwriteantfile;

/**
 *
 * @author llujan2027
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadWriteAntFile {
    public static void main(String[] args) {
        String contactsPath = "Contacts/contacts.txt";
        String name, email, gradYear, username;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input contact's full name.");
        name = scan.nextLine();
        System.out.println("Please input contact's email address.");
        email = scan.nextLine();
        System.out.println("Please input contact's graduation year.");
        gradYear = scan.nextLine();
        System.out.println("Please input contact's username.");
        username = scan.nextLine();
        
        //Write to contacts.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(contactsPath,
        true))) {
            //writer.write(contentToWrite);
            
            writer.append(name +", "+ email +", "+ gradYear +", "+ username + "\n");
            System.out.println("Successfully wrote to the file." +
            name +", "+ email +", "+ gradYear +", "+ username);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " +
            e.getMessage());
        }
        
        // Read from contacts.txt
        try (BufferedReader reader = new BufferedReader(new
            FileReader(contactsPath))) {
            String line;
            System.out.println("\nReading from the file:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: "
            + e.getMessage());
        }
    }
}
