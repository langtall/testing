/*
 * 17.12.2012 J.Arrasz
 */
package com.mvhtesting.charts.service.impl;

import com.mvhtesting.charts.domain.Song;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Joachim Arrasz <arrasz@synyx.de>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SongServiceImplTest {
    
    public SongServiceImplTest() {
    }

    /**
     * Test of findById method, of class SongServiceImpl.
     */
    @Test
    public void testCreateSong() {
        System.out.println("CreateSong");
        Integer id = null;
        SongServiceImpl instance = new SongServiceImpl();
        Song expResult = null;
        Song result = instance.findById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}
