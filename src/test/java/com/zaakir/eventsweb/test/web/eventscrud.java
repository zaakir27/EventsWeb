/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.eventsweb.test.web;

import com.zaakir.eventsweb.app.conf.ConnectionConfig;
import com.zaakir.eventsweb.domain.attendee.AttendeeImpl;
import com.zaakir.eventsweb.domain.events.BMW;
import com.zaakir.eventsweb.domain.events.ChrisBrown;
import com.zaakir.eventsweb.domain.events.JellyTots;
import com.zaakir.eventsweb.domain.events.Sound;
import com.zaakir.eventsweb.domain.events.Speed;
import com.zaakir.eventsweb.domain.events.Toyota;
import com.zaakir.eventsweb.domain.events.Waves;
import com.zaakir.eventsweb.domain.planners.BeachPlanner;
import com.zaakir.eventsweb.domain.planners.CelebPlanner;
import com.zaakir.eventsweb.domain.planners.ClubPlanner;
import com.zaakir.eventsweb.domain.planners.HousePlanner;
import com.zaakir.eventsweb.repository.AttendeeRepo;
import com.zaakir.eventsweb.repository.BMWRepo;
import com.zaakir.eventsweb.repository.BeachPlannerRepo;
import com.zaakir.eventsweb.repository.CelebPlannerRepo;
import com.zaakir.eventsweb.repository.ChrisBrownRepo;
import com.zaakir.eventsweb.repository.ClubPlannerRepo;
import com.zaakir.eventsweb.repository.HousePlannerRepo;
import com.zaakir.eventsweb.repository.JellyTotsRepo;
import com.zaakir.eventsweb.repository.SoundRepo;
import com.zaakir.eventsweb.repository.SpeedRepo;
import com.zaakir.eventsweb.repository.ToyotaRepo;
import com.zaakir.eventsweb.repository.WavesRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Zaakir
 */
public class eventscrud {
    
     public static ApplicationContext ctx;
    private Long id;
    private AttendeeRepo repo;
    private BMWRepo repoBMW;
    private BeachPlannerRepo repoBeach;
    private CelebPlannerRepo repoCeleb;
    private ChrisBrownRepo repoChrisBrown;
    private ClubPlannerRepo repoClub;
    private HousePlannerRepo repoHouse;
    private JellyTotsRepo repoJellyTots;
    private SoundRepo repoSound;
    private SpeedRepo repoSpeed;
    private ToyotaRepo repoToyota;
    private WavesRepo repoWaves;
    
    
    public eventscrud() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
 
    @Test
     public void createAttendee() {
         repo = ctx.getBean(AttendeeRepo.class);
         AttendeeImpl p = new AttendeeImpl.Builder("159")
                 .name("zaakir")
                 .surname("arendse")
                 .build();
         repo.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
    public void createBMW() {
         repoBMW = ctx.getBean(BMWRepo.class);
         BMW p = new BMW.Builder().location("canal walk").build();
         
         repoBMW.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
   
    @Test
    public void createChrisBrown() {
         repoChrisBrown = ctx.getBean(ChrisBrownRepo.class);
         ChrisBrown p = new ChrisBrown.Builder().location("canal walk").build();
         
         repoChrisBrown.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    
    @Test
    public void createJellyTots() {
         repoJellyTots = ctx.getBean(JellyTotsRepo.class);
         JellyTots p = new JellyTots.Builder().location("canal walk").build();
         
         repoJellyTots.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }



//    private WavesRepo repoWaves;
    
    @Test
    public void createSound() {
         repoSound = ctx.getBean(SoundRepo.class);
         Sound p = new Sound.Builder().location("canal walk").build();
         
         repoSound.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
    public void createSpeed() {
         repoSpeed = ctx.getBean(SpeedRepo.class);
         Speed p = new Speed.Builder().location("canal walk").build();
         
         repoSpeed.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
    public void createToyota() {
         repoToyota = ctx.getBean(ToyotaRepo.class);
         Toyota p = new Toyota.Builder().location("canal walk").build();
         
         repoToyota.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
    public void createWaves() {
         repoWaves = ctx.getBean(WavesRepo.class);
         Waves p = new Waves.Builder().location("canal walk").build();
         
         repoWaves.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
     public void createBeach() {
         repoBeach = ctx.getBean(BeachPlannerRepo.class);
         BeachPlanner p = new BeachPlanner.Builder().name("tommy").build();
         
         repoBeach.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    
    @Test
     public void createCelebPlanner() {
         repoCeleb = ctx.getBean(CelebPlannerRepo.class);
         CelebPlanner p = new CelebPlanner.Builder().name("tommy").build();
         
         repoCeleb.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }
    

@Test
     public void createClubPlanner() {
         repoClub = ctx.getBean(ClubPlannerRepo.class);
         ClubPlanner p = new ClubPlanner.Builder().name("tommy").build();
         
         repoClub.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }

@Test
     public void createHousePlanner() {
         repoHouse = ctx.getBean(HousePlannerRepo.class);
         HousePlanner p = new HousePlanner.Builder().name("tommy").build();
         
         repoHouse.save(p);
       //  id = p.getAdmit();
         Assert.assertNotNull(p);     
     }

    
    @Test(dependsOnMethods = "createAttendee")
     public void readAttendee(){
         repo = ctx.getBean(AttendeeRepo.class);
         AttendeeImpl obj = repo.findOne(id);
         Assert.assertEquals(obj.getName(), "zaakir");
         
     }
     
    @Test(dependsOnMethods = "readAttendee")
     private void updateAttendee(){
         repo = ctx.getBean(AttendeeRepo.class);
         AttendeeImpl p = new AttendeeImpl.Builder("789")
                 .name("chuck")
                 .surname("arendse")
                 .build();
        
         repo.save(p);
         
         Assert.assertEquals(p.getName(), "chuck");
         
     }
     
    @Test(dependsOnMethods = "updateAttendee")
     private void deleteAttendee(){
         repo = ctx.getBean(AttendeeRepo.class);
         AttendeeImpl obj = repo.findOne(id);
         repo.delete(obj);
         
         AttendeeImpl p = repo.findOne(id);
         
         Assert.assertNull(p);
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
