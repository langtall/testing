package com.mvhtesting.charts.service.impl;

import com.mvhtesting.charts.dao.SongDao;
import com.mvhtesting.charts.domain.Song;
import com.mvhtesting.charts.service.SongService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public class SongServiceImpl implements SongService {

    private static final Log LOG = LogFactory.getLog(SongServiceImpl.class);

    private final SongDao songDao;

    @Autowired
    public SongServiceImpl(SongDao songDao) {

        this.songDao = songDao;
    }

    @Override
    public Song findById(Integer id) {

        return songDao.findById(id);
    }


    @Override
    public Song saveSong(Song song) {

        return songDao.save(song);
    }
}
