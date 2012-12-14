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
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer position;

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public Integer getPosition() {

        return position;
    }


    public void setPosition(Integer position) {

        this.position = position;
    }
}
