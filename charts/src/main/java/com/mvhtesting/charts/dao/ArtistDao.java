package com.mvhtesting.charts.dao;

import com.mvhtesting.charts.domain.Artist;

import org.springframework.data.repository.CrudRepository;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public interface ArtistDao extends CrudRepository<Artist, Integer> {

    Artist findById(Integer artistId);
}
