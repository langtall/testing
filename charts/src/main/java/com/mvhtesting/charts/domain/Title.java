package com.mvhtesting.charts.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
@Entity
public class Title implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Title() {
    }


    public Title(String title) {

        this.name = title;
    }

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }
}
