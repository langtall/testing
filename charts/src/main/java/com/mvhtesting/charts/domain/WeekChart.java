package com.mvhtesting.charts.domain;

import java.io.Serializable;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
@Entity
public class WeekChart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private WeekYear weekYear;

    @JoinTable(name = "POSITIONTOSONG")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @MapKeyColumn(name = "POSITION")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Position, Song> songPosition;

    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public WeekYear getWeekYear() {

        return weekYear;
    }


    public void setWeekYear(WeekYear weekYear) {

        this.weekYear = weekYear;
    }


    public Map<Position, Song> getSongPosition() {

        return songPosition;
    }


    public void setSongPosition(Map<Position, Song> songPosition) {

        this.songPosition = songPosition;
    }
}
