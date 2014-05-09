package com.mvhtesting.charts.service;

import com.mvhtesting.charts.domain.Song;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public interface SongService {

    Song findById(Integer id);


    Song saveSong(Song song);
}
