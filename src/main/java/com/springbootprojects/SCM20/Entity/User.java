package com.springbootprojects.SCM20.Entity;

import java.util.*;
import java.util.HashMap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private int userId;
    private String password;
    @Column(nullable=false)
    private String fullName;
    @Column(unique = true, nullable = false)
    private String email;
    // for things like isAdmin? isEnabled? isVerified? 
    private HashMap<String,Boolean> attributes; 
    @Column(length=10000)
    private String profilePicUrl;
    private String gender;
    @Column(length= 10000)
    private String about;

    //PROVIDER
    @Builder.Default
    private Providers provider = Providers.SELF;
    private String providerId;

    // mapping(mappedBy: owning entity,
    // Cascade: CascadeType.ALL means if a user is deleted all its contacts get deleted,
    // fetch = FetchType.Lazy means when requesting user obj we do not query db for the contacts unless its required, 
    // orphan removal removes the entities with no ownership)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<Contact> contacts = new ArrayList<>();

}
