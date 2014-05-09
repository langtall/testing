package com.mvhtesting.charts.domain;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
@Entity
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinTable(
        name = "SONGTOARTISTS", joinColumns = { @JoinColumn(name = "ID") },
        inverseJoinColumns = { @JoinColumn(name = "ID") }
    )
    private Set<Artist> artists;
    @OneToOne
    private Title title;

    public Song(Set<Artist> artists, Title title) {

        this.artists = artists;
        this.title = title;
    }

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public Set<Artist> getArtists() {

        return artists;
    }


    public void setArtists(Set<Artist> artists) {

        this.artists = artists;
    }


    public Title getTitle() {

        return title;
    }


    public void setTitle(Title title) {

        this.title = title;
    }
}
