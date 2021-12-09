package br.com.springboot.elearningspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Transient
    private Long user_id;
    private String name;
    private String email;
    private String feedback;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
