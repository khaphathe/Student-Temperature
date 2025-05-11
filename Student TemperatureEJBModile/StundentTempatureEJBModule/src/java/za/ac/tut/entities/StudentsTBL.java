/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author BALOYI HOLANI
 */
@Entity
public class StudentsTBL implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "STUDENT_NUMBER", length = 9)
    private Long id;
    
    
    
    @Column(name = "FIRST_NAME", nullable = false, length = 9)
    private String name;
    
    @Column(name = "LAST_NAME", nullable = false, length = 9)
    private String surname;
    
    @Column(name = "GENDER", nullable = false, length = 9)
    private String gender;
    
    @Column(name = "TEMPERATURE", nullable = false, length = 9)
    private Double temperature;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;

    public StudentsTBL() {
    }

    public StudentsTBL(Long id, String name, String surname, String gender,Double temperature, Date creationDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.temperature = temperature;
        this.creationDate = creationDate;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
        if (!(object instanceof StudentsTBL)) {
            return false;
        }
        StudentsTBL other = (StudentsTBL) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.StudentsTBL[ id=" + id + " ]";
    }

    public void setStudentNumber(String studentNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}
