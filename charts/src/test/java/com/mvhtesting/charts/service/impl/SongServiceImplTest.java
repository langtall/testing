package com.mvhtesting.charts.service.impl;

import com.mvhtesting.charts.dao.SongDao;
import com.mvhtesting.charts.domain.Artist;
import com.mvhtesting.charts.domain.Song;
import com.mvhtesting.charts.domain.Title;
import com.mvhtesting.charts.service.SongService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashSet;


/**
 * @author  Marius van Herpen - mvanherpen@contargo.net
 */
public class SongServiceImplTest {

    private SongService songService;

    private Song song;

    @Before
    public void setup() {

        SongDao mockDao = Mockito.mock(SongDao.class);

        Artist artist = new Artist("artist");
        Title title = new Title("title");

        song = new Song(new HashSet<Artist>(Arrays.asList(artist)), title);

        Mockito.when(mockDao.save(song)).thenReturn(song);

        songService = new SongServiceImpl(mockDao);
    }


    @Test
    public void testSaveSong() {

        Song result;

        result = songService.saveSong(song);

        Assert.assertEquals(result, song);
    }
}
