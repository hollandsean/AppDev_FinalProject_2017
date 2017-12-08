package com.AppDevFinalProject.PhilliesFlowers.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bundle 
{
	@Id
	Integer id;
	String name;
	String flowers;
	String chocolate;
	String specialItem;
	Integer price;
	
	public Bundle(Integer id, String name, String flowers, String chocolate, String specialItem, Integer price)
	{
		this.id = id;
		this.name = name;
		this.flowers = flowers;
		this.chocolate = chocolate;
		this.specialItem = specialItem;
		this.price = price;
	}
	
	public void setID(Integer id) 
	{
       this.id = id;
    }
    public Integer getID() 
    {
       return id;
    }
	
	public void setName(String name) 
	{
       this.name = name;
    }
    public String getName() 
    {
       return name;
    }
    
    public void setFlowers(String flowers) 
	{
       this.flowers = flowers;
    }

    public String getFlowers() 
    {
       return flowers;
    }
    
    public void setChocolate(String chocolate) 
	{
       this.chocolate = chocolate;
    }
    public String getChocolate() 
    {
       return chocolate;
    }
    
    public void setSspecialItem(String specialItem) 
	{
       this.specialItem = specialItem;
    }
    public String getSpecialItem() 
    {
       return specialItem;
    }
    
    public void setPrice(Integer price) 
	{
       this.price = price;
    }
    public Integer getPrice() 
    {
       return price;
    }

}
