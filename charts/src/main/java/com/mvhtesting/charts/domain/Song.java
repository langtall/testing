package com.mvhtesting.charts.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
@Entity
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Artist artist;
    @OneToOne
    private Title title;

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public Artist getArtist() {

        return artist;
    }


    public void setArtist(Artist artist) {

        this.artist = artist;
    }


    public Title getTitle() {

        return title;
    }


    public void setTitle(Title title) {

        this.title = title;
    }
}
