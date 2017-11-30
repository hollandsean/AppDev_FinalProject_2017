package com.AppDevFinalProject.PhilliesFlowers.dataloaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.AppDevFinalProject.PhilliesFlowers.entities.Bundle;
import com.AppDevFinalProject.PhilliesFlowers.repositories.BundleRepo;

//ApplicationRunner is run before after the beans have been created and the application
//context has been completed.
//@Component makes it a bean so it is "seen" by Spring
@Component // ensures this is run because it is a bean
public class Dataloader implements ApplicationRunner
{
	@Autowired // Find a PersonRepo bean and autowire it into personRepo
	BundleRepo bundleRepo;
	@Override
	public void run(ApplicationArguments arg0) throws Exception
	{	
		bundleRepo.save(new Bundle(1, "Valentines","Roses", "Chocolate Hearts", "Valentines Card", 50));
		bundleRepo.save(new Bundle(2, "Christmas","Holly", "Chocolate Santa", "Christmas Card", 35));
		bundleRepo.save(new Bundle(3, "Easter","Lilys", "Easter Egg", "Easter Bunny Teddy", 25));
	}
}

