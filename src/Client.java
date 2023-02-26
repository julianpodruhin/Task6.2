//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.PrintStream;

public class Client implements Human {
    private String bankName;
    private String name;
    private String lastname;

    public Client(String name, String lastname, String bankName) {
        this.bankName = bankName;
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void getAllInfo() {
        System.out.println("Название банка: " + this.bankName);
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("Клиент: " + var10001 + " " + this.getLastname());
    }
}
