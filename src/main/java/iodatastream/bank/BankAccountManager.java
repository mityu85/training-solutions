package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount bankAccount, Path folder) {
        Path path = folder.resolve(bankAccount.getAccountNumber() + ".dat");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            dos.writeUTF(bankAccount.getAccountNumber());
            dos.writeUTF(bankAccount.getName());
            dos.writeDouble(bankAccount.getBalance());
        } catch (IOException e) {
            throw new IllegalStateException("File can not write");
        }
    }

    public BankAccount loadAccount(InputStream inputStream) {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(inputStream))) {
            return new BankAccount(dis.readUTF(), dis.readUTF(), dis.readDouble());
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
