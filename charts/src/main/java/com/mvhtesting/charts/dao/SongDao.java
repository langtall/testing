package com.mvhtesting.charts.dao;

import com.mvhtesting.charts.domain.Song;

import org.springframework.data.repository.CrudRepository;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public interface SongDao extends CrudRepository<Song, Integer> {

    Song findById(Integer songId);
}
