package CRUD_DAK;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Nama tabel di database
public class User {

    // Anotasi @Id untuk primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment untuk ID
    private Long id;

    // Kolom untuk nama
    @Column(name = "name", nullable = false) // nullable = false artinya wajib diisi
    private String name;

    // Kolom untuk email
    @Column(name = "email", nullable = false, unique = true) // Email harus unik
    private String email;

    // Constructor kosong (wajib untuk JPA)
    public User() {
    }

    // Constructor dengan parameter
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters dan Setters untuk setiap field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
