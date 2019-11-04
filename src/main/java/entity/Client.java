package entity;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodClient;

    @Column(name = "FIO_Client")
    private String FIO_Client;

    @Column(name = "Pol")
    private String Pol;

    @Column(name = "Telefon", length = 18)
    private String Telefon;

    @Column(name = "Rost")
    private Long Rost;

    @Column(name = "Ves")
    private Long Ves;

    @Column(name = "Age")
    private Long Age;

    public Client() {

    }

    public Long getCodClient() {
        return CodClient;
    }

    public void setCodClient(Long codClient) {
        CodClient = codClient;
    }

    public String getFIO_Client() {
        return FIO_Client;
    }

    public void setFIO_Client(String fIO_Client) {
        FIO_Client = fIO_Client;
    }

    public String getPol() {
        return Pol;
    }

    public void setPol(String pol) {
        Pol = pol;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    public Long getRost() {
        return Rost;
    }

    public void setRost(Long rost) {
        Rost = rost;
    }

    public Long getVes() {
        return Ves;
    }

    public void setVes(Long ves) {
        Ves = ves;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Client [CodClient=" + CodClient + ", FIO_Client=" + FIO_Client + ", Pol=" + Pol + ", Telefon=" + Telefon
                + ", Rost=" + Rost + ", Ves=" + Ves + ", Age=" + Age + "]";
    }


}
