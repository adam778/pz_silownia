package Bazadanych;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder

public class Slownik_Sprzetu {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    private String nazwasprzetu;

    Slownik_Sprzetu(String nazwasprzetu){
        this.nazwasprzetu = nazwasprzetu;
    }

    protected Slownik_Sprzetu(){};

}
