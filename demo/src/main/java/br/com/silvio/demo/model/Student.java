package br.com.silvio.demo.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Student extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @NotNull
    @NotEmpty(message = "O nome do estudante é obrigatório")
    private String name;
    @NotEmpty(message = "O email do estudante é obrigatório")
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
