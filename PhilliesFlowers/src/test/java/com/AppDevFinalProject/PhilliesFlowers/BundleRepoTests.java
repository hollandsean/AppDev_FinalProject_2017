package com.AppDevFinalProject.PhilliesFlowers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.AppDevFinalProject.PhilliesFlowers.entities.Bundle;
import com.AppDevFinalProject.PhilliesFlowers.repositories.BundleRepo;



@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD)
public class BundleRepoTests {

	@Autowired
	private BundleRepo bundleRepo;
	
	@Test
	public void getMongo(){
		Bundle b = bundleRepo.findOne(1);
		assertEquals("Valentines", b.getName());
	}
	
	@Test
	public void allMongo(){
		List<Bundle> bundles = bundleRepo.findAll();
		assertEquals(3, bundles.size());
	}
}
