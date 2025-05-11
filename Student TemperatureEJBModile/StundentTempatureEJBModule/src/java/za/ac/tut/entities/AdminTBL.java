/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author karabol7
 */
@Entity
public class AdminTBL implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      
    
    @Column(name = "NAME", nullable = false, length = 20)
    private String name;
    
    @Column(name = "SURNAME", nullable = false, length = 20)
    private String surname;
    
    @Column(name = "PASSWORD",nullable = false)
    private String password;

    @Column(name = "CONTACTS", nullable = false, length = 10)
    private String contact;
    
    @Column(name = "EMAIL", unique = true)
    private String email;
    
    public AdminTBL() {
    }

    public AdminTBL(Long id, String staffNumber, String name, String surname, String password, String contact, String email) {
        this.id = id;
        
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.contact = contact;
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTBL)) {
            return false;
        }
        AdminTBL other = (AdminTBL) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.AdminTBL[ id=" + id + " ]";
    }
    
}
