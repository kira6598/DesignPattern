package DesignPatterns.BehavioralPattern.Observer.User;

public class User {
    private String email;
    private String ip;
    private Login_Status status;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public Login_Status getStatus() {
        return status;
    }
    public void setStatus(Login_Status status) {
        this.status = status;
    }
    public User(String email, String ip, Login_Status status) {
        this.email = email;
        this.ip = ip;
        this.status = status;
    }
    public User() {
    }
}
