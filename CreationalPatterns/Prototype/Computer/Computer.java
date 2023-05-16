package DesignPatterns.CreationalPatterns.Prototype.Computer;

public class Computer implements Cloneable {    
    private String os;
    private String office;
    private String antivirus;
    private String browser;
    private String others;

    public Computer(String os, String office, String antivirus, String browser, String other) {
        super();
        this.os = os;
        this.office = office;
        this.antivirus = antivirus;
        this.browser = browser;
        this.others = other;
    }

    @Override
    protected Computer clone(){
        try {
            // method clone la cua Object class -- Shalow clone (chỉ copy primitive variable, Object variable thì tham chiếu cùng vùng nhớ)
            return (Computer) super.clone();// super.clone(); gọi phương thức clone của class cha(Object); ép kiểu sang Computer
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();;
        }
        return null;
    }
    @Override
    public String toString() {
        return "Computer [os=" + os + ", office=" + office + ", antivirus=" + antivirus + ", browser=" + browser
                + ", others=" + others + "]";
    }
 
    public void setOthers(String others) {
        this.others = others;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
    
        Computer computer = (Computer) o;
    
        if (os != null ? !os.equals(computer.os) : computer.os != null)
            return false;
        if (office != null ? !office.equals(computer.office) : computer.office != null)
            return false;
        if (antivirus != null ? !antivirus.equals(computer.antivirus) : computer.antivirus != null)
            return false;
        if (browser != null ? !browser.equals(computer.browser) : computer.browser != null)
            return false;
        return others != null ? others.equals(computer.others) : computer.others == null;
    }

}
