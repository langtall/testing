package com.mvhtesting.charts.service.impl;

import com.mvhtesting.charts.dao.SongDao;
import com.mvhtesting.charts.domain.Song;
import com.mvhtesting.charts.service.SongService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public class SongServiceImpl implements SongService {

    private static final Log LOG = LogFactory.getLog(SongServiceImpl.class);

    @Autowired
    private SongDao songDao;

    @PersistenceContext
    private EntityManager em;

    @Override
    public Song findById(Integer id) {

        return songDao.findById(id);
    }
}
