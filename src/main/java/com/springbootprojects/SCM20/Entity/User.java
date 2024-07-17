package com.springbootprojects.SCM20.Entity;

import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    private String userId;
    private String password;
    private String fullName;
    private String email;
    // for things like isAdmin? isEnabled? isVerified? 
    private HashMap<String,Boolean> attributes; 
    private String profilePic;
    private String gender;

    //PROVIDER
    private Providers provider = Providers.SELF;

}
