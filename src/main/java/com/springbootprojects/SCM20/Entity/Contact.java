package com.springbootprojects.SCM20.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

    @Id
    private int id;
    private String name;
    private String phone;
    private String email;
    @Column(length=10000)
    private String picUrl;
    @Column(length=10000)
    private String about;
    private String isfavorite;
    private String instaProfileUrl;

    //mapping
    @ManyToOne
    private User user;

}
