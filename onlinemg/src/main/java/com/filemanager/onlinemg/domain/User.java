package com.filemanager.onlinemg.domain;


import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {

    @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;

    private String name;
    private String userpic;

    // private String Password;

    private String email;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getPassword() {
    //      return Password;
    //   }

    //   public void setPassword(String password) {
    //      Password = password;
    //  }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
