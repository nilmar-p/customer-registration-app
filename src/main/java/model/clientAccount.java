package model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ClientAccount {

    @JsonProperty("client_id")
    protected int client_id;
    @JsonProperty("name")
    protected String name;
    @JsonProperty("cpf")
    protected String cpf;
    @JsonProperty("email")
    protected String email;
    @JsonProperty("phone")
    protected String phone;
    @JsonProperty("gender")
    protected String gender;
    @JsonProperty("street")
    protected String street;
    @JsonProperty("neighborhood")
    protected String neighborhood;
    @JsonProperty("houseNumber")
    protected String houseNumber;
    @JsonProperty("cep")
    protected String cep;
    @JsonProperty("city")
    protected String city;

    @JsonCreator
    public ClientAccount(
            @JsonProperty("name") String name,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("email") String email,
            @JsonProperty("phone") String phone,
            @JsonProperty("gender") String gender,
            @JsonProperty("street") String street,
            @JsonProperty("neighborhood") String neighborhood,
            @JsonProperty("houseNumber") String houseNumber,
            @JsonProperty("cep") String cep,
            @JsonProperty("city") String city
    ) throws IOException {
        this.client_id = generateUniqueClientId();
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.street = street;
        this.neighborhood = neighborhood;
        this.houseNumber = houseNumber;
        this.cep = cep;
        this.city = city;
    }

    public ClientAccount(
            int client_id,
            String name,
            String cpf,
            String email,
            String phone,
            String gender,
            String street,
            String neighborhood,
            String houseNumber,
            String cep,
            String city
    ) throws IOException {
        this.client_id = client_id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.street = street;
        this.neighborhood = neighborhood;
        this.houseNumber = houseNumber;
        this.cep = cep;
        this.city = city;
    }

    // Método para gerar um ID aleatório
    private int generateUniqueClientId() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            Path fileLocation = Paths.get("C:\\data-java-project\\file.json");
            Files.createDirectories(fileLocation.getParent());

            List<ClientAccount> accounts = new ArrayList<>();

            int newId;
            boolean idExists;

            do {
                newId = ThreadLocalRandom.current().nextInt(1000, 10000);
                idExists = false;

                for (ClientAccount account : accounts) {
                    if (account.getClient_id() == newId) {
                        idExists = true;
                        break;
                    }
                }
            } while (idExists);

            return newId;

        } catch (Exception e) {
            System.out.println("ERRO NA CRIACAO DE ID");
            return ThreadLocalRandom.current().nextInt(1000, 10000);
        }
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "ClientAccount{"
                + ", client_id='" + client_id + '\''
                + ", name='" + name + '\''
                + ", cpf='" + cpf + '\''
                + ", email='" + email + '\''
                + ", phone=" + phone
                + "gender='" + gender + '\''
                + ", street='" + street + '\''
                + ", neighborhood='" + neighborhood + '\''
                + ", houseNumber=" + houseNumber
                + ", cep='" + cep + '\''
                + ", city='" + city + '\''
                + '}';
    }

}
