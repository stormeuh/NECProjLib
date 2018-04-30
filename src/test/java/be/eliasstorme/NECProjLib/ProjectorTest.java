package be.eliasstorme.NECProjLib;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elias on 26/03/18.
 */
public class ProjectorTest {

    @Test
    public void testConstructor() throws Exception{
        new Projector("localhost");
    }
}