package com.MoviesHub.MoviesHub.user;

import javax.persistence.Id;

public class User {

    @Id
    private Long id;
    private String name;
    private String password;
    private boolean isAdmin;

}
