package br.com.springboot.elearningspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String address;
    private String email;
    private String phone;
    @CreationTimestamp
    private Date reg_date;
    private String uploadPhoto;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Contact> contact;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Feedback> feedback;
}
